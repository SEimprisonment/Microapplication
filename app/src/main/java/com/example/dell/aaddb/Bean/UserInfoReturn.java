package com.example.dell.aaddb.Bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by DELL on 2018/7/13.
 */

public class UserInfoReturn implements Serializable {

    /**
     * ContractRoot : {"svcCont":{"respInfo":{"code":"000","crmRoles":{"commonRegioType":"1000","commonRegionId":"500181403","employTele":"11101165","employeeDepartmentsName":"集团公司","employeeName":"葛静明","orgID":"1944640","rolesLists":[{"rolesID":"1350","rolesName":"客户经理"}]},"deptId":"626","eff_date":"20180713162414394","head_portrait_url":"http://42.99.16.145:19491/1/mphotos/2/136109.png","industry_items":"集团总部/政企客户事业部/综合调度中心","is_bind":"","login_Name":"gejm","msg":"成功","orgType":"1000","passWord":"","phone":"11170162273","position":"政企事业部领导","proO":"","result":"0","roles":[],"ticket":"6a09a07d-e1dd-449b-9180-848a3ef9b49e","userName":"葛静明","user_id":"136109"}},"tcpCont":{"resultCode":"0","resultDesc":"成功","timeStamp":"20180713162414"}}
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
         * svcCont : {"respInfo":{"code":"000","crmRoles":{"commonRegioType":"1000","commonRegionId":"500181403","employTele":"11101165","employeeDepartmentsName":"集团公司","employeeName":"葛静明","orgID":"1944640","rolesLists":[{"rolesID":"1350","rolesName":"客户经理"}]},"deptId":"626","eff_date":"20180713162414394","head_portrait_url":"http://42.99.16.145:19491/1/mphotos/2/136109.png","industry_items":"集团总部/政企客户事业部/综合调度中心","is_bind":"","login_Name":"gejm","msg":"成功","orgType":"1000","passWord":"","phone":"11170162273","position":"政企事业部领导","proO":"","result":"0","roles":[],"ticket":"6a09a07d-e1dd-449b-9180-848a3ef9b49e","userName":"葛静明","user_id":"136109"}}
         * tcpCont : {"resultCode":"0","resultDesc":"成功","timeStamp":"20180713162414"}
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
             * respInfo : {"code":"000","crmRoles":{"commonRegioType":"1000","commonRegionId":"500181403","employTele":"11101165","employeeDepartmentsName":"集团公司","employeeName":"葛静明","orgID":"1944640","rolesLists":[{"rolesID":"1350","rolesName":"客户经理"}]},"deptId":"626","eff_date":"20180713162414394","head_portrait_url":"http://42.99.16.145:19491/1/mphotos/2/136109.png","industry_items":"集团总部/政企客户事业部/综合调度中心","is_bind":"","login_Name":"gejm","msg":"成功","orgType":"1000","passWord":"","phone":"11170162273","position":"政企事业部领导","proO":"","result":"0","roles":[],"ticket":"6a09a07d-e1dd-449b-9180-848a3ef9b49e","userName":"葛静明","user_id":"136109"}
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
                 * code : 000
                 * crmRoles : {"commonRegioType":"1000","commonRegionId":"500181403","employTele":"11101165","employeeDepartmentsName":"集团公司","employeeName":"葛静明","orgID":"1944640","rolesLists":[{"rolesID":"1350","rolesName":"客户经理"}]}
                 * deptId : 626
                 * eff_date : 20180713162414394
                 * head_portrait_url : http://42.99.16.145:19491/1/mphotos/2/136109.png
                 * industry_items : 集团总部/政企客户事业部/综合调度中心
                 * is_bind :
                 * login_Name : gejm
                 * msg : 成功
                 * orgType : 1000
                 * passWord :
                 * phone : 11170162273
                 * position : 政企事业部领导
                 * proO :
                 * result : 0
                 * roles : []
                 * ticket : 6a09a07d-e1dd-449b-9180-848a3ef9b49e
                 * userName : 葛静明
                 * user_id : 136109
                 */

                private String code;
                private CrmRolesBean crmRoles;
                private String deptId;
                private String eff_date;
                private String head_portrait_url;
                private String industry_items;
                private String is_bind;
                private String login_Name;
                private String msg;
                private String orgType;
                private String passWord;
                private String phone;
                private String position;
                private String proO;
                private String result;
                private String ticket;
                private String userName;
                private String user_id;
                private List<?> roles;

                public String getCode() {
                    return code;
                }

                public void setCode(String code) {
                    this.code = code;
                }

                public CrmRolesBean getCrmRoles() {
                    return crmRoles;
                }

                public void setCrmRoles(CrmRolesBean crmRoles) {
                    this.crmRoles = crmRoles;
                }

                public String getDeptId() {
                    return deptId;
                }

