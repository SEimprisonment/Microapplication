package com.example.dell.aaddb;

import android.widget.ImageView;

import com.qmuiteam.qmui.util.QMUIStatusBarHelper;

public class MainActivity extends BaseActivity {
    private ImageView imageView;
    @Override
    public int setContentId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        QMUIStatusBarHelper.translucent(this);

    }

    @Override
    public void initData() {
        imageView = findViewById(R.id.image_main);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void loadData() {

    }
}
