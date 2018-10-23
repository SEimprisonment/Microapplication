package com.example.dell.aaddb

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import com.example.dell.aaddb.Bean.CommonUseListBean
import com.example.dell.aaddb.Bean.CommonUserListResBean
import com.example.dell.aaddb.Bean.Item
import com.example.dell.aaddb.Bean.ThreadsReturn
import com.example.dell.aaddb.Utils.JSONUtil
import com.example.dell.aaddb.Utils.L
import com.example.dell.aaddb.Utils.MD5Helper
import kotlinx.android.synthetic.main.activity_work.*
import org.xutils.common.Callback
import org.xutils.http.RequestParams
import org.xutils.x
import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by DELL on 2018/7/16.
 */
class WorkActivity :BaseActivity() {
    lateinit var dates: List<Item>
     var itemKanshu :Item? = null
     var itemKehu :Item? = null
    private lateinit var loginName : String
    private lateinit var sysName : String
    private lateinit var userName:String
    override fun setContentId(): Int = R.layout.activity_work
    private lateinit var content:Context
    @SuppressLint("SetTextI18n")
    override fun initView() {
        content = WorkActivity@this

        loginName = intent.getStringExtra("loginName")
        sysName = intent.getStringExtra("sysName")
        userName = intent.getStringExtra("userName")
        text_user.text = "登录名 = $userName\n登陆账号= $sysName\n用户ID = $loginName"

        val url = "http://42.99.16.145:56000/app/services/third/commonUseList"
        var req = RequestParams(url)
        req.isAsJsonContent = true
        req.bodyContent = getCommonUseList()
        x.http().post(req ,object : Callback.CommonCallback<String>{
            override fun onFinished() {

            }
            override fun onSuccess(result: String?) {
                L.wu("常用列表返回= "+  result)
                val comm = JSONUtil<String , CommonUserListResBean>()
                        .JsonStrToObject(result , CommonUserListResBean::class.java)
                if (comm.resCode == "200"){
                    dates = comm.items
                    for (item in dates){
                        if (item.name == "省内看数"){
                            x.image().bind(image_kanshu , item.imgAddress)
                            itemKanshu = item
                            text1.text = item.name
                        }

                        if (item.name == "客户视图"){
                            x.image().bind(image_kehu , item.imgAddress)
                            itemKehu = item
                            text2.text = item.name
                        }
                    }
                }
            }

            override fun onError(ex: Throwable?, isOnCallback: Boolean) {
                L.wu("错误信息= " + ex?.toString())
            }

            override fun onCancelled(cex: Callback.CancelledException?) {
            }

        })
    }

    override fun initData() {

    }

    override fun initListener() {
        image_kanshu.setOnClickListener {
            startActivity(itemKanshu)
        }

        image_kehu.setOnClickListener {
            startActivity(itemKehu)
        }

        button_delete.setOnClickListener{
            var intent = Intent(WorkActivity@this , LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun loadData() {

    }
    private fun startActivity(item:Item?){
        if (item != null){
            L.wu("childappShowType = " + item.childappShowType)
            if (item.childappShowType == "listPage"){
                var url = item.childappWapaddr
                url = url+ "?appId=" + item.appId + "&staffid="+ loginName +"&osType=1"+
                        "&loginName=" + sysName + "&trajectoryId=113420_12345_20180627104732"
                var intent = Intent(WorkActivity@this ,     WebActivity::class.java)
                intent.putExtra("url" , url)
                startActivity(intent)
            }else{
                getTDes(item.childappWapaddr)
            }
        }
    }

    private fun getTDes(s : String){
        var url = "http://42.99.16.145:56000/SSO_MicroService/ticket/threeDESResult?jobNub=$loginName&loginName=$sysName&trajectoryId=113420_12345_20180627104732"
        x.http().get(RequestParams(url) , object :Callback.CommonCallback<String>{
            override fun onFinished() {
            }

            override fun onCancelled(cex: Callback.CancelledException?) {

            }

            override fun onSuccess(result: String?) {
                L.wu("加密返回的数据= " + result)
                val msg = JSONUtil<String , ThreadsReturn>().JsonStrToObject(result , ThreadsReturn::class.java)
                if (msg.respCode == "200"){
                    val url = s + "?p=" + msg.respMsg
                    val intent = Intent(content , WebActivity::class.java)
                    intent.putExtra("url" , url)
                    startActivity(intent)
                }
            }

            override fun onError(ex: Throwable?, isOnCallback: Boolean) {
            }

        })
    }

    fun getCommonUseList(): String {
        val commonUseListBean = CommonUseListBean()
        val transactionId = getTransactionId("10000004")
        val mobile = loginName
        commonUseListBean.transactionId = transactionId
        commonUseListBean.mobile = mobile
        commonUseListBean.osType = "1"
        val sign = getSign(transactionId, mobile, "123456")
        commonUseListBean.sign = sign
        val jsonStr = JSONUtil<String, CommonUseListBean>().ObjectToJsonStr(commonUseListBean)
        println(jsonStr)

        return jsonStr
    }

    private fun getTransactionId(interfaceCode: String): String {

        var transactionId = ""
        transactionId += interfaceCode
        val date = formatDate("yyyyMMddHHmmss", Date())
        transactionId += date
        var strRand = ""
        for (i in 0..5) {
            strRand += (Math.random() * 10).toInt().toString()
        }
        transactionId += strRand
        return transactionId
    }

    private fun getSign(transactionId: String, mobile: String, key: String): String {
        val sign = "transActionId=$transactionId&mobile=$mobile&key=$key"
        return MD5Helper.MD5Encode(sign)
    }

    private fun formatDate(pattern: String, date: Date?): String {
        var date = date
        val fmt = SimpleDateFormat(pattern)
        if (date == null) {
            date = Date()
        }
        return fmt.format(date)
    }
}