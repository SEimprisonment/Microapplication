package com.example.dell.aaddb.Bean;

/**
 * Created by DELL on 2018/7/13.
 */

public class YonghuLoginReq extends ReqInfoBean {
    private String UserName;
    private String PassWord;
    private String PhoneModel;
    private String LoginCode;
    private String VersionNumber;
    private String SystemNumber;
    private String VersionIdentifier;


    public String getVersionNumber() {
        return VersionNumber;
    }

    public void setVersionNumber(String versionNumber) {
        VersionNumber = versionNumber;
    }

    public String getSystemNumber() {
        return SystemNumber;
    }

    public void setSystemNumber(String systemNumber) {
        SystemNumber = systemNumber;
    }

    public String getVersionIdentifier() {
        return VersionIdentifier;
    }

    public void setVersionIdentifier(String versionIdentifier) {
        VersionIdentifier = versionIdentifier;
    }

    public String getLoginCode() {
        return LoginCode;
    }

    public void setLoginCode(String loginCode) {
        LoginCode = loginCode;
    }

    public String getPhoneModel() {
        return PhoneModel;
    }

    public void setPhoneModel(String phoneModel) {
        PhoneModel = phoneModel;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }
}
