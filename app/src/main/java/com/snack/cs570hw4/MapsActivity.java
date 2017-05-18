package com.snack.cs570hw4;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

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

        // Add a map of CPP and move the camera
        LatLng cpp = new LatLng(34.058929,-117.818898);
        float zoomLevel = 15.0f;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cpp, zoomLevel));

        // Add user marker
        LatLng user = new LatLng(34.058929,-117.818898);
        mMap.addMarker(new MarkerOptions().position(user).title("User"));

        // Add vending markers
        ArrayList<VenderLocation> vAry = new ArrayList<>();
        vAry.add(new VenderLocation(new LatLng(34.05951, -117.82454), "Bldg. 1", "Bldg. One", "both"));
        vAry.add(new VenderLocation(new LatLng(34.05764, -117.82657), "Bldg. 2", "College of Agriculture", "both"));
        vAry.add(new VenderLocation(new LatLng(34.05785, -117.82595), "Bldg. 3", "Science Laboratory", "both"));
        vAry.add(new VenderLocation(new LatLng(34.05747, -117.82560), "Bldg. 4", "Biotechnology", "both"));
        vAry.add(new VenderLocation(new LatLng(34.05753, -117.82502), "Bldg. 5", "College of Letters, Arts & Social Sciences", "both"));
        vAry.add(new VenderLocation(new LatLng(34.05848, -117.82526), "Bldg. 8", "College of Science", "both"));
        vAry.add(new VenderLocation(new LatLng(34.05894, -117.82209), "Bldg. 9", "College of Engineering", "both"));
        vAry.add(new VenderLocation(new LatLng(34.06231, -117.82048), "Bldg. 20", "Encinitas Residence Hall", "both"));
        vAry.add(new VenderLocation(new LatLng(34.06224, -117.81800), "Bldg. 22", "Alamitos Residence Hall", "both"));
        vAry.add(new VenderLocation(new LatLng(34.06293, -117.81768), "Bldg. 23", "Aliso Residence Hall", "both"));
        vAry.add(new VenderLocation(new LatLng(34.06293, -117.81768), "Bldg. 25", "Drama & Theatre", "both"));
        vAry.add(new VenderLocation(new LatLng(34.05661, -117.82155), "Bldg. 35", "Bronco Student Center", "both"));
        vAry.add(new VenderLocation(new LatLng(34.06109, -117.81114), "Bldg. 45", "Ag. Engr. & Apparel Technology", "both"));
        vAry.add(new VenderLocation(new LatLng(34.06106, -117.82192), "Bldg. 59", "La Cienega", "both"));
        vAry.add(new VenderLocation(new LatLng(34.05470, -117.81849), "Bldg. 60", "Residential Suites", "both"));
        vAry.add(new VenderLocation(new LatLng(34.05481, -117.81804), "Bldg. 61", "Residential Suites", "both"));
        vAry.add(new VenderLocation(new LatLng(34.05595, -117.82063), "Bldg. 66", "Bronco Bookstore", "both"));
        vAry.add(new VenderLocation(new LatLng(34.05671, -117.82467), "Bldg. 76", "Kellogg West Hillside Lodge", "both"));
        vAry.add(new VenderLocation(new LatLng(34.05961, -117.80878), "Bldg. 81", "Facilities Management", "both"));
        vAry.add(new VenderLocation(new LatLng(34.05341, -117.81965), "Bldg. 86", "English Language Institute", "both"));
        vAry.add(new VenderLocation(new LatLng(34.06038, -117.81244), "Bldg. 89", "Interim Design Center", "both"));
        vAry.add(new VenderLocation(new LatLng(34.05784, -117.82348), "Bldg. 97", "Campus Center Marketplace", "both"));
        vAry.add(new VenderLocation(new LatLng(34.05969, -117.82009), "Bldg. 98", "Classroom/Laboratory/Admin", "both"));
        vAry.add(new VenderLocation(new LatLng(34.06086, -117.81580), "Bldg. 109", "Police Department", "both"));
        vAry.add(new VenderLocation(new LatLng(34.04889, -117.81598), "Bldg. 200", "University Village", "both"));
        vAry.add(new VenderLocation(new LatLng(34.05890, -117.82076), "Bldg. 13", "Art Dept./Engineering Annex", "food"));
        vAry.add(new VenderLocation(new LatLng(34.05502, -117.82418), "Bldg. 79", "Collins College", "food"));
        vAry.add(new VenderLocation(new LatLng(34.06216, -117.81947), "Bldg. 21", "Montecito Residene Hall", "drink"));
        vAry.add(new VenderLocation(new LatLng(34.05668, -117.82285), "Bldg. 24", "Music", "drink"));
        vAry.add(new VenderLocation(new LatLng(34.05883, -117.81479), "Bldg. 29", "W.K. Kellogg Horse Center", "drink"));
        vAry.add(new VenderLocation(new LatLng(34.05408, -117.82149), "Bldg. 41", "Darlene May Gymnasium", "drink"));
        vAry.add(new VenderLocation(new LatLng(34.05409, -117.81973), "Bldg. 43", "Kellogg Gymnasium", "drink"));
        vAry.add(new VenderLocation(new LatLng(34.0562, -117.81998), "Bldg. 55", "Foundation Administrative Offices", "drink"));
        vAry.add(new VenderLocation(new LatLng(34.05625, -117.82579), "Bldg. 77", "Kellogg West Main Lodge", "drink"));
        vAry.add(new VenderLocation(new LatLng(34.05034, -117.81468), "Bldg. 220", "CTTi", "drink"));

        for(Object v : vAry){
            String type = ((VenderLocation)v).type;
            BitmapDescriptor icon;
            if ( type == "food" ){
                icon = BitmapDescriptorFactory.fromResource(R.mipmap.food_sm);
            }
            else if (type == "drink"){
                icon = BitmapDescriptorFactory.fromResource(R.mipmap.drinks2_sm);
            }
            else {
                icon = BitmapDescriptorFactory.fromResource(R.mipmap.fooddrink_sm);
            }
            mMap.addMarker(new MarkerOptions()
                    .position(((VenderLocation)v).latLng)
                    .title(((VenderLocation)v).bldgNum)
                    .icon(icon));
        }
    }

    private class VenderLocation {
        public LatLng latLng;
        public String bldgNum;
        public String bldgName;
        public String type;

        VenderLocation(LatLng latLng, String bldgNum, String bldgName, String type){
            this.latLng = latLng;
            this.bldgNum = bldgNum;
            this.bldgName = bldgName;
            this.type = type;
        }
    }
}
