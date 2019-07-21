package com.walexhino.blessedtutorials;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MorePdf extends AppCompatActivity {


    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.more);


    }

    public void unilorin(View view) {
        Intent intent2 = new Intent (view.getContext(),OpenPdf.class );
        intent2.putExtra("send", "unilorin.pdf");
        startActivityForResult(intent2,0);

    }

    public void eksu(View view) {


    }

    public void aaua(View view) {
    }
}
