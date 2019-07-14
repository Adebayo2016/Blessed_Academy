package com.walexhino.blessedtutorials;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class unimedPdf extends AppCompatActivity {

    PDFView pdfview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdf_view);


        pdfview = (PDFView) findViewById(R.id.pdf);

        pdfview.fromAsset("unimed.pdf").load();


    }
}