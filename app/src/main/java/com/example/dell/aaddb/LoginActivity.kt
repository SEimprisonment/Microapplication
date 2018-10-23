package com.example.dell.aaddb

import android.content.Intent
import com.example.dell.aaddb.Bean.UserInfoReturn
import com.example.dell.aaddb.Utils.MD5Helper
import com.example.dell.aaddb.Utils.PreferenceUtils
import com.qmuiteam.qmui.widget.dialog.QMUITipDialog
import kotlinx.android.synthetic.main.activity_login.*
/**
 * Created by DELL on 2018/7/13.
 */
class LoginActivity: BaseActivity() , LoginInter {

    private lateinit var loginPresen:LoginPresent
    override fun setContentId(): Int= R.layout.activity_login
    private lateinit var tipDialog: QMUITipDialog

    override fun initView() {
        loginPresen = LoginPresent(this)
    }

    override fun initData() {
        if (PreferenceUtils.getUserName(LoginActivity@this) != "" && PreferenceUtils.getPassword(LoginActivity@this) != ""){
            user_name.setText(PreferenceUtils.getUserName(LoginActivity@this))
            user_password.setText(PreferenceUtils.getPassword(LoginActivity@this))
        }
    }
    override fun CallBack(req: UserInfoReturn.ContractRootBean.SvcContBean.RespInfoBean) {
        tipDialog.dismiss()

        var intent = Intent(LoginActivity@this , WorkActivity::class.java)
        intent.putExtra("loginName" , req.user_id)
        intent.putExtra("sysName" , req.login_Name)
        intent.putExtra("userName" , req.userName)
        startActivity(intent)

        PreferenceUtils.putUserName(LoginActivity@this , user_name.text.toString())
        PreferenceUtils.putPasssord(LoginActivity@this , user_password.text.toString())

        tipDialog = QMUITipDialog.Builder(this)
                .setIconType(QMUITipDialog.Builder.ICON_TYPE_SUCCESS)
                .setTipWord("登录成功")
                .create()
        tipDialog.show()
        button_login.postDelayed({
            tipDialog.dismiss()
            finish()
        }, 1500)
    }

    override fun CallErr(msg: String) {
        showMessage(msg)
        tipDialog.dismiss()
    }

    override fun initListener() {
        button_login.setOnClickListener {
            when{
                user_name.text.toString() =="" -> showMessage("用户名不能为空")

                user_password.text.toString() == "" -> showMessage("登陆密码不能为空")

                else -> Login(user_name.text.toString() , user_password.text.toString())
            }
        }
        button_delete.setOnClickListener{
            user_name.setText("")
            user_password.setText("")
            PreferenceUtils.putUserName(LoginActivity@this , "")
            PreferenceUtils.putPasssord(LoginActivity@this , "")
        }
    }

    override fun loadData() {

    }

    fun Login( name : String , password : String ){
        tipDialog = QMUITipDialog.Builder(this)
                .setIconType(QMUITipDialog.Builder.ICON_TYPE_LOADING)
                .setTipWord("正在加载")
                .create()
        tipDialog.show()
        loginPresen.LoginStart(name , MD5Helper.MD5Encode(password))
    }
}