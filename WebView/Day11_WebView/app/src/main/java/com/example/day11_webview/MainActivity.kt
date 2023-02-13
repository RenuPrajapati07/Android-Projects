package com.example.day11_webview

import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.webkit.WebView

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webViewVariable= findViewById<WebView>(R.id.webView)
        webViewSetUp(webViewVariable)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetUp(webView: WebView) {

        webView.webViewClient

        webView.apply {
            settings.javaScriptEnabled= true
            settings.safeBrowsingEnabled= true
            loadUrl("https://www.google.com")
        }
    }
}