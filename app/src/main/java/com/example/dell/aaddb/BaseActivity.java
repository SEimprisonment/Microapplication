package com.example.dell.aaddb;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/**
 * Created by DELL on 2018/7/13.
 */

public abstract class BaseActivity extends Activity implements UiInterface{

    private static Toast toast = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EventBus.getDefault().register(this);
        View contenView = LayoutInflater.from(this).inflate(setContentId(), null);

        setContentView(contenView);

        initView();

        //初始化界面的数据
        initData();

        //给控件设置监听器
        initListener();

        //加载数据
        loadData();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMsg(EventBean eventBean){
        if (eventBean!= null) receiveEvent(eventBean);
    }

    @Subscribe(threadMode = ThreadMode.MAIN , sticky = true)
    public void onEventStickMsg(EventBean eventBean){
        if (eventBean!= null) receiveStickEvent(eventBean);
    }


    protected void receiveEvent(EventBean eventBean){

    }

    protected void receiveStickEvent(EventBean eventBean){

    }

    public void showMessage(String arg) {

        ShowToast_long(this, arg);
    }

    public static void ShowToast_long(Context context, String msg) {
        if(toast == null) {
            toast = Toast.makeText(context.getApplicationContext(), msg, Toast.LENGTH_LONG);
        } else {
            toast.setText(msg);
        }

        toast.show();
    }
}
