package com.example.dell.aaddb
import com.example.dell.aaddb.Bean.*
import com.example.dell.aaddb.Utils.JSONUtil
import com.example.dell.aaddb.Utils.L
import org.xutils.common.Callback
import org.xutils.http.RequestParams
import org.xutils.x

/**
 * Created by DELL on 2018/7/13.
 */
class LoginPresent(val loginInter : LoginInter) {

    fun LoginStart(name:String , pass : String){
        val loginReq  = LoginReq(name , pass)
        val commReq = CommonRequest()
        commReq.setBusCode("OPP10207")
        commReq.setTimeStamp("20161129111817")
        commReq.setTransactionID("")
        commReq.setRequestBean(loginReq)
        val url = "http://42.99.16.145:56000/apptc/ws/jsonXml?jsonString="+ JSONUtil<String , CommonRequest>().ObjectToJsonStr(commReq)
        L.wu("登陆请求= " + url)
        x.http().get(RequestParams(url) , object: Callback.CommonCallback<String>{
            override fun onCancelled(cex: Callback.CancelledException?) {

            }

            override fun onSuccess(result: String?) {
                L.wu("登陆返回= " + result)
                var loginReturn = JSONUtil<String , LoginReturn>().JsonStrToObject(result , LoginReturn::class.java)
                if (loginReturn.contractRoot.svcCont.respInfo.code == "000"){
                    UserInfo(name)
                }else{
                    loginInter.CallErr("账号或密码错误，请重新是输入")
                }
            }

            override fun onFinished() {
            }

            override fun onError(ex: Throwable?, isOnCallback: Boolean) {
            }
        })
    }

    fun UserInfo(name:String ){
        val userinfo = YonghuLoginReq()
        userinfo.passWord = ""
        userinfo.userName = name
        userinfo.loginCode = "1"
        userinfo.phoneModel = ""
        userinfo.systemNumber = ""
        userinfo.versionNumber = ""
        userinfo.versionIdentifier = ""

        val commReq = CommonRequest()
        commReq.setBusCode("OPP10172")
        commReq.setTimeStamp("20161129111817")
        commReq.setTransactionID("")
        commReq.setRequestBean(userinfo)
        val url = "http://42.99.16.145:56000/apptc/ws/jsonXml?jsonString="+ JSONUtil<String , CommonRequest>().ObjectToJsonStr(commReq)
        x.http().get(RequestParams(url) , object :Callback.CommonCallback<String>{
            override fun onSuccess(result: String?) {
                L.wu("请求用户信息返回=- " + result)
                val userinfo = JSONUtil<String , UserInfoReturn>().JsonStrToObject(result , UserInfoReturn::class.java)
                if (userinfo.contractRoot.svcCont.respInfo.code == "000"){
                    loginInter.CallBack(userinfo.contractRoot.svcCont.respInfo)

                }else{
                    loginInter.CallErr("个人信息请求失败，请重新登陆")
                }
            }

            override fun onFinished() {
            }

            override fun onError(ex: Throwable?, isOnCallback: Boolean) {
            }

            override fun onCancelled(cex: Callback.CancelledException?) {
            }

        })
    }
}