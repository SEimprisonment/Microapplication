package com.example.dell.aaddb;
import android.app.Application;

import org.xutils.x;

/**
 * Created by DELL on 2018/7/13.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
    }
}
