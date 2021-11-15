    package com.example.bitirmeprojesi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

    public class muhfakgenel extends AppCompatActivity {
    Button btnmuharama,btnmuhweb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muhfakgenel);
        btnmuharama=(Button)findViewById(R.id.btnmuharama);
        btnmuhweb=(Button) findViewById(R.id.btnmuhweb);

        btnmuharama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("tel:02362012011");
                Intent intent= new Intent(Intent.ACTION_DIAL,uri);
                startActivity(intent);
            }
        });
        btnmuhweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://muhendislik.mcbu.edu.tr/");
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);

            }
        });
    }
        public void muhendislik(View view) {
            Intent intent = new Intent(getApplicationContext(), muhendislik.class);
            startActivity(intent);}
}