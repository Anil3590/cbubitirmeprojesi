package com.example.bitirmeprojesi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class iktisatgenel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iktisatgenel);
    }
    public void iktisatgenel(View view){
        Intent intent = new Intent(getApplicationContext(),iktisatgenel.class);
        startActivity(intent);
    }
}