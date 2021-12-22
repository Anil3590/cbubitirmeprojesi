package com.example.bitirmeprojesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class yemekhane extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yemekhane);
        ImageView imageView = findViewById(R.id.imageView);
        Picasso.get()
                .load("https://sks.mcbu.edu.tr/db_images/site_405/web/Aralik-Yemek-Listesi%20(2).jpg")
                .resize(1920, 3000)
                .into(imageView);
    }
}