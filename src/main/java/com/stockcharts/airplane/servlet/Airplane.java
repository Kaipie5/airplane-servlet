/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockcharts.airplane.servlet;

import java.util.Comparator;
import org.apache.log4j.Logger;

/**
 *
 * @author kaimcconnell
 */
public class Airplane {
    
    private static Logger logger = Logger.getLogger(AirplanesServlet.class.getName());
    
    private String id;
    private String model;
    private double latitude;
    private double longitude;
    private int speed;
    private String airline;
    private String numEngines;
    private int altitude;
    
    public Airplane() {
        
    }
    public Airplane withID(String id) {
        this.id = id;
        return this;
    }
    public Airplane withModel(String model) {
        this.model = model;
        return this;
    }
    public Airplane withLatitude(double latitude) {
        this.latitude = latitude;
        return this;
    }
    public Airplane withLongitude(double longitude) {
        this.longitude = longitude;
        return this;
    }
    public Airplane withSpeed(int speed) {
        this.speed = speed;
        return this;
    }
    public Airplane withAirline(String airline) {
        this.airline = airline;
        return this;
    }
    public Airplane withNumEngines(String numEngines) {
        this.numEngines = numEngines;
        return this;
    }
    public Airplane withAltitude(int altitude) {
        this.altitude = altitude;
        return this;
    }

    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public int getSpeed() {
        return speed;
    }

    public String getAirline() {
        return airline;
    }

    public String getNumEngines() {
        return numEngines;
    }

    public int getAltitude() {
        return altitude;
    }
    
    @Override
    public String toString() {
        String s = "[id=" + id + ", Airline=" + airline + ", model=" + model + 
                ", numEngines=" + numEngines + ", speed=" + speed + ", altitude=" + altitude + 
                ", latitude=" + latitude + ", longitude=" + longitude + "]";
        return s;
    }
    
    public static Comparator<Airplane> NumEngines = new Comparator<Airplane>(){
        @Override
        public int compare(Airplane one, Airplane two) {
            logger.debug("NUM ENGINES COMPARER ENTERED");
            return Integer.compare(Integer.parseInt(one.numEngines), Integer.parseInt((two.numEngines)));
        }
    };
    public static Comparator<Airplane> Speed = new Comparator<Airplane>(){
        @Override
        public int compare(Airplane one, Airplane two) {
            logger.debug("SPEED COMPARER ENTERED");
            return Integer.compare(one.speed, two.speed);
        }
    };
    public static Comparator<Airplane> Altitude = new Comparator<Airplane>(){
        @Override
        public int compare(Airplane one, Airplane two) {
            logger.debug("ALTITUDE COMPARER ENTERED");
            return Integer.compare(one.altitude, two.altitude);
        }
    };
    public static Comparator<Airplane> Longitude = new Comparator<Airplane>(){
        @Override
        public int compare(Airplane one, Airplane two) {
            return Double.compare(one.longitude, two.longitude);
        }
    };
    public static Comparator<Airplane> Latitude = new Comparator<Airplane>(){
        @Override
        public int compare(Airplane one, Airplane two) {
            return Double.compare(one.latitude, two.latitude);
        }
    };
    
}
