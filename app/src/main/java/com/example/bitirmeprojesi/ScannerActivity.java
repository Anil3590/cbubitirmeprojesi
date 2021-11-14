package com.example.bitirmeprojesi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import com.budiyev.android.codescanner.CodeScanner;
import com.budiyev.android.codescanner.CodeScannerView;
import com.budiyev.android.codescanner.DecodeCallback;
import com.google.zxing.Result;

public class ScannerActivity extends AppCompatActivity {

    TextView txt;
    CodeScanner codeScanner;
    CodeScannerView codescannerView;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner);
        txt = (TextView) findViewById(R.id.textView6);
        codescannerView = (CodeScannerView) findViewById(R.id.scanner);
        codeScanner = new CodeScanner(this,codescannerView);

        codeScanner.setDecodeCallback(new DecodeCallback() {
            @Override
            public void onDecoded(@NonNull Result result) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        txt.setText(result.getText());
                    }
                });
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        requestCamera();
        
    }

    private void requestCamera() {
        codeScanner.startPreview();
    }
}