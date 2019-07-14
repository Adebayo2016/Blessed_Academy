package com.walexhino.blessedtutorials;

import android.net.http.SslError;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Web extends AppCompatActivity  {

    WebView webView;

    String url= "https://adebiyiphilip.wixsite.com/website";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web);



        webView=(WebView)findViewById(R.id.web);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAppCacheEnabled(true);

        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new WebViewClient() {


                @Override
                public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error)
                {
                    handler.proceed();
                }
            });











        webView.loadUrl(url);







    }



    @Override
    public void onBackPressed() {
        webView.canGoBack();
        webView.goBack();
        finish();

    }
}
