package com.example.dell.aaddb.Bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by DELL on 2018/7/13.
 */

public class LoginReturn implements Serializable {

    /**
     * ContractRoot : {"svcCont":{"respInfo":{"abbreviation":"gjm","certNumber":"110108201711154217","code":"000","contactAdderss":"北京","dBPWD":"","eMail":"gejm@chinatelecom.cn","fullPinYin":"gejingming","initials":"g","loginName":"gejm","msg":"登录成功","oldDBPWD":"","partyId":"4048390","phone":"11170162273","result":"0","sex":"男","staffName":"葛静明","statusCd":"1000","userList":[]}},"tcpCont":{"resultCode":"0","resultDesc":"登录成功","timeStamp":"20180713162414"}}
     */

    private ContractRootBean ContractRoot;

    public ContractRootBean getContractRoot() {
        return ContractRoot;
    }

    public void setContractRoot(ContractRootBean ContractRoot) {
        this.ContractRoot = ContractRoot;
    }

    public static class ContractRootBean {
        /**
         * svcCont : {"respInfo":{"abbreviation":"gjm","certNumber":"110108201711154217","code":"000","contactAdderss":"北京","dBPWD":"","eMail":"gejm@chinatelecom.cn","fullPinYin":"gejingming","initials":"g","loginName":"gejm","msg":"登录成功","oldDBPWD":"","partyId":"4048390","phone":"11170162273","result":"0","sex":"男","staffName":"葛静明","statusCd":"1000","userList":[]}}
         * tcpCont : {"resultCode":"0","resultDesc":"登录成功","timeStamp":"20180713162414"}
         */

        private SvcContBean svcCont;
        private TcpContBean tcpCont;

        public SvcContBean getSvcCont() {
            return svcCont;
        }

        public void setSvcCont(SvcContBean svcCont) {
            this.svcCont = svcCont;
        }

        public TcpContBean getTcpCont() {
            return tcpCont;
        }

        public void setTcpCont(TcpContBean tcpCont) {
            this.tcpCont = tcpCont;
        }

        public static class SvcContBean {
            /**
             * respInfo : {"abbreviation":"gjm","certNumber":"110108201711154217","code":"000","contactAdderss":"北京","dBPWD":"","eMail":"gejm@chinatelecom.cn","fullPinYin":"gejingming","initials":"g","loginName":"gejm","msg":"登录成功","oldDBPWD":"","partyId":"4048390","phone":"11170162273","result":"0","sex":"男","staffName":"葛静明","statusCd":"1000","userList":[]}
             */

            private RespInfoBean respInfo;

            public RespInfoBean getRespInfo() {
                return respInfo;
            }

            public void setRespInfo(RespInfoBean respInfo) {
                this.respInfo = respInfo;
            }

            public static class RespInfoBean {
                /**
                 * abbreviation : gjm
                 * certNumber : 110108201711154217
                 * code : 000
                 * contactAdderss : 北京
                 * dBPWD :
                 * eMail : gejm@chinatelecom.cn
                 * fullPinYin : gejingming
                 * initials : g
                 * loginName : gejm
                 * msg : 登录成功
                 * oldDBPWD :
                 * partyId : 4048390
                 * phone : 11170162273
                 * result : 0
                 * sex : 男
                 * staffName : 葛静明
                 * statusCd : 1000
                 * userList : []
                 */

                private String abbreviation;
                private String certNumber;
                private String code;
                private String contactAdderss;
                private String dBPWD;
                private String eMail;
                private String fullPinYin;
                private String initials;
                private String loginName;
                private String msg;
                private String oldDBPWD;
                private String partyId;
                private String phone;
                private String result;
                private String sex;
                private String staffName;
                private String statusCd;
                private List<?> userList;

                public String getAbbreviation() {
                    return abbreviation;
                }

                public void setAbbreviation(String abbreviation) {
                    this.abbreviation = abbreviation;
                }

                public String getCertNumber() {
                    return certNumber;
                }

                public void setCertNumber(String certNumber) {
                    this.certNumber = certNumber;
                }

                public String getCode() {
                    return code;
                }

                public void setCode(String code) {
                    this.code = code;
                }

                public String getContactAdderss() {
                    return contactAdderss;
                }

                public void setContactAdderss(String contactAdderss) {
                    this.contactAdderss = contactAdderss;
                }

                public String getDBPWD() {
                    return dBPWD;
                }

                public void setDBPWD(String dBPWD) {
                    this.dBPWD = dBPWD;
                }

                public String getEMail() {
                    return eMail;
                }

                public void setEMail(String eMail) {
                    this.eMail = eMail;
                }

                public String getFullPinYin() {
                    return fullPinYin;
                }

                public void setFullPinYin(String fullPinYin) {
                    this.fullPinYin = fullPinYin;
                }

                public String getInitials() {
                    return initials;
                }

                public void setInitials(String initials) {
                    this.initials = initials;
                }

                public String getLoginName() {
                    return loginName;
                }

                public void setLoginName(String loginName) {
                    this.loginName = loginName;
                }

                public String getMsg() {
                    return msg;
                }

                public void setMsg(String msg) {
                    this.msg = msg;
                }

                public String getOldDBPWD() {
                    return oldDBPWD;
                }

                public void setOldDBPWD(String oldDBPWD) {
                    this.oldDBPWD = oldDBPWD;
                }

                public String getPartyId() {
                    return partyId;
                }

                public void setPartyId(String partyId) {
                    this.partyId = partyId;
                }

                public String getPhone() {
                    return phone;
                }

                public void setPhone(String phone) {
                    this.phone = phone;
                }

                public String getResult() {
                    return result;
                }

                public void setResult(String result) {
                    this.result = result;
                }

                public String getSex() {
                    return sex;
                }

                public void setSex(String sex) {
                    this.sex = sex;
                }

                public String getStaffName() {
                    return staffName;
                }

                public void setStaffName(String staffName) {
                    this.staffName = staffName;
                }

                public String getStatusCd() {
                    return statusCd;
                }

                public void setStatusCd(String statusCd) {
                    this.statusCd = statusCd;
                }

                public List<?> getUserList() {
                    return userList;
                }

                public void setUserList(List<?> userList) {
                    this.userList = userList;
                }
            }
        }

        public static class TcpContBean {
            /**
             * resultCode : 0
             * resultDesc : 登录成功
             * timeStamp : 20180713162414
             */

            private String resultCode;
            private String resultDesc;
            private String timeStamp;

            public String getResultCode() {
                return resultCode;
            }

            public void setResultCode(String resultCode) {
                this.resultCode = resultCode;
            }

            public String getResultDesc() {
                return resultDesc;
            }

            public void setResultDesc(String resultDesc) {
                this.resultDesc = resultDesc;
            }

            public String getTimeStamp() {
                return timeStamp;
            }

            public void setTimeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
            }
        }
    }
}
