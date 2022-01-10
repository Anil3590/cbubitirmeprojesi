package com.example.bitirmeprojesi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ubyogenel extends AppCompatActivity {
    Button btnubyoarama,btnubyoweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubyogenel);

        btnubyoarama=(Button)findViewById(R.id.btnubyoarama);
        btnubyoweb=(Button) findViewById(R.id.btnubyoweb);

        btnubyoarama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("tel:02362012911");
                Intent intent= new Intent(Intent.ACTION_DIAL,uri);
                startActivity(intent);
            }
        });
        btnubyoweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://ubf.mcbu.edu.tr/");
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);

            }
        });

    }
    public void UbyoKonum(View view) {
        Intent intent = new Intent(getApplicationContext(),UbyoKonum.class);
        startActivity(intent);
    }
    public void UbyoAkademik(View view) {
        Intent intent = new Intent(getApplicationContext(),UbyoAkademik.class);
        startActivity(intent);
    }

}