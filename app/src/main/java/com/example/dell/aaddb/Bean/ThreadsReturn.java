package com.example.dell.aaddb.Bean;

import java.io.Serializable;

/**
 * Created by DELL on 2018/7/17.
 */

public class ThreadsReturn implements Serializable {


    /**
     * RespCode : 200
     * RespDesc : 成功
     * RespMsg : 7SYnP39GPhPoyC8Qw5So2boTOz%252BQFld3YliiYtJxxtpfmChJ7P5uvujnVghnEJB4F74%2FfNqDGjZN%0AZXaLgu3Nxetj6d7Ms6Sbn%252BG3gvO8HL14lSdtRghk6hn2erBNRZQumyaEvZ49uOLoe19QlfFVJFWW%0AK%2FYPG7QbTreev0dmiF%2Foe19QlfFVJFRtwubAYkNwEQ6Ej122R2ozT2eXsQh9l%2F4NxbWdBmI3
     */

    private String RespCode;
    private String RespDesc;
    private String RespMsg;

    public String getRespCode() {
        return RespCode;
    }

    public void setRespCode(String RespCode) {
        this.RespCode = RespCode;
    }

    public String getRespDesc() {
        return RespDesc;
    }

    public void setRespDesc(String RespDesc) {
        this.RespDesc = RespDesc;
    }

    public String getRespMsg() {
        return RespMsg;
    }

    public void setRespMsg(String RespMsg) {
        this.RespMsg = RespMsg;
    }
}

