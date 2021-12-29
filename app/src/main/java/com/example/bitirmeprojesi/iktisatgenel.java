package com.example.bitirmeprojesi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class iktisatgenel extends AppCompatActivity {
    Button btniktisatarama,btniktisatweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iktisatgenel);

        btniktisatarama=(Button)findViewById(R.id.btniktisatarama);
        btniktisatweb=(Button) findViewById(R.id.btniktisatweb);

        btniktisatarama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("tel:02322018000");
                Intent intent= new Intent(Intent.ACTION_DIAL,uri);
                startActivity(intent);
            }
        });
        btniktisatweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://iibf.mcbu.edu.tr/");
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);

            }
        });

    }
    public void iktisatkonum(View view) {
        Intent intent = new Intent(getApplicationContext(),iktisatkonum.class);
        startActivity(intent);
    }
    public void iktisatakademik(View view) {
        Intent intent = new Intent(getApplicationContext(),iktisatakademik.class);
        startActivity(intent);
    }

}