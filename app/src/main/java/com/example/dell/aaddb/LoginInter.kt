package com.example.dell.aaddb

import com.example.dell.aaddb.Bean.UserInfoReturn

/**
 * Created by DELL on 2018/7/13.
 */
interface LoginInter {

    fun CallBack(req: UserInfoReturn.ContractRootBean.SvcContBean.RespInfoBean)

    fun CallErr(msg: String)

}