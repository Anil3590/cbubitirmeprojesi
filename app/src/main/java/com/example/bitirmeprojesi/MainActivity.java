package com.example.bitirmeprojesi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button btnubs,btnweb;

    String[] permissions={
            Manifest.permission.CAMERA

    };
    int PERM_CODE = 11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnubs=(Button) findViewById(R.id.ubs);
        btnweb=(Button) findViewById(R.id.cbuweb);

        btnubs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("https://ubs.cbu.edu.tr/");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        btnweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://mcbu.edu.tr/");
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);

            }
        });
    }

    public void gonder(View view) {
        Intent intent = new Intent(getApplicationContext(),hakkinda.class);
        startActivity(intent);
    }

    public void nereye(View view){
        Intent intent = new Intent(getApplicationContext(),Nereye.class);
        startActivity(intent);
    }

    public void Scanner(View view) {
        Intent scanner = new Intent(getApplicationContext(),ScannerActivity.class);
        startActivity(scanner);
    }
    public void yemekhane(View view) {
        Intent yemekhane = new Intent(getApplicationContext(),yemekhane.class);
        startActivity(yemekhane);
    }
    public void otobus(View view) {
        Intent intent = new Intent(getApplicationContext(),otobussaatleri.class);
        startActivity(intent);
    }




    private boolean checkpermissions(){
        List<String> listofpermissions = new ArrayList<>();
        for (String perm: permissions){
            if (ContextCompat.checkSelfPermission(getApplicationContext(),perm)!= PackageManager.PERMISSION_GRANTED){
                listofpermissions.add(perm);
            }
        }
        if (!listofpermissions.isEmpty()){
            ActivityCompat.requestPermissions(this, listofpermissions.toArray(new String[listofpermissions.size()]),PERM_CODE);
            return false;
        }
        return true;
    }


}