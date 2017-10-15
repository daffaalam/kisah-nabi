package com.example.daffa.kisah25nabi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        WebView webs = (WebView) findViewById(R.id.myweb);
        WebSettings webset = webs.getSettings();
        webset.setJavaScriptEnabled(true);
        webs.setWebViewClient(new WebViewClient());
        webs.loadUrl("http://daffaalam.wordpress.com");
    }
}
