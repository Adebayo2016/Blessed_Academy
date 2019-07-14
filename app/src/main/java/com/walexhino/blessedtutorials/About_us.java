package com.walexhino.blessedtutorials;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class About_us extends AppCompatActivity {

    PDFView pdfView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_us);


        pdfView=(PDFView)findViewById(R.id.pdfabout);
        pdfView.fromAsset("education.pdf").load();
        pdfView.enableDoubletap(false);

    }

}
