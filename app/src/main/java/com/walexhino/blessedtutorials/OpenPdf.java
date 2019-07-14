package com.walexhino.blessedtutorials;

import android.content.Intent;
import android.os.Bundle;
//import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class OpenPdf  extends AppCompatActivity {

    PDFView pdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdf_view);


        Intent intent=getIntent();
        String receiving=intent.getStringExtra("send");

        pdf = (PDFView)findViewById(R.id.pdf);
        pdf.fromAsset(receiving).load();

    }
}
