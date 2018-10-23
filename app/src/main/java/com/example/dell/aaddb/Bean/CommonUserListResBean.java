package com.example.dell.aaddb.Bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by DELL on 2018/7/16.
 */

public class CommonUserListResBean implements Serializable {
    private static final long serialVersionUID = -4889089064108814022L;


    /**
     * commonUseList : [{"appClassName":"","appEntry":"","appId":"","appSize":"","applyId":"",
     * "applyTypeId":"","childappWapaddr":"","columnIcon":"","columnType":"","downAddress":"",
     * "encryptType":"","id":"","ivstr":"","name":"客户管理","province":"","skey":"","version":"",
     * "versionUpdateTime":""},{"appClassName":"SQDliebiaoActivity1","appEntry":"test",
     * "appId":"1711481","appSize":"0","applyId":"340","applyTypeId":"111","childappWapaddr":"",
     * "columnIcon":"","columnType":"","downAddress":"app_apk/1.0.0_yingyongguanli.apk",
     * "encryptType":"0","id":"","ivstr":"","name":"价格审批","province":"1","skey":"",
     * "version":"1.0.0","versionUpdateTime":"2017-11-20 14:22:18"},{"appClassName":"test",
     * "appEntry":"test","appId":"1711489","appSize":"0","applyId":"349","applyTypeId":"111",
     * "childappWapaddr":"","columnIcon":"","columnType":"",
     * "downAddress":"app_apk/1.0.0_yingyongguanli.apk","encryptType":"0","id":"","ivstr":"",
     * "name":"数据报表","province":"0","skey":"","version":"1.0.0","versionUpdateTime":"2017-11-20
     * 14:35:45"},{"appClassName":"WelcomActivity","appEntry":"test","appId":"1711492",
     * "appSize":"0","applyId":"350","applyTypeId":"111","childappWapaddr":"","columnIcon":"",
     * "columnType":"","downAddress":"app_apk/1.0.0_yingyongguanli.apk","encryptType":"0",
     * "id":"","ivstr":"","name":"案例","province":"0","skey":"","version":"1.0.0",
     * "versionUpdateTime":"2017-11-20 14:36:24"}]
     * resCode : 200
     * resDesc : success
     * updateTime : 2017-11-20 17:03:17
     */

    private String resCode;
    private String resDesc;
    private String resTime;
    private List advertItems;
    private List<Item> items;
    private String totalCount;



    public String getResCode() {
        return resCode;
    }

    public void setResCode(String resCode) {
        this.resCode = resCode;
    }

    public String getResDesc() {
        return resDesc;
    }

    public void setResDesc(String resDesc) {
        this.resDesc = resDesc;
    }

    public String getResTime() {
        return resTime;
    }

    public void setResTime(String resTime) {
        this.resTime = resTime;
    }

    public List getAdvertItems() {
        return advertItems;
    }

    public void setAdvertItems(List advertItems) {
        this.advertItems = advertItems;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }
}
