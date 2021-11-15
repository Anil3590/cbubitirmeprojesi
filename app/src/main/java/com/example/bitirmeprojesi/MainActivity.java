package com.example.bitirmeprojesi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String[] permissions={
            Manifest.permission.CAMERA

    };
    int PERM_CODE = 11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void muhfak(View view) {
        Intent intent = new Intent(getApplicationContext(),muhendislik.class);
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