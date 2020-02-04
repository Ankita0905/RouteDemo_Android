package com.example.routedemo_android;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

public class DataParser {
    private HashMap<String, String> getPlace(JSONObject jsonObject)
    {
        HashMap<String, String> googlePlaceMap = new HashMap<>();
        String placeName = "N/A";
        String vicinity = "N/A";
        String latitide = "";
        String longitude = "";
        String reference = "";

        try
        {
            if (!jsonObject.isNull("name"))
                placeName = jsonObject.getString("name");

            if (!jsonObject.isNull("vicinity"))
                placeName = jsonObject.getString("vicinity");

            

        }
        catch (JSONException e)
        {
                e.printStackTrace();
        }

    }

}
