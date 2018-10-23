package com.example.dell.aaddb.Bean;

import java.io.Serializable;

/**
 * Created by DELL on 2018/7/16.
 */

public class CommonUseListBean implements Serializable {
    private static final long serialVersionUID = 9060569611090450785L;


    /**
     * transactionId : 123456767643254321
     * mobile : test111
     * osType : 1
     * sign : df0e761e05cc0ab34f4fa6b60f8c5d61
     */

    private String transactionId;
    private String mobile;
    private String osType;
    private String sign;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}