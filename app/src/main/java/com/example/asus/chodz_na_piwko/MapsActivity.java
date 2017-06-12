package com.example.asus.chodz_na_piwko;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.view.LayoutInflaterFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MapsActivity extends FragmentActivity implements GoogleMap.InfoWindowAdapter,
        OnMapReadyCallback
{

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

        //definiowanie button
        final Button Zoom = (Button) findViewById(R.id.Zoom);
        final Button wsp = (Button) findViewById(R.id.wsp);
        final TextView textView=(TextView)findViewById(R.id.textView);
        final Switch switch1 = (Switch) findViewById(R.id.switch1);

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

        //markery !!!!!! NIE ZMIENIAC KOLEJNOSCI MARKROW !!!!!!
        Marker mspiz =mMap.addMarker(new MarkerOptions()
                .position(spiz)
                .title("Spiż")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_spiz))
                .snippet("Restauracja z własnym browarem"));
        Marker mremontbar =mMap.addMarker(new MarkerOptions().position(remontbar).title("Remont Bar")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_remont))
                .snippet("Polska kuchnia, piwo i studenckie ceny"));
        Marker mschody =mMap.addMarker(new MarkerOptions().position(schody).title("Schody donikąd")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_schody))
                .snippet("Pub z klimatycznym wystrojem i niebagatelną muzyką"));
        Marker mkonty =mMap.addMarker(new MarkerOptions().position(konty).title("Kontynuacja")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_konty))
                .snippet("Największy multitap we Wrocławiu"));
        Marker mhops =mMap.addMarker(new MarkerOptions().position(hops).title("4Hops")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_hops))
                .snippet("Wybór piwa kraftowego oraz kuchni meksykańskiej"));
        Marker mtargowa =mMap.addMarker(new MarkerOptions().position(targowa).title("Targowa")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_targowa))
                .snippet("Restaracja i multitap w jednym"));
        Marker mszyn =mMap.addMarker(new MarkerOptions().position(szyn).title("Szynkarnia")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_szyn))
                .snippet("Lokalne jedzenie, multitap i piwo kraftowe"));
        Marker malebrowar =mMap.addMarker(new MarkerOptions().position(alebrowar).title("AleBrowar")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_alebrowar))
                .snippet("Oficjalny pub AleBrowaru"));
        Marker mlamus =mMap.addMarker(new MarkerOptions().position(lamus).title("Lamus")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_lamus))
                .snippet("Pub pod nasypem z  kranami"));
        Marker mmarynka =mMap.addMarker(new MarkerOptions().position(marynka).title("Marynka Piwo i Aperitivo")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_marynka))
                .snippet("Osiem kranów oraz pizza z Happy Little Truck"));
        Marker mstumostow =mMap.addMarker(new MarkerOptions().position(stumostow).title("Browar Stu Mostów")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_stumostow))
                .snippet("Restauracja w działającym browarze kraftowym"));
        Marker mdojutra =mMap.addMarker(new MarkerOptions().position(dojutra).title("DOJUTRA")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_dojutra))
                .snippet("Doskonała atmosfera, niezłe jedzenie i świetne piwo"));
        Marker mnaroznik =mMap.addMarker(new MarkerOptions().position(naroznik).title("Bistro Narożnik")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_naroznik))
                .snippet("Gastropub z wyborem piw i szybkimi przekąskami"));
        Marker mpiwnica =mMap.addMarker(new MarkerOptions().position(piwnica).title("Stara piwnica")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_piwnica))
                .snippet("Klub muzyczny w centrum Wrocławia"));
        Marker mraj =mMap.addMarker(new MarkerOptions().position(raj).title("Czeski raj ")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_raj))
                .snippet("Czeskie piwa, a w tle rockowe klimaty"));
        Marker mpubguiness =mMap.addMarker(new MarkerOptions().position(pubguiness).title("Pub Guinness")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_pubguiness)
                ).snippet("Świetne piwo, dobra atmosfera i wystrój wnętrza."));
        Marker mpubwedrowki =mMap.addMarker(new MarkerOptions().position(pubwedrowki).title("Pub Wędrówki")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_pubwedrowki))
                .snippet("Piwa polskie i czeskie, miejsce dla podróżników"));
        Marker mprzybijpiataka =mMap.addMarker(new MarkerOptions().position(przybijpiataka).title("Przybij Piątaka")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_przybijpiataka))
                .snippet("Music pub, pozytywna energia, klimatyczny nastrój"));
        Marker mblackboardpub =mMap.addMarker(new MarkerOptions().position(blackboardpub).title("BlackBoard Pub")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_blackboardpub))
                .snippet("Polski design, polskie piwo , psychodeliczne drinki"));
        Marker mwicarzone =mMap.addMarker(new MarkerOptions().position(wicarzone).title("Wicar Zone")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_wicarzone))
                .snippet("Mikstury, napary, koktajle, drinki, kawy, yerba mate."));
        Marker mprzekret =mMap.addMarker(new MarkerOptions().position(przekret).title("Pub studencki PRZEKRĘT")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_przekret))
                .snippet("Miejsce spotkań przy piwku i drinku w pobliżu PWr"));
        Marker mpubzadrzwiami =mMap.addMarker(new MarkerOptions().position(pubzadrzwiami).title("Pub Za Drzwiami")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_pubzadrzwiami))
                .snippet("Pub z tradycjami, w ofercie różne drinki i piwo."));
        Marker mgrac =mMap.addMarker(new MarkerOptions().position(grac).title("Graciarnia")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_grac))
                .snippet("Pub i restauracja w klimacie lat 20"));
        Marker msetka =mMap.addMarker(new MarkerOptions().position(setka).title("Setka")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_setka))
                .snippet("Słynie ze znakomitych żeberek"));
        Marker mfuga =mMap.addMarker(new MarkerOptions().position(fuga).title("Fuga Mundi")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_fuga))
                .snippet("Bilard, snooker i disco w studenckim wydaniu"));
        Marker mdoctor =mMap.addMarker(new MarkerOptions().position(doctor).title("Doctor's Bar")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_doctor))
                .snippet("Oficjalny pub browaru Doctor Brew"));
        Marker mpodlat =mMap.addMarker(new MarkerOptions().position(podlat).title("Pod Latarniami")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_podlat))
                .snippet("Polska kuchnia i kraftowe piwo"));
        Marker mcyber =mMap.addMarker(new MarkerOptions().position(cyber).title("Cybermachina")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_cyber))
                .snippet("Dla entuzjastów gier planszowych i konsolowych"));
        Marker mhex = mMap.addMarker(new MarkerOptions().position(hex).title("Hex")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_hex))
                .snippet("Wybór gier planszowych oraz piwa"));

        mMap.setInfoWindowAdapter(this);


        //granice
        final LatLngBounds bounds = new LatLngBounds.Builder()
                .include(spiz)
                .include(remontbar)
                .include(schody)
                .include(konty)
                .include(hops)
                .include(targowa)
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

        //przybliżanie do widoku domyślnego
        Zoom.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mMap.animateCamera(CameraUpdateFactory.newLatLngBounds(bounds,100));

                //Add your code to be executed when button is clicked

            }
        });

        final ArrayList<Marker> markery =new ArrayList<Marker>();//lista z markerami
        markery.add(mspiz);
        markery.add(mremontbar);
        markery.add(mschody);
        markery.add(mkonty);
        markery.add(mhops);
        markery.add(mtargowa);
        markery.add(mszyn);
        markery.add(malebrowar);
        markery.add(mlamus);
        markery.add(mmarynka);
        markery.add(mstumostow);
        markery.add(mdojutra);
        markery.add(mnaroznik);
        markery.add(mpiwnica);
        markery.add(mraj);
        markery.add(mpubguiness);
        markery.add(mpubwedrowki);
        markery.add(mprzybijpiataka);
        markery.add(mblackboardpub);
        markery.add(mwicarzone);
        markery.add(mprzekret);
        markery.add(mpubzadrzwiami);
        markery.add(mgrac);
        markery.add(msetka);
        markery.add(mfuga);
        markery.add(mdoctor);
        markery.add(mpodlat);
        markery.add(mcyber);
        markery.add(mhex);


        //wykrywanie zmiany lokalizacji
        LocationManager locationManager= (LocationManager)getSystemService(Context.LOCATION_SERVICE);
        locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 0, 0, new LocationListener() {
            @Override
            public void onLocationChanged(final Location location) {
                Marker closest = null;
                double minDistance = 0;

                //pętla do najbliszego markera
                for (int i = 0; i < markery.size(); i++) {
                    Marker currentMarker = markery.get(i);
                    // do what you want with the current marker
                    LatLng m = currentMarker.getPosition();
                    Location mlok = new Location("");
                    mlok.setLatitude(m.latitude);
                    mlok.setLongitude(m.longitude);
                    double distance = location.distanceTo(mlok);
                    if(closest == null || minDistance > distance){
                        closest = currentMarker;
                        minDistance = distance;
                    }
                }

                final LatLng naj = closest.getPosition();
                final int odl = (int) minDistance;
                final String nazwa = closest.getTitle();

                //przybliżanie do najbliższego markera
                wsp.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        //textView.setText(nazwa + " \n jest "+odl+ " m od Ciebie"); //Wyświetlenie tekstu
                        //Button button=(Button) v;
                        //((Button) v).setText(nazwa + " \n jest "+odl+ " m od Ciebie"); //zmiana nazwy przycisku
                        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(naj,18));

                    }
                });
                //set the switch to ON
                switch1.setChecked(true);
                //attach a listener to check for changes in state
                switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView,
                                                 boolean isChecked) {

                        if(isChecked){
                            textView.setText(nazwa + " \n jest "+odl+ " m od Ciebie");
                        }else{
                            textView.setText("");
                        }

                    }
                });
                //check the current state before we display the screen
                if(switch1.isChecked()){
                    switch1.setChecked(false);
                }

            }

            @Override
            public void onStatusChanged(String provider, int status, Bundle extras) {

            }

            @Override
            public void onProviderEnabled(String provider) {

            }

            @Override
            public void onProviderDisabled(String provider) {

            }
        });
    }


    @Override
    public View getInfoContents(Marker marker) {
        return null;
    }

    @Override
    public View getInfoWindow(Marker marker) {

        //Pompuje okno informacyjne
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.lkonty, null);

        //Deifniowanie wartości wyświetlanych w oknie
        List lista = new ArrayList();
        lista.add(0, "spiz"); lista.add(1, "remont");lista.add(2, "schody");lista.add(3, "konty");lista.add(4, "hops");lista.add(5, "targowa");lista.add(6, "szyn");lista.add(7, "alebrowar");lista.add(8, "lamus");lista.add(9, "marynka");lista.add(10, "stumostow");lista.add(11, "dojutra");lista.add(12, "naroznik");lista.add(13, "piwnica");lista.add(14, "raj");lista.add(15, "pubguiness");lista.add(16, "pubwedrowki");lista.add(17, "przybijpiataka");lista.add(18, "blackboardpub");lista.add(19, "wicarzone");lista.add(20, "przekret");lista.add(21, "pubzadrzwiami");lista.add(22, "grac");lista.add(23, "setka");lista.add(24, "fuga");lista.add(25, "doctor");lista.add(26, "podlat");lista.add(27, "cyber");lista.add(28, "hex");
        List linki = new ArrayList();
        linki.add(0, "JEDZENIE  PIWO");linki.add(1, "JEDZENIE  PIWO  TANIO");linki.add(2, "MUZYKA  TANIC");linki.add(3, "PIWO RZEMIEŚLNICZE");	linki.add(4, "PIWO RZEMIEŚLNICZE  JEDZENIE");	linki.add(5, "JEDZENIE  PIWO RZEMIEŚLNICZE");	linki.add(6, "JEDZENIE  PIWO RZEMIEŚLNICZE");	linki.add(7, "PIWO RZEMIEŚLNICZE  TANIO");	linki.add(8, "PIWO RZEMIEŚLNICZE");	linki.add(9, "JEDZENIE  PIWO RZEMIEŚLNICZE");linki.add(10, "PIWO RZEMIEŚLNICZE  JEDZENIE TANIO");linki.add(11, "JEDZENIE  PIWO");linki.add(12, "JEDZENIE  PIWO");	linki.add(13, "JEDZENIE  PIWO");	linki.add(14, "PIWO RZEMIEŚLNICZE");	linki.add(15, "PIWO");	linki.add(16, "PODRÓŻE  PIWO");	linki.add(17, "MUZYKA  PIWO  JEDZENIE");	linki.add(18, "PIWO");	linki.add(19, "JEDZENIE");	linki.add(20, "PIWO  TANIO");	linki.add(21, "PIWO");	linki.add(22, "PIWO RZEMIEŚLNICZE  JEDZENIE");	linki.add(23, "JEDZENIE  PIWO");	linki.add(24, "TANIO  PIWO  MUZYKA  BILARD");	linki.add(25, "PIWO RZEMIEŚLNICZE");	linki.add(26, "PIWO RZEMIEŚLNICZE");	linki.add(27, "PLANSZÓWKI  PIWO  KONSOLE");	linki.add(28, "PLANSZÓWKI  PIWO");

        List po=new ArrayList();
        List ws=new ArrayList();
        List cz=new ArrayList();
        List pt=new ArrayList();
        List sb=new ArrayList();
        List nd=new ArrayList();

        po.add(0, "10:00-00:00"); po.add(1, "11:00-00:00"); po.add(2, "16:00-02:00"); po.add(3, "16:00-01:00"); po.add(4, "12:00-00:00"); po.add(5, "10:00-00:00"); po.add(6, "11:00-00:00"); po.add(7, "16:00-02:00"); po.add(8, "16:00-01:00"); po.add(9, "12:00-00:00"); po.add(10, "10:00-00:00"); 	po.add(11, "11:00-00:00"); po.add(12, "16:00-02:00"); po.add(13, "16:00-01:00"); po.add(14, "12:00-00:00"); po.add(15, "10:00-00:00"); po.add(16, "11:00-00:00"); po.add(17, "16:00-02:00"); po.add(18, "16:00-01:00"); po.add(19, "12:00-00:00"); po.add(20, "10:00-00:00"); po.add(21, "11:00-00:00"); po.add(22, "16:00-02:00"); po.add(23, "16:00-01:00"); 	po.add(24, "12:00-00:00"); po.add(25, "10:00-00:00"); po.add(26, "11:00-00:00"); po.add(27, "16:00-02:00"); po.add(28, "16:00-01:00");
        ws.add(0, "10:00-02:00"); ws.add(1, "11:00-03:00"); ws.add(2, "16:00-02:00"); ws.add(3, "16:00-01:00"); ws.add(4, "12:00-00:00"); ws.add(5, "10:00-02:00"); ws.add(6, "11:00-03:00"); ws.add(7, "16:00-02:00"); ws.add(8, "16:00-01:00"); ws.add(9, "12:00-00:00"); ws.add(10, "10:00-02:00"); 	ws.add(11, "11:00-03:00"); ws.add(12, "16:00-02:00"); ws.add(13, "16:00-01:00"); ws.add(14, "12:00-00:00"); ws.add(15, "10:00-02:00"); ws.add(16, "11:00-03:00"); ws.add(17, "16:00-02:00"); ws.add(18, "16:00-01:00"); ws.add(19, "12:00-00:00"); ws.add(20, "10:00-02:00"); ws.add(21, "11:00-03:00"); ws.add(22, "16:00-02:00"); ws.add(23, "16:00-01:00"); 	ws.add(24, "12:00-00:00"); ws.add(25, "10:00-02:00"); ws.add(26, "11:00-03:00"); ws.add(27, "16:00-02:00"); ws.add(28, "16:00-01:00");
        cz.add(0, "10:00-02:00"); cz.add(1, "11:00-03:00"); cz.add(2, "16:00-03:00"); cz.add(3, "16:00-01:00"); cz.add(4, "12:00-00:00"); cz.add(5, "10:00-02:00"); cz.add(6, "11:00-03:00"); cz.add(7, "16:00-03:00"); cz.add(8, "16:00-01:00"); cz.add(9, "12:00-00:00"); cz.add(10, "10:00-02:00"); 	cz.add(11, "11:00-03:00"); cz.add(12, "16:00-03:00"); cz.add(13, "16:00-01:00"); cz.add(14, "12:00-00:00"); cz.add(15, "10:00-02:00"); cz.add(16, "11:00-03:00"); cz.add(17, "16:00-03:00"); cz.add(18, "16:00-01:00"); cz.add(19, "12:00-00:00"); cz.add(20, "10:00-02:00"); cz.add(21, "11:00-03:00"); cz.add(22, "16:00-03:00"); cz.add(23, "16:00-01:00"); 	cz.add(24, "12:00-00:00"); cz.add(25, "10:00-02:00"); cz.add(26, "11:00-03:00"); cz.add(27, "16:00-03:00"); cz.add(28, "16:00-01:00");
        pt.add(0, "10:00-03:00"); pt.add(1, "11:00-03:00"); pt.add(2, "16:00-04:00"); pt.add(3, "16:00-02:00"); pt.add(4, "12:00-03:00"); pt.add(5, "10:00-03:00"); pt.add(6, "11:00-03:00"); pt.add(7, "16:00-04:00"); pt.add(8, "16:00-02:00"); pt.add(9, "12:00-03:00"); pt.add(10, "10:00-03:00"); 	pt.add(11, "11:00-03:00"); pt.add(12, "16:00-04:00"); pt.add(13, "16:00-02:00"); pt.add(14, "12:00-03:00"); pt.add(15, "10:00-03:00"); pt.add(16, "11:00-03:00"); pt.add(17, "16:00-04:00"); pt.add(18, "16:00-02:00"); pt.add(19, "12:00-03:00"); pt.add(20, "10:00-03:00"); pt.add(21, "11:00-03:00"); pt.add(22, "16:00-04:00"); pt.add(23, "16:00-02:00"); 	pt.add(24, "12:00-03:00"); pt.add(25, "10:00-03:00"); pt.add(26, "11:00-03:00"); pt.add(27, "16:00-04:00"); pt.add(28, "16:00-02:00");
        sb.add(0, "10:00-03:00"); sb.add(1, "11:00-03:00"); sb.add(2, "16:00-04:00"); sb.add(3, "16:00-03:00"); sb.add(4, "12:00-03:00"); sb.add(5, "10:00-03:00"); sb.add(6, "11:00-03:00"); sb.add(7, "16:00-04:00"); sb.add(8, "16:00-03:00"); sb.add(9, "12:00-03:00"); sb.add(10, "10:00-03:00"); 	sb.add(11, "11:00-03:00"); sb.add(12, "16:00-04:00"); sb.add(13, "16:00-03:00"); sb.add(14, "12:00-03:00"); sb.add(15, "10:00-03:00"); sb.add(16, "11:00-03:00"); sb.add(17, "16:00-04:00"); sb.add(18, "16:00-03:00"); sb.add(19, "12:00-03:00"); sb.add(20, "10:00-03:00"); sb.add(21, "11:00-03:00"); sb.add(22, "16:00-04:00"); sb.add(23, "16:00-03:00"); 	sb.add(24, "12:00-03:00"); sb.add(25, "10:00-03:00"); sb.add(26, "11:00-03:00"); sb.add(27, "16:00-04:00"); sb.add(28, "16:00-03:00");
        nd.add(0, "10:00-00:00"); nd.add(1, "11:00-03:00"); nd.add(2, "16:00-00:00"); nd.add(3, "16:00-01:00"); nd.add(4, "13:00-00:00"); nd.add(5, "10:00-00:00"); nd.add(6, "11:00-03:00"); nd.add(7, "16:00-00:00"); nd.add(8, "16:00-01:00"); nd.add(9, "13:00-00:00"); nd.add(10, "10:00-00:00"); 	nd.add(11, "11:00-03:00"); nd.add(12, "16:00-00:00"); nd.add(13, "16:00-01:00"); nd.add(14, "13:00-00:00"); nd.add(15, "10:00-00:00"); nd.add(16, "11:00-03:00"); nd.add(17, "16:00-00:00"); nd.add(18, "16:00-01:00"); nd.add(19, "13:00-00:00"); nd.add(20, "10:00-00:00"); nd.add(21, "11:00-03:00"); nd.add(22, "16:00-00:00"); nd.add(23, "16:00-01:00"); 	nd.add(24, "13:00-00:00"); nd.add(25, "10:00-00:00"); nd.add(26, "11:00-03:00"); nd.add(27, "16:00-00:00"); nd.add(28, "16:00-01:00");

        //Sprawdza dzień tygodznia
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);

        //Definiownie indeksu dla list danych
        String id = marker.getId();
        int indeks = Integer.parseInt(id.substring(1));

        //Wprowadzanie obrazka
        String ico= "ic_"+ lista.get(indeks);
        ImageView Image = (ImageView) view.findViewById(R.id.Image);
        int resId = getResources().getIdentifier(ico, "mipmap", getPackageName());
        Image.setImageResource(resId);

        //Wprowadzanie tekstu
        TextView txtName= (TextView) view.findViewById(R.id.txtName);
        txtName.setText(marker.getTitle());
        TextView txtOpis = (TextView) view.findViewById(R.id.txtOpis);
        txtOpis.setText(marker.getSnippet());
        TextView txtLink = (TextView) view.findViewById(R.id.txtLink);
        String link = String.valueOf(linki.get(indeks));
        txtLink.setText("Tagi: "+link);

        //Podaje godziny otwarcia wg dnia
        TextView txtHours = (TextView) view.findViewById(R.id.txtHours);
        switch(day) {
            case 1:
                txtHours.setText(String.valueOf(nd.get(indeks)));
                break;
            case 2:
                txtHours.setText(String.valueOf(po.get(indeks)));
                break;
            case 3:
                txtHours.setText(String.valueOf(ws.get(indeks)));
                break;
            case 4:
                txtHours.setText(String.valueOf(ws.get(indeks)));
                break;
            case 5:
                txtHours.setText(String.valueOf(cz.get(indeks)));
                break;
            case 6:
                txtHours.setText(String.valueOf(pt.get(indeks)));
                break;
            case 7:
                txtHours.setText(String.valueOf(sb.get(indeks)));
                break;
        }
        return view;
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





