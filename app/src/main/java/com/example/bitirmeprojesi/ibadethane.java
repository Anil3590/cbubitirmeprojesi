package com.example.bitirmeprojesi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.example.bitirmeprojesi.databinding.ActivityIbadethaneBinding;
import com.example.bitirmeprojesi.databinding.ActivityIktisatkonumBinding;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class ibadethane extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityIbadethaneBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityIbadethaneBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng ibadethane = new LatLng(38.680713, 27.310185);
        mMap.addMarker(new MarkerOptions().position(ibadethane).title("Marker in İktisat Fakültesi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ibadethane));
    }
}