package com.example.bitirmeprojesi;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.bitirmeprojesi.databinding.ActivityMuhendislikBinding;

public class muhendislik extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMuhendislikBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMuhendislikBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        LatLng muhendislikfakultesi = new LatLng(38.67753, 27.30233);
        mMap.addMarker(new MarkerOptions().position(muhendislikfakultesi).title("Marker in Mühendislik Fakültesi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(muhendislikfakultesi));
    }
}