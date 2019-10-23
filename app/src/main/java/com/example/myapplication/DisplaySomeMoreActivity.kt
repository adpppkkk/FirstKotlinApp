package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ProgressBar
import android.widget.TextView

class DisplaySomeMoreActivity : AppCompatActivity() {


    internal var loadingFinished = true
    internal var redirect = false

    val REAL_URL = "URL"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_some_more)

        val url = intent.getStringExtra(REAL_URL)

        var bar: ProgressBar

        bar = findViewById<ProgressBar>(R.id.progressBar)
        bar.setVisibility(View.VISIBLE)

        val web = findViewById<WebView>(R.id.webview)

        web.settings.javaScriptEnabled = true


        web.loadUrl(url)

        //setProgressBarVisibility(visible);


        web.webViewClient = object : WebViewClient() {

            override fun onPageFinished(view: WebView, url: String) {
                // do your stuff here
                bar.visibility = View.INVISIBLE
            }
        }

    }
}
