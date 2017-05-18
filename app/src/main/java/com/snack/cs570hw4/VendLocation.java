package com.snack.cs570hw4;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by mark on 5/17/2017.
 */

public class VendLocation {
    public LatLng latLng;
    public String bldgNum;
    public String bldgName;
    public String type;

    VendLocation(LatLng latLng, String bldgNum, String bldgName, String type){
        this.latLng = latLng;
        this.bldgNum = bldgNum;
        this.bldgName = bldgName;
        this.type = type;
    }
}
