package com.flight.booking.stepdef;


import com.flight.booking.base.DriverContext;
import com.flight.booking.base.FrameworkInitialize;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TestInitialize extends FrameworkInitialize{
    
    @Before
    public void setUp() {
        
        InitializeBrowser("chrome");
        DriverContext.Browser.GoToUrl("https://vins-udemy.s3.amazonaws.com/docker/docker-book-flight.html");
    }

    // @After
    // public void tearDown() {

        
    //     if(DriverContext.Driver != null){

    //         DriverContext.Driver.quit();
    //     }
    // }
}

