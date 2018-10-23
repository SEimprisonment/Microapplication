package com.example.dell.aaddb.Bean;

import java.io.Serializable;
import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 * Created by DELL on 2018/7/13.
 */

public class CommonRequest implements Serializable {

    /**
     * ContractRoot : {"TcpCont":{"BusCode":"OPP10090","TransactionID":"2017042616581761809","TimeStamp":"20170426165817"},"SvcCont":{"ReqInfo":{"LoginName":"22295","SystemID":"1212","OppId":"2017032122498782"}}}
     */

    private ContractRootBean ContractRoot;

    public ContractRootBean getContractRoot() {
        if (ContractRoot == null) {
            ContractRoot = new ContractRootBean();
        }
        return ContractRoot;
    }

    public static class ContractRootBean implements Serializable {
        /**
         * TcpCont : {"BusCode":"OPP10090","TransactionID":"2017042616581761809","TimeStamp":"20170426165817"}
         * SvcCont : {"ReqInfo":{"LoginName":"22295","SystemID":"1212","OppId":"2017032122498782"}}
         */

        private TcpContBean TcpCont;
        private SvcContBean SvcCont;

        public TcpContBean getTcpCont() {
            if (TcpCont == null) {
                TcpCont = new TcpContBean();
            }
            return TcpCont;
        }

        public SvcContBean getSvcCont() {
            if (SvcCont == null) {
                SvcCont = new SvcContBean();
            }
            return SvcCont;
        }


        public static class TcpContBean implements Serializable  {
            /**
             * BusCode : OPP10090
             * TransactionID : 2017042616581761809
             * TimeStamp : 20170426165817
             */

            private String BusCode;
            private String TransactionID = "";
            private String TimeStamp = "";
            private String ApplyType = "";

            public String getApplyType() {
                return ApplyType;
            }

            public void setApplyType(String applyType) {
                ApplyType = applyType;
            }

            public String getBusCode() {
                return BusCode;
            }

            public void setBusCode(String BusCode) {
                this.BusCode = BusCode;
            }

            public String getTransactionID() {
                return TransactionID;
            }

            public void setTransactionID(String TransactionID) {
                this.TransactionID = TransactionID;
            }

            public String getTimeStamp() {
                return TimeStamp;
            }

            public void setTimeStamp(String TimeStamp) {
                this.TimeStamp = TimeStamp;
            }
        }

        public static class SvcContBean implements Serializable{
            /**
             * ReqInfo : {"LoginName":"22295","SystemID":"1212","OppId":"2017032122498782"}
             */

            private ReqInfoBean ReqInfo;

            public ReqInfoBean getReqInfo() {
                return ReqInfo;
            }

            public void setReqInfo(ReqInfoBean ReqInfo) {
                this.ReqInfo = ReqInfo;
            }

        }
    }

    public void setRequestBean(ReqInfoBean bean) {
        getContractRoot().getSvcCont().setReqInfo(bean);

    }

    public void setTransactionID(String transactionID) {
        getContractRoot().getTcpCont().setTransactionID(transactionID);

    }

    public void setBusCode(String busCode) {
        getContractRoot().getTcpCont().setBusCode(busCode);
        if(busCode.contains("RES")){
            getContractRoot().getTcpCont().setApplyType("RES_SUP_APPLY_001");
        }

    }
    public void setApplyType(String type){
        getContractRoot().getTcpCont().setApplyType(type);
    }

    public void setTimeStamp(String timeStamp) {
        getContractRoot().getTcpCont().setTimeStamp(timeStamp);
    }

    public String getDate() {
        //得到long类型当前时间
        long l = System.currentTimeMillis();
//new日期对象
        Date date = new Date(l);
//转换提日期输出格式
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        return dateFormat.format(date);
    }
}
