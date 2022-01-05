package com.example.bitirmeprojesi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class alisveris extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alisveris);
    }

    public void ceyparkkonum (View view){
        Intent intent = new Intent(getApplicationContext(),ceyparkkonum.class);
        startActivity(intent);
    }public void marketkonum(View view){
        Intent intent = new Intent(getApplicationContext(),marketkonum.class);
        startActivity(intent);
    }

}