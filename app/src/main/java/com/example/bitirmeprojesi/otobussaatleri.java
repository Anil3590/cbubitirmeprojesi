package com.example.bitirmeprojesi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class otobussaatleri extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otobussaatleri);
    }
    public void yirmibir(View view){
        Intent intent = new Intent(getApplicationContext(),twentyone.class);
        startActivity(intent);}

    public void yirmiiki(View view) {
        Intent intent = new Intent(getApplicationContext(), twentytwo.class);
        startActivity(intent);
    }
}