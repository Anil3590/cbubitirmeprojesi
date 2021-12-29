package com.example.bitirmeprojesi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.example.bitirmeprojesi.databinding.ActivityAtmBinding;
import com.example.bitirmeprojesi.databinding.ActivityIktisatkonumBinding;
import com.example.bitirmeprojesi.databinding.ActivityMuhendislikBinding;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class atm extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityAtmBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityAtmBinding.inflate(getLayoutInflater());
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
        LatLng atmm = new LatLng(38.677155, 27.306384);
        mMap.addMarker(new MarkerOptions().position(atmm).title("TEB-Ziraat-İş Bankası"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(atmm));
    }
}