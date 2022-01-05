package com.example.bitirmeprojesi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Nereye extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nereye);
    }
    public void muhfakgenel(View view) {
        Intent intent = new Intent(getApplicationContext(), muhfakgenel.class);
        startActivity(intent);
    }
    public void iktisatgenel(View view) {
        Intent intent = new Intent(getApplicationContext(),iktisatgenel.class);
        startActivity(intent);
    }
    public void atm(View view) {
        Intent intent = new Intent(getApplicationContext(),atm.class);
        startActivity(intent);
    }
    public void ibadethane(View view) {
        Intent intent = new Intent(getApplicationContext(),ibadethane.class);
        startActivity(intent);
    }
    public void rektorluk(View view) {
        Intent intent = new Intent(getApplicationContext(),rektorluk.class);
        startActivity(intent);}

    public void sporsalonu(View view) {
        Intent intent = new Intent(getApplicationContext(),Sporsalonu.class);
        startActivity(intent);
    }
    public void alısveris(View view) {
        Intent intent = new Intent(getApplicationContext(),alisveris.class);
        startActivity(intent);
    }
}