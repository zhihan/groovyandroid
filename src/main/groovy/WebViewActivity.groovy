package me.zhihan.helloworld1

import android.widget.Button
import android.app.Activity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.ValueCallback
import android.view.View
import android.util.Log

import groovy.transform.CompileStatic

import me.zhihan.R
import me.zhihan.helloworld1.utils

@CompileStatic
public class WebViewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)


        WebView myWebView = (WebView) findViewById(R.id.webview)
        myWebView.getSettings().setJavaScriptEnabled(true)
        myWebView.loadData("<html><body><div id=\"c\">C</div></body></html>", 
            "text/html", "utf-8")

        myWebView.evaluateJavascript(
            """ function plus(x, y) { 
                return x + y;
            }
            plus(1, 2);
            """, new ValueCallback<String>(){
                void onReceiveValue(String x) {
                    Log.v("WebViewActivity", "Received:" + x)
                }
            })
    }


}