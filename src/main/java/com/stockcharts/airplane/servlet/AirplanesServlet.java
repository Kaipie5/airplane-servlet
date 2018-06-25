/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockcharts.airplane.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;

/**
 *
 * @author kaimcconnell
 */
public class AirplanesServlet extends HttpServlet {

    private final Logger logger = Logger.getLogger(AirplanesServlet.class.getName());
    
    public static final String AIRPLANES_URL = "https://public-api.adsbexchange.com/VirtualRadar/AircraftList.json?fTypQN=";
    
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        logger.warn("==================================================");
        logger.warn("           sample-servlet : init()");
        logger.warn("==================================================");

        
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
       
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

}
