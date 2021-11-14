package com.example.bitirmeprojesi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gonder(View view) {
        Intent intent = new Intent(getApplicationContext(),hakkinda.class);
        startActivity(intent);
    }

    public void Scanner(View view) {
        Intent scanner = new Intent(getApplicationContext(),ScannerActivity.class);
        startActivity(scanner);
    }
}