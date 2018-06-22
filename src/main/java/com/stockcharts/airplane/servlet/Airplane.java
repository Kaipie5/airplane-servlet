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
    
    
}
