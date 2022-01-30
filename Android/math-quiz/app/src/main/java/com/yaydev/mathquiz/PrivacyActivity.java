package com.yaydev.mathquiz;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;


public class PrivacyActivity extends Activity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy);

        WebView web_view = findViewById(R.id.web_view);


        web_view.loadUrl("https://yaydevelopers.blogspot.com/2022/01/privacy-policy_30.html");

    }//oncreate



}
