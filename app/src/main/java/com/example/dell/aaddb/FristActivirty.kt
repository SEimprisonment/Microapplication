package com.example.dell.aaddb
import android.content.Intent
import com.qmuiteam.qmui.util.QMUIStatusBarHelper
import org.xutils.x

/**
 * Created by DELL on 2018/7/13.
 */
class FristActivirty : BaseActivity() {
    override fun setContentId(): Int = R.layout.activity_main

    override fun initView() {
        QMUIStatusBarHelper.translucent(this)
    }

    override fun initData() {
        Thread{
            for (i in 0..200){
                Thread.sleep(10)
            }
            startActivity(Intent(FristActivirty@this , LoginActivity::class.java))
            finish()
        }.start()
    }

    override fun initListener() {
    }

    override fun loadData() {
    }
}