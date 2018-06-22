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
    
    
}
