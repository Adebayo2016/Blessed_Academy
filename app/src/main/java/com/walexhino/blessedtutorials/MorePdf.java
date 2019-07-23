package com.walexhino.blessedtutorials;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MorePdf extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.more);

    }

    public void unilorin(View view) {
        Intent intent2 = new Intent (view.getContext(),OpenPdf.class );
        intent2.putExtra("send", "unilorin.pdf");
        startActivityForResult(intent2,0);

    }

    public void eksu(View view) {

        Intent intent2 = new Intent (view.getContext(),OpenPdf.class );
        intent2.putExtra("send", "eksu.pdf");
        startActivityForResult(intent2,0);


    }

    public void aaua(View view) {

        Intent intent2 = new Intent (view.getContext(),OpenPdf.class );
        intent2.putExtra("send", "aaua.pdf");
        startActivityForResult(intent2,0);
    }

    public void unical(View view) {

        Intent intent2 = new Intent (view.getContext(),OpenPdf.class );
        intent2.putExtra("send", "unical.pdf");
        startActivityForResult(intent2,0);


    }

    public void waec(View view) {
        Intent intent = new Intent(this, Web.class);
        startActivity(intent);


    }
}
