package com.example.bitirmeprojesi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FefGenel extends AppCompatActivity {
    Button btnfefarama,btnfefweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fef_genel);

        btnfefarama=(Button)findViewById(R.id.btnfefarama);
        btnfefweb=(Button) findViewById(R.id.btnfefweb);

        btnfefarama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("tel:02362013000");
                Intent intent= new Intent(Intent.ACTION_DIAL,uri);
                startActivity(intent);
            }
        });
        btnfefweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://fef.mcbu.edu.tr/");
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);

            }
        });

    }
    public void FefKonum(View view) {
        Intent intent = new Intent(getApplicationContext(),FefKonum.class);
        startActivity(intent);
    }
    public void FefAkademik(View view) {
        Intent intent = new Intent(getApplicationContext(),FefAkademik.class);
        startActivity(intent);
    }

}