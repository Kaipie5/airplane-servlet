/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockcharts.airplane.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import com.stockcharts.commons.net.*; 
import org.json.*;

/**
 *
 * @author kaimcconnell
 */
public class AirplaneDAO {
    private static Logger logger = Logger.getLogger(AirplanesServlet.class.getName());
    
    
    public static List<Airplane> readAirplanesFromFeed() throws IOException {
        RestResponse response = new RestRequest(AirplanesServlet.AIRPLANES_URL).doGet();
        
        String responseBody = response.getBody();

        JSONObject jo = new JSONObject(responseBody);
        //System.out.println(jo.toString(4));
        
        JSONArray ja = jo.getJSONArray("acList");
        
        List<Airplane> planes = getAirplanesFromJSONArray(ja);
        
//        for (Earthquake quake : quakes) {
//            System.out.println(quake);
//        }
        return planes;
    }
    
    private static Airplane getAirplaneFromJSONObject(JSONObject jo) {
        
        logger.debug(jo.toString(4));
        
        try {
            int id = jo.getInt("Id");
        
            //String airline = jo.getString("Op");

            double latitude = jo.getDouble("Lat");
            double longitude = jo.getDouble("Long");

            int speed = jo.getInt("Spd");

            int altitude = jo.getInt("Alt");

            String model = jo.getString("Mdl");

            String numEngines = jo.getString("Engines");


            Airplane newPlane = new Airplane()
                    .withID(id)
                    //.withAirline(airline)
                    .withLatitude(latitude)
                    .withLongitude(longitude)
                    .withSpeed(speed)
                    .withAltitude(altitude)
                    .withModel(model)
                    .withNumEngines(numEngines);
            return newPlane;
        } catch (JSONException e) {
            logger.error("JSON PARSING EXCEPTION", e);
        }
        return null;
        
    }
    
    private static List<Airplane> getAirplanesFromJSONArray(JSONArray ja) {
        List<Airplane> airplanes = new ArrayList<>();
        for (int i = 0; i < ja.length(); i++) {
            Airplane newPlane = getAirplaneFromJSONObject(ja.getJSONObject(i));
            if (newPlane == null) {
                logger.debug("NULL PLANE");
            } else {
                airplanes.add(newPlane);
            }
        }
        return airplanes;
    }
}
