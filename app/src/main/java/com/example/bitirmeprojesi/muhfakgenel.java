    package com.example.bitirmeprojesi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

    public class muhfakgenel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muhfakgenel);
    }
        public void muhendislik(View view) {
            Intent intent = new Intent(getApplicationContext(), muhendislik.class);
            startActivity(intent);}
}