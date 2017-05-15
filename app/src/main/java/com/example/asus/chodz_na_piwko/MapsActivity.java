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
        LatLng szyn = new LatLng(51.1093501, 17.02503950);
        LatLng alebrowar = new LatLng(51.1096893, 17.0232094);
        LatLng lamus = new LatLng(51.0998333, 17.0302878);
        LatLng marynka = new LatLng(51.1073993, 17.0301364);
        LatLng stumostow = new LatLng(51.1317836, 17.0592778);
        LatLng dojutra = new LatLng(51.108413, 17.02634);
        LatLng naroznik = new LatLng(51.1196251, 17.032525);
        LatLng piwnica = new LatLng(51.1072946, 17.0253063);
        LatLng raj = new LatLng(51.1011168, 17.02487);
        LatLng pubguiness = new LatLng(51.109840, 17.029430);
        LatLng pubwedrowki = new LatLng(51.104097, 17.032771);
        LatLng przybijpiataka = new LatLng(51.110133, 17.042899);
        LatLng blackboardpub = new LatLng(51.099239, 17.046880);
        LatLng wicarzone = new LatLng(51.104863, 17.039626);
        LatLng przekret = new LatLng(51.111858, 17.059551);
        LatLng pubzadrzwiami = new LatLng(51.100346, 17.031007);
        LatLng grac = new LatLng(51.107607, 17.030119);
        LatLng setka = new LatLng(51.107743, 17.031341);
        LatLng fuga = new LatLng(51.110921, 17.056770);
        LatLng doctor = new LatLng(51.111407, 17.028938);
        LatLng podlat = new LatLng(51.110028, 17.028381);
        LatLng cyber = new LatLng(51.112953, 17.055629);
        LatLng hex = new LatLng(51.118340, 17.028940);

        //markery
        mMap.addMarker(new MarkerOptions()
                .position(spiz)
                .title("Spiż")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_spiz))
                .snippet("Restauracja z własnym browarem"));
        mMap.addMarker(new MarkerOptions().position(remontbar).title("Remont Bar")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_remont))
                .snippet("Polska kuchnia, piwo i studenckie ceny"));
        mMap.addMarker(new MarkerOptions().position(schody).title("Schody donikąd")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_schody))
                .snippet("Pub z klimatycznym wystrojem i niebagatelną muzyką"));
        mMap.addMarker(new MarkerOptions().position(konty).title("Kontynuacja")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_konty))
                .snippet("Największy multitap we Wrocławiu"));
        mMap.addMarker(new MarkerOptions().position(hops).title("4Hops")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_hops))
                .snippet("Wybór piwa kraftowego oraz kuchni meksykańskiej"));
        mMap.addMarker(new MarkerOptions().position(targowa).title("Targowa")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_targowa))
                .snippet("Restaracja i multitap w jednym"));
        mMap.addMarker(new MarkerOptions().position(szyn).title("Szynkarnia")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_szyn))
                .snippet("Lokalne jedzenie, multitap i piwo kraftowe"));
        mMap.addMarker(new MarkerOptions().position(alebrowar).title("AleBrowar")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_alebrowar))
                .snippet("Oficjalny pub AleBrowaru"));
        mMap.addMarker(new MarkerOptions().position(lamus).title("Lamus")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_lamus))
                .snippet("Pub pod nasypem z  kranami"));
        mMap.addMarker(new MarkerOptions().position(marynka).title("Marynka Piwo i Aperitivo")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_marynka))
                .snippet("Osiem kranów oraz pizza z Happy Little Truck"));
        mMap.addMarker(new MarkerOptions().position(stumostow).title("Browar Stu Mostów")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_stumostow))
                .snippet("Restauracja w działającym browarze kraftowym"));
        mMap.addMarker(new MarkerOptions().position(dojutra).title("DOJUTRA")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_dojutra))
                .snippet("Doskonała atmosfera, niezłe jedzenie i świetne piwo"));
        mMap.addMarker(new MarkerOptions().position(naroznik).title("Bistro Narożnik")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_naroznik))
                .snippet("Gastropub z wyborem piw i szybkimi przekąskami"));
        mMap.addMarker(new MarkerOptions().position(piwnica).title("Stara piwnica")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_piwnica))
                .snippet("Klub muzyczny w centrum Wrocławia"));
        mMap.addMarker(new MarkerOptions().position(raj).title("Czeski raj ")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_raj))
                .snippet("Czeskie piwa, a w tle rockowe klimaty"));
        mMap.addMarker(new MarkerOptions().position(pubguiness).title("Pub Guinness")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_pubguiness)
                ).snippet("Świetne piwo, dobra atmosfera i wystrój wnętrza."));
        mMap.addMarker(new MarkerOptions().position(pubwedrowki).title("Pub Wędrówki")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_pubwedrowki))
                .snippet("Piwa polskie i czeskie, miejsce dla podróżników"));
        mMap.addMarker(new MarkerOptions().position(przybijpiataka).title("Przybij Piątaka")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_przybijpiataka))
                .snippet("Music pub, pozytywna energia, klimatyczny nastrój"));
        mMap.addMarker(new MarkerOptions().position(blackboardpub).title("BlackBoard Pub")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_blackboardpub))
                .snippet("Polski design, polskie piwo , psychodeliczne drinki"));
        mMap.addMarker(new MarkerOptions().position(wicarzone).title("Wicar Zone")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_wicarzone))
                .snippet("Mikstury, napary, koktajle, drinki, kawy, yerba mate."));
        mMap.addMarker(new MarkerOptions().position(przekret).title("Pub studencki PRZEKRĘT")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_przekret))
                .snippet("Miejsce spotkań przy piwku i drinku w pobliżu PWr"));
        mMap.addMarker(new MarkerOptions().position(pubzadrzwiami).title("Pub Za Drzwiami")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_pubzadrzwiami))
                .snippet("Pub z tradycjami, w ofercie różne drinki i piwo."));
        mMap.addMarker(new MarkerOptions().position(grac).title("Graciarnia")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_grac))
                .snippet("Pub i restauracja w klimacie lat 20"));
        mMap.addMarker(new MarkerOptions().position(setka).title("Setka")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_setka))
                .snippet("Słynie ze znakomitych żeberek"));
        mMap.addMarker(new MarkerOptions().position(fuga).title("Fuga Mundi")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_fuga))
                .snippet("Bilard, snooker i disco w studenckim wydaniu"));
        mMap.addMarker(new MarkerOptions().position(doctor).title("Doctor's Bar")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_doctor))
                .snippet("Oficjalny pub browaru Doctor Brew"));
        mMap.addMarker(new MarkerOptions().position(podlat).title("Pod Latarniami")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_podlat))
                .snippet("Polska kuchnia i kraftowe piwo"));
        mMap.addMarker(new MarkerOptions().position(cyber).title("Cybermachina")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_cyber))
                .snippet("Dla entuzjastów gier planszowych i konsolowych"));
        mMap.addMarker(new MarkerOptions().position(hex).title("Hex")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_hex))
                .snippet("Wybór gier planszowych oraz piwa"));



        //granice
        LatLngBounds bounds = new LatLngBounds.Builder()
                .include(spiz)
                .include(remontbar)
                .include(schody)
                .include(szyn)
                .include(alebrowar)
                .include(lamus)
                .include(marynka)
                .include(stumostow)
                .include(dojutra)
                .include(naroznik)
                .include(piwnica)
                .include(raj)
                .include(pubguiness)
                .include(pubwedrowki)
                .include(przybijpiataka)
                .include(blackboardpub)
                .include(wicarzone)
                .include(przekret)
                .include(pubzadrzwiami)
                .include(grac)
                .include(setka)
                .include(fuga)
                .include(doctor)
                .include(podlat)
                .include(cyber)
                .include(hex)
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





