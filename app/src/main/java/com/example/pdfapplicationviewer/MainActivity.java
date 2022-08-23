package com.example.pdfapplicationviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.shockwave.pdfium.PdfDocument;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    PDFView pdfView;
    File file;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pdfView = findViewById(R.id.pdfView);

  // opening pdf files from assets
    //    pdfView.fromAsset("HIDE_AND_SEEK.pdf").load();


       // opening pdf files from storage

        file =  new File("/sdcard/Download/002-GINGER-THE-GIRAFFE-Free-Childrens-Book-By-Monkey-Pen.pdf");
        pdfView.fromFile(file).load();



    }

}