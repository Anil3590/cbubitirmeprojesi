package com.example.bitirmeprojesi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Teknokent extends AppCompatActivity {
    Button btnteknokentarama,btnteknokentweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teknokent);

        btnteknokentarama=(Button)findViewById(R.id.btnteknokentarama);
        btnteknokentweb=(Button) findViewById(R.id.btnteknokentweb);

        btnteknokentarama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("tel:02362250727");
                Intent intent= new Intent(Intent.ACTION_DIAL,uri);
                startActivity(intent);
            }
        });
        btnteknokentweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("http://teknokent.cbu.edu.tr/");
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);

            }
        });

    }
    public void TeknokentKonum(View view) {
        Intent intent = new Intent(getApplicationContext(),TeknokentKonum.class);
        startActivity(intent);
    }
}