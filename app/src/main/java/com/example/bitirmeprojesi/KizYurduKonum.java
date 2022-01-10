package com.example.bitirmeprojesi;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.example.bitirmeprojesi.databinding.ActivityIktisatkonumBinding;
import com.example.bitirmeprojesi.databinding.ActivityKizYurduBinding;
import com.example.bitirmeprojesi.databinding.ActivityKizYurduKonumBinding;
import com.example.bitirmeprojesi.databinding.ActivityUbyoKonumBinding;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.bitirmeprojesi.databinding.ActivityMuhendislikBinding;

public class KizYurduKonum extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityKizYurduKonumBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityKizYurduKonumBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        LatLng KizYurduKonum = new LatLng(38.679970, 27.308701);
        mMap.addMarker(new MarkerOptions().position(KizYurduKonum).title("Marker in Kiz Yurdu"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(KizYurduKonum));
    }
}