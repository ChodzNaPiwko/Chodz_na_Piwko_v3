package com.example.asus.chodz_na_piwko;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private static final int MY_PERMISSION_REQUEST_FINE_LOCATION = 101;
    private static final int MY_PERMISSION_REQUEST_COURSE_LOCATION = 102;
    private boolean permissionIsGranted = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
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

        // Lokalizacje
        LatLng spiz = new LatLng(51.110116, 17.031189);
        LatLng remontbar = new LatLng(51.111487, 17.058608);
        LatLng schody = new LatLng(51.109123, 17.028743);
        LatLng konty = new LatLng(51.108404, 17.031680);
        LatLng hops = new LatLng(51.107749, 17.036282);
        LatLng targowa = new LatLng(51.112773, 17.039792);

        //markery
        mMap.addMarker(new MarkerOptions()
                .position(spiz)
                .title("Spiż")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_spiz))
                .snippet("Restauracja z własnym browarem"));
        mMap.addMarker(new MarkerOptions().position(remontbar).title("Remont Bar")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_remont))
                .snippet("Polska kuchnia, piwo i studenckie ceny"));
        mMap.addMarker(new MarkerOptions().position(schody).title("Schody do nikąd")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_schody))
                .snippet("Przyciągają klimatycznym wystrojem i niebagatelną muzyką"));
        mMap.addMarker(new MarkerOptions().position(konty).title("Kontynuacja")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_konty))
                .snippet("Największy multitap we Wrocławiu"));
        mMap.addMarker(new MarkerOptions().position(hops).title("4Hops")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_hops))
                .snippet("Wybór piwa kraftowego oraz kuchni meksykańskiej"));
        mMap.addMarker(new MarkerOptions().position(targowa).title("Targowa")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_targowa))
                .snippet("Restaracja i multitap w jednym"));


        //granice
        LatLngBounds bounds = new LatLngBounds.Builder()
                .include(spiz)
                .include(remontbar)
                .include(schody)
                .build();

        //mMap.setLatLngBoundsForCameraTarget(bounds);

        mMap.moveCamera(CameraUpdateFactory.newLatLng(bounds.getCenter()));
        mMap.setMinZoomPreference(13);

        //lokalizacja uzytkownika
        //sprawdza i wywołuje pozwolenie lokalizacji
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                requestPermissions(new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, MY_PERMISSION_REQUEST_FINE_LOCATION);
            }
            return;
        }
        mMap.setMyLocationEnabled(true);

    }

    //obsługuje reakcję na pozwolenie użycia lokalizacji
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case MY_PERMISSION_REQUEST_FINE_LOCATION:
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    permissionIsGranted = true;
                    mMap.setMyLocationEnabled(true);
                } else {
                    permissionIsGranted = false;
                    Toast.makeText(getApplicationContext(), "Ta aplikacja potrzebuje dostępu do lokalizacji", Toast.LENGTH_SHORT).show();
                }
                break;
            case MY_PERMISSION_REQUEST_COURSE_LOCATION:

                break;
        }
    }

}





