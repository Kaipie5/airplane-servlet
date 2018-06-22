/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockcharts.airplane.servlet;

import org.apache.log4j.Logger;

/**
 *
 * @author kaimcconnell
 */
public class Airplane {
    
    private final Logger logger = Logger.getLogger(AirplanesServlet.class.getName());
    
    private String id;
    private String model;
    private float latitude;
    private float longitude;
    private int speed;
    private String airline;
    private int numEngines;
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
    public Airplane withLatitude(float latitude) {
        this.latitude = latitude;
        return this;
    }
    public Airplane withLongitude(float longitude) {
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
    public Airplane withNumEngines(int numEngines) {
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

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public int getSpeed() {
        return speed;
    }

    public String getAirline() {
        return airline;
    }

    public int getNumEngines() {
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
    
}
