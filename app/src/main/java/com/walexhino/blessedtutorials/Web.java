package com.walexhino.blessedtutorials;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class Web extends AppCompatActivity {


    String url = "https://www.waeconline.org.ng/e-learning/index.htm";
     WebView web;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_layout);
       Toast.makeText(this, "Please check your network connection", Toast.LENGTH_LONG).show();
       web=(WebView)findViewById(R.id.web);

        web.setWebViewClient(new WebViewClient());
        web.getSettings().setJavaScriptEnabled(true);
        web.setWebChromeClient(new WebChromeClient());
        web.loadUrl(url);


    }
}
