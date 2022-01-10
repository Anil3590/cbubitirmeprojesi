package com.example.bitirmeprojesi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KizYurdu extends AppCompatActivity {
    Button btnkizarama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kiz_yurdu);

        btnkizarama=(Button)findViewById(R.id.btnkizarama);

        btnkizarama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("tel:02362467101");
                Intent intent= new Intent(Intent.ACTION_DIAL,uri);
                startActivity(intent);
            }
        });

    }
    public void KizYurduKonum(View view) {
        Intent intent = new Intent(getApplicationContext(),KizYurduKonum.class);
        startActivity(intent);
    }
}