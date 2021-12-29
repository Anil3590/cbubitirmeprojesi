package com.example.bitirmeprojesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class twentyone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twentyone);
        ImageView imageView = findViewById(R.id.imageView);
        Picasso.get()
                .load("https://i.hizliresim.com/ab42tb7.png")
                .resize(1920, 3000)
                .into(imageView);
    }
}