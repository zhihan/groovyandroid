package me.zhihan.helloworld1

import android.widget.Button
import android.app.Activity
import android.os.Bundle
import android.webkit.WebView
import android.view.View

import groovy.transform.CompileStatic

import me.zhihan.R
import me.zhihan.helloworld1.utils

@CompileStatic
public class WebViewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);


        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("http://groovy.codehaus.org/");
    }
}