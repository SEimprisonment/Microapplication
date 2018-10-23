package com.example.dell.aaddb;

/**
 * Created by DELL on 2018/7/13.
 */

public interface UiInterface {
    /**
     * 设置布局id
     *
     * @return
     */
    int setContentId();

    /**
     * 初始化控件
     */
    void initView();

    /**
     * 初始化数据
     */
    void initData();


    /**
     * 初始化监听器
     */
    void initListener();


    /**
     * 加载数据
     */
    void loadData();
}
