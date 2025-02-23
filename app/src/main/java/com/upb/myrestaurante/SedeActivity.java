package com.upb.myrestaurante;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.upb.myrestaurante.databinding.ActivitySedeBinding;

public class SedeActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivitySedeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySedeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng medellin = new LatLng(6.242304, -75.579392);
        LatLng laureles = new LatLng(6.243468,-75.5947674);
        LatLng poblado = new LatLng(6.209337,-75.5702626);
        LatLng envigado = new LatLng(6.1664754,-75.6025179);
        mMap.addMarker(new MarkerOptions().position(laureles).title("Marker in Laureles"));
        mMap.addMarker(new MarkerOptions().position(medellin).title("Marker in medellin"));
        mMap.addMarker(new MarkerOptions().position(poblado).title("Marker in poblado"));
        mMap.addMarker(new MarkerOptions().position(envigado).title("Marker in envigado"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(medellin));
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(medellin,14));
    }
}