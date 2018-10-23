package com.example.dell.aaddb.Bean;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.webkit.JavascriptInterface;

import com.example.dell.aaddb.Utils.L;
import com.example.dell.aaddb.WebActivity;

/**
 * Created by DELL on 2018/7/16.
 */

public class AndroidAndJsInterface {

    Activity activity;

    public AndroidAndJsInterface(Activity that) {

        activity = that;
    }

    @JavascriptInterface
    public void methodToHome(){

        L.e("lpf--methodToHome");
        activity.finish();

    }

    @JavascriptInterface
    public void tonewViews(String url){
        Intent intent = new Intent(activity , WebActivity.class);
        intent.putExtra("url" , url);
        activity.startActivity(intent);
    }


    @JavascriptInterface
    public void runOnAndroidMakePhoneCall(String appId , String telNum){
        L.wu("H5传过来的appId = " + appId);
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+ telNum));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.startActivity(intent);
    }

    @JavascriptInterface
    public void runOnAndroidSendTextMessage(String appid , String telNum , String message){
        Intent sendIntent = new Intent(Intent.ACTION_SENDTO);
        sendIntent.setData(Uri.parse("smsto:" + telNum));
        sendIntent.putExtra("sms_body", message);
        activity.startActivity(sendIntent);
    }
}

