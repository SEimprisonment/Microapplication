package com.example.dell.aaddb.Bean

/**
 * Created by DELL on 2018/7/13.
 */
class LoginReq(
    var UserName: String,
    var PassWord: String
) : ReqInfoBean() {
    var Phone:String  =""
    var SystemID: String = "1212"
    var Code:String = "1"
    var SMSCode: String = ""
    var DLRZ: String = "DLRZ"
    var Ticket: String = ""
}