                public void setDeptId(String deptId) {
                    this.deptId = deptId;
                }

                public String getEff_date() {
                    return eff_date;
                }

                public void setEff_date(String eff_date) {
                    this.eff_date = eff_date;
                }

                public String getHead_portrait_url() {
                    return head_portrait_url;
                }

                public void setHead_portrait_url(String head_portrait_url) {
                    this.head_portrait_url = head_portrait_url;
                }

                public String getIndustry_items() {
                    return industry_items;
                }

                public void setIndustry_items(String industry_items) {
                    this.industry_items = industry_items;
                }

                public String getIs_bind() {
                    return is_bind;
                }

                public void setIs_bind(String is_bind) {
                    this.is_bind = is_bind;
                }

                public String getLogin_Name() {
                    return login_Name;
                }

                public void setLogin_Name(String login_Name) {
                    this.login_Name = login_Name;
                }

                public String getMsg() {
                    return msg;
                }

                public void setMsg(String msg) {
                    this.msg = msg;
                }

                public String getOrgType() {
                    return orgType;
                }

                public void setOrgType(String orgType) {
                    this.orgType = orgType;
                }

                public String getPassWord() {
                    return passWord;
                }

                public void setPassWord(String passWord) {
                    this.passWord = passWord;
                }

                public String getPhone() {
                    return phone;
                }

                public void setPhone(String phone) {
                    this.phone = phone;
                }

                public String getPosition() {
                    return position;
                }

                public void setPosition(String position) {
                    this.position = position;
                }

                public String getProO() {
                    return proO;
                }

                public void setProO(String proO) {
                    this.proO = proO;
                }

                public String getResult() {
                    return result;
                }

                public void setResult(String result) {
                    this.result = result;
                }

                public String getTicket() {
                    return ticket;
                }

                public void setTicket(String ticket) {
                    this.ticket = ticket;
                }

                public String getUserName() {
                    return userName;
                }

                public void setUserName(String userName) {
                    this.userName = userName;
                }

                public String getUser_id() {
                    return user_id;
                }

                public void setUser_id(String user_id) {
                    this.user_id = user_id;
                }

                public List<?> getRoles() {
                    return roles;
                }

                public void setRoles(List<?> roles) {
                    this.roles = roles;
                }

                public static class CrmRolesBean {
                    /**
                     * commonRegioType : 1000
                     * commonRegionId : 500181403
                     * employTele : 11101165
                     * employeeDepartmentsName : 集团公司
                     * employeeName : 葛静明
                     * orgID : 1944640
                     * rolesLists : [{"rolesID":"1350","rolesName":"客户经理"}]
                     */

                    private String commonRegioType;
                    private String commonRegionId;
                    private String employTele;
                    private String employeeDepartmentsName;
                    private String employeeName;
                    private String orgID;
                    private List<RolesListsBean> rolesLists;

                    public String getCommonRegioType() {
                        return commonRegioType;
                    }

                    public void setCommonRegioType(String commonRegioType) {
                        this.commonRegioType = commonRegioType;
                    }

                    public String getCommonRegionId() {
                        return commonRegionId;
                    }

                    public void setCommonRegionId(String commonRegionId) {
                        this.commonRegionId = commonRegionId;
                    }

                    public String getEmployTele() {
                        return employTele;
                    }

                    public void setEmployTele(String employTele) {
                        this.employTele = employTele;
                    }

                    public String getEmployeeDepartmentsName() {
                        return employeeDepartmentsName;
                    }

                    public void setEmployeeDepartmentsName(String employeeDepartmentsName) {
                        this.employeeDepartmentsName = employeeDepartmentsName;
                    }

                    public String getEmployeeName() {
                        return employeeName;
                    }

                    public void setEmployeeName(String employeeName) {
                        this.employeeName = employeeName;
                    }

                    public String getOrgID() {
                        return orgID;
                    }

                    public void setOrgID(String orgID) {
                        this.orgID = orgID;
                    }

                    public List<RolesListsBean> getRolesLists() {
                        return rolesLists;
                    }

                    public void setRolesLists(List<RolesListsBean> rolesLists) {
                        this.rolesLists = rolesLists;
                    }

                    public static class RolesListsBean {
                        /**
                         * rolesID : 1350
                         * rolesName : 客户经理
                         */

                        private String rolesID;
                        private String rolesName;

                        public String getRolesID() {
                            return rolesID;
                        }

                        public void setRolesID(String rolesID) {
                            this.rolesID = rolesID;
                        }

                        public String getRolesName() {
                            return rolesName;
                        }

                        public void setRolesName(String rolesName) {
                            this.rolesName = rolesName;
                        }
                    }
                }
            }
        }

        public static class TcpContBean {
            /**
             * resultCode : 0
             * resultDesc : 成功
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
