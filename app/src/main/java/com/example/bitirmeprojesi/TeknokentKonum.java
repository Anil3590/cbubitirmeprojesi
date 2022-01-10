package com.example.bitirmeprojesi;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.example.bitirmeprojesi.databinding.ActivityFefKonumBinding;
import com.example.bitirmeprojesi.databinding.ActivityIktisatkonumBinding;
import com.example.bitirmeprojesi.databinding.ActivityTeknokentBinding;
import com.example.bitirmeprojesi.databinding.ActivityTeknokentKonumBinding;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.bitirmeprojesi.databinding.ActivityMuhendislikBinding;

public class TeknokentKonum extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityTeknokentKonumBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityTeknokentKonumBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        LatLng TeknokentKonum = new LatLng(38.680232, 27.312605);
        mMap.addMarker(new MarkerOptions().position(TeknokentKonum).title("Marker in Teknokent"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(TeknokentKonum));
    }
}