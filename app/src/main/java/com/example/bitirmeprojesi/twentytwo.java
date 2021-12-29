package com.example.bitirmeprojesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class twentytwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twentytwo);
        ImageView imageView = findViewById(R.id.imageView);
        Picasso.get()
                .load("https://i.hizliresim.com/65zch21.png")
                .resize(1920, 3000)
                .into(imageView);
    }
}