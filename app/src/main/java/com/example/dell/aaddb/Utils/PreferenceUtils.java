package com.example.dell.aaddb.Utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by DELL on 2018/7/16.
 */

public class PreferenceUtils {
    private static SharedPreferences sp;

    public static void getSharedPreference(Context context) {
        if (sp == null) {
            sp = context.getSharedPreferences("config", context.MODE_PRIVATE);
        }
    }

    public static void putString(Context context, String key, String value) {
        getSharedPreference(context);
        sp.edit().putString(key, value).commit();
    }

    public static String getString(Context context, String key, String defValue) {
        getSharedPreference(context);
        return sp.getString(key, defValue);
    }

    public static void putInt(Context context, String key, int value) {
        getSharedPreference(context);
        sp.edit().putInt(key, value).commit();
    }
    public static void putLong(Context context, String key, long value) {
        getSharedPreference(context);
        sp.edit().putLong(key, value).commit();
    }


    public static long getLong(Context context, String key, long defValue) {
        getSharedPreference(context);
        return sp.getLong(key, defValue);
    }

    public static int getInt(Context context, String key, int defValue) {
        getSharedPreference(context);
        return sp.getInt(key, defValue);
    }

    public static void putBoolean(Context context, String key, boolean value) {
        getSharedPreference(context);
        sp.edit().putBoolean(key, value).commit();
    }

    public static boolean getBoolean(Context context, String key,
                                     boolean defValue) {
        getSharedPreference(context);
        return sp.getBoolean(key, defValue);
    }

    public static void IsLock(Context context , boolean b ){  //是否启用手势解锁
        getSharedPreference(context);
        sp.edit().putBoolean("isLock" , b).commit();
    }

    public static boolean getLock(Context context){
        getSharedPreference(context);
        return sp.getBoolean("isLock" , false);
    }

    public static void putLockTrajectory(Context context , boolean b ){  //手势密码是否有轨迹
        getSharedPreference(context);
        sp.edit().putBoolean("istrajectory" , b).commit();
    }

    public static boolean getLockTrajectory(Context context){
        getSharedPreference(context);
        return sp.getBoolean("istrajectory" , true);
    }

    public static void putPass(Context context, String password){
        getSharedPreference(context);
        sp.edit().putString("pass" , password).commit();
    }

    public static String getPass(Context context){
        getSharedPreference(context);
        return sp.getString("pass" , "");
    }

    public static void putUserName(Context context, String password){
        getSharedPreference(context);
        sp.edit().putString("username" , password).commit();
    }

    public static String getUserName(Context context){
        getSharedPreference(context);
        return sp.getString("username" , "");
    }

    public static void putLoginType(Context context, String type){ //上次登陆模式，account 账号  phone 手机号
        getSharedPreference(context);
        sp.edit().putString("logintype" , type).commit();
    }

    public static String getLoginType(Context context){
        getSharedPreference(context);
        return sp.getString("logintype" , "");
    }

    public static void putPhoneNum(Context context, String phoneNum){ //手机号登陆时 保存手机号
        getSharedPreference(context);
        sp.edit().putString("phonenum" , phoneNum).commit();
    }

    public static String getPhoneNum(Context context){
        getSharedPreference(context);
        return sp.getString("phonenum" , "");
    }

    public static void putUserToken(Context context, String token){ //手机号验证码登陆返回的token ，用于免登陆
        getSharedPreference(context);
        sp.edit().putString("usertoken" , token).commit();
    }

    public static String getUserToken(Context context){
        getSharedPreference(context);
        return sp.getString("usertoken" , "");
    }

    public static void putPasssord(Context context, String password){
        getSharedPreference(context);
        sp.edit().putString("userpass" , password).commit();
    }

    public static String getPassword(Context context){
        getSharedPreference(context);
        return sp.getString("userpass" , "");
    }



    public static void isCheck(Context context , boolean b ){  //是否启用手势解锁
        getSharedPreference(context);
        sp.edit().putBoolean("ischeck" , b).commit();
    }

    public static boolean getCheck(Context context){
        getSharedPreference(context);
        return sp.getBoolean("ischeck",false);
    }

    public static void isManager(Context context , boolean b ){  //是否客户经理
        getSharedPreference(context);
        sp.edit().putBoolean("manager" , b).commit();
    }

    public static boolean getManager(Context context){
        getSharedPreference(context);
        return sp.getBoolean("manager",false);
    }

    public static void putHeaderUrl(Context context, String url){
        getSharedPreference(context);
        sp.edit().putString("HeaderUrl" , url).commit();
    }

    public static String getHeaderUrl(Context context){
        getSharedPreference(context);
        return sp.getString("HeaderUrl" , "");
    }

    public static void putImage(Context context, String ActivityName){
        getSharedPreference(context);
        sp.edit().putBoolean(ActivityName , true).commit();
    }

    public static boolean getImage(Context context , String ActivityName){
        getSharedPreference(context);
        return sp.getBoolean(ActivityName , false);
    }



    /**
     * 移除
     * @param context
     * @param key
     */
    public static void remove(Context context, String key) {
        getSharedPreference(context);
        sp.edit().remove(key).commit();
    }
}
