package com.example.dell.aaddb

import android.graphics.Bitmap
import android.net.http.SslError
import android.view.View
import android.webkit.*
import com.example.dell.aaddb.Bean.AndroidAndJsInterface
import com.example.dell.aaddb.Utils.L
import kotlinx.android.synthetic.main.activity_web.*

/**
 * Created by DELL on 2018/7/16.
 */
class WebActivity :BaseActivity() {
    override fun setContentId(): Int = R.layout.activity_web

    override fun initView() {
        val url = intent.getStringExtra("url")
        L.wu("打开的URL = " + url)
        var s = web_view.settings
        s.cacheMode = WebSettings.LOAD_NO_CACHE//不使用缓存
        s.layoutAlgorithm = WebSettings.LayoutAlgorithm.NARROW_COLUMNS

        s.useWideViewPort = true

        var path  = this.filesDir.absolutePath +"TreeDB/"  // 开启web sql
        s.databasePath = path
        s.databaseEnabled = true

        s.textZoom = 100

        s.loadWithOverviewMode = true

        s.javaScriptEnabled = true

        s.setGeolocationEnabled(true)

        s.domStorageEnabled = true

        s.allowUniversalAccessFromFileURLs = true

        web_view.requestFocus()
        web_view.scrollBarStyle = View.SCROLLBARS_INSIDE_INSET
        web_view.webChromeClient = object : WebChromeClient() {
            override fun onJsAlert(view: WebView, url: String, message: String, result: JsResult): Boolean {
                result.cancel()
                showMessage(message)
                return true
            }
        }
        web_view.setOnLongClickListener { false }

        web_view.webViewClient = WebViewClient()

        web_view.loadUrl(url)
        web_view.addJavascriptInterface(AndroidAndJsInterface(WebActivity@this), "Androids")
    }

    override fun initData() {
    }

    override fun initListener() {
    }

    override fun loadData() {
    }

    // 拦截Url跳转
    private inner class MyWebViewClient : WebViewClient() {

        override fun shouldOverrideUrlLoading(webview: WebView, url: String): Boolean {

            web_view.loadUrl(url)

            return true
        }

        override fun onReceivedSslError(view: WebView, handler: SslErrorHandler, error: SslError) {

            L.e("lpf--" + error.toString())
            if (error.primaryError == SslError.SSL_DATE_INVALID
                    || error.primaryError == SslError.SSL_EXPIRED
                    || error.primaryError == SslError.SSL_INVALID
                    || error.primaryError == SslError.SSL_UNTRUSTED) {
                handler.proceed()
            } else {
                handler.cancel()
            }

            super.onReceivedSslError(view, handler, error)

        }

        override fun onPageStarted(view: WebView, url: String, favicon: Bitmap) {

        }

        override fun onPageFinished(view: WebView, url: String) {

        }

        override fun onReceivedError(view: WebView, errorCode: Int, description: String, failingUrl: String) {}
    }
}