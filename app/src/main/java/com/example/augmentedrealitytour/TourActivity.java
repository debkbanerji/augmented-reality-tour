package com.example.augmentedrealitytour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import org.xwalk.core.XWalkView;

public class TourActivity extends AppCompatActivity {

    WebView webview;
    XWalkView xWalkWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_tour);

//        xWalkWebView = (XWalkView) findViewById(R.id.xwalkWebView);
        xWalkWebView = new XWalkView(this, TourActivity.this);
        xWalkWebView.load("https://crosswalk-project.org", null);


////        webview = new WebView(this);
//        webview = (WebView) findViewById(R.id.webView);
//        setContentView(webview);
//
//        webview.setWebViewClient(new WebViewClient()
//        {
//        });
//
//        WebSettings webSettings = webview.getSettings();
//        webSettings.setJavaScriptEnabled(true);
//        webSettings.setBlockNetworkLoads(false);
//        webSettings.setDomStorageEnabled(true);
//
////        webview.loadUrl("http://debkbanerji.com/");
//        webview.loadUrl("http://rajasthantourism.gov.in/amberfort/");


    }
}
