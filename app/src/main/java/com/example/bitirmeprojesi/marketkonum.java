package com.example.bitirmeprojesi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.example.bitirmeprojesi.databinding.ActivityIbadethaneBinding;
import com.example.bitirmeprojesi.databinding.ActivityIktisatkonumBinding;
import com.example.bitirmeprojesi.databinding.ActivityMarketkonumBinding;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class marketkonum extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMarketkonumBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMarketkonumBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        LatLng marketkonum = new LatLng(38.680088, 27.303926);
        mMap.addMarker(new MarkerOptions().position(marketkonum).title("Marker in Metropol Market"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(marketkonum));
    }
}