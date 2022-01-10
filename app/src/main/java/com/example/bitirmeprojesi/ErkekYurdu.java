package com.example.bitirmeprojesi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ErkekYurdu extends AppCompatActivity {

    Button btnerkekarama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_erkek_yurdu);

        btnerkekarama=(Button)findViewById(R.id.btnerkekarama);

        btnerkekarama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("tel:02362467101");
                Intent intent= new Intent(Intent.ACTION_DIAL,uri);
                startActivity(intent);
            }
        });

    }
    public void ErkekYurduKonum(View view) {
        Intent intent = new Intent(getApplicationContext(),ErkekYurduKonum.class);
        startActivity(intent);
    }
}