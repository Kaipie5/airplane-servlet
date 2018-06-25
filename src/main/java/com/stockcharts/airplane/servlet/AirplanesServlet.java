/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockcharts.airplane.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.json.JSONArray;

/**
 *
 * @author kaimcconnell
 */
public class AirplanesServlet extends HttpServlet {

    private final Logger logger = Logger.getLogger(AirplanesServlet.class.getName());
    
    public static final String AIRPLANES_URL = "https://public-api.adsbexchange.com/VirtualRadar/AircraftList.json?fTypQN=";
    
    //private Cache<String, List<Airplane>> airplaneCache;
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        logger.warn("==================================================");
        logger.warn("           sample-servlet : init()");
        logger.warn("==================================================");

//        logger.warn("Setting up Guava Cache...");
//        airplaneCache = CacheBuilder.newBuilder()
//                .expireAfterWrite(30, TimeUnit.SECONDS)
//                .build();
//        logger.warn("...success");
        
        logger.warn("==================================================");
        logger.warn("       sample-servlet : init() - COMPLETE");
        logger.warn("==================================================");
    }
    
    @Override
    public void destroy() {
        logger.warn("<<<<<<<<<<<<<<<<<<<< ######## >>>>>>>>>>>>>>>>>>>>");
        logger.warn("           sample-servlet : destroy()");
        logger.warn("<<<<<<<<<<<<<<<<<<<< ######## >>>>>>>>>>>>>>>>>>>>");
        
        logger.warn("<<<<<<<<<<<<<<<<<<<< ######## >>>>>>>>>>>>>>>>>>>>");
        logger.warn("       sample-servlet : destroy() - COMPLETE");
        logger.warn("<<<<<<<<<<<<<<<<<<<< ######## >>>>>>>>>>>>>>>>>>>>");
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Airplane> airplanes = new ArrayList<>();
       //List<Airplane> airplanes = airplaneCache.getIfPresent("all");
        
//        if(airplanes == null) {
//            try {
//                airplanes = AirplaneDAO.readAirplanesFromFeed();
//                //earthquakeCache.put("all", airplanes);
//            } catch (IOException e) {
//                logger.error("IO Exception in doGet() while loading all airplanes from feed");
//            }
//        }
        

        //FROM FEED
        logger.debug("Trying to get Airplanes from feed...");
        try {
            airplanes = AirplaneDAO.readAirplanesFromFeed();
        } catch (IOException e) {
            logger.error("AirplaneDAO readAirplanesFromFeed IOException", e);
        }
        logger.debug("...Airplanes gotten from Feed");
        
        
        
        
        
//        String queryVal = request.getParameter("sort");
//        
//        if (queryVal == null) {
//            queryVal = "noSort";
//        }
//        switch (queryVal) {
//            case "time" :
//                logger.debug("TIME SORT");
//                Collections.sort(airplanes, Airplane.Time);
//                break;
//            case "magnitude" :
//                logger.debug("MAGNITUDE SORT");
//                Collections.sort(airplanes, Earthquake.Magnitude);
//                break;
//            case "latitude" :
//                logger.debug("Latitude SORT");
//                Collections.sort(earthquakes, Earthquake.Latitude);
//                break;
//            case "longitude" :
//                logger.debug("Longitude SORT");
//                Collections.sort(earthquakes, Earthquake.Longitude);
//                break;
//            default :
//                logger.debug("NO SORT");
//                break;
//        }
//        
//        List<Earthquake> timeSortedEarthquakes = earthquakes;
//        Collections.sort(timeSortedEarthquakes, Earthquake.Time);
        
        //JSONArray ja = new JSONArray(earthquakes);
        JSONArray ja = new JSONArray(airplanes);
        
        logger.debug("Trying to write response to client...");
        try (PrintWriter out = response.getWriter()) {
            
            response.setHeader("Connection", "close");
            response.setContentType("application/json");
            
            logger.debug("ARRAY WRITTEN: " + ja.toString());
            
            out.print(ja.toString());
            
            out.flush();
            
        } catch (IOException e) {
            logger.error("ERROR Writing Response To Client", e);
        }
        logger.debug("...Response written to client");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

}
