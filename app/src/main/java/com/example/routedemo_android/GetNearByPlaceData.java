package com.example.routedemo_android;

import android.os.AsyncTask;

import com.google.android.gms.maps.GoogleMap;

public class GetNearByPlaceData extends AsyncTask<Object, String, String> {
    GoogleMap googleMap;
    String placeData;
    String url;


    @Override
    protected String doInBackground(Object... objects) {
        googleMap = objects;
    }
}
