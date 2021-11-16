package com.flight.booking.stepdef;


import java.io.IOException;

import com.flight.booking.base.FrameworkInitialize;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TestInitialize extends FrameworkInitialize{
    
    private Logger LOGGER = LogManager.getLogger();

    @Before
    public void setUp() throws IOException {
        
        // CurrentPage = GetInstance(BillingDetailsPage.class);
        // CurrentPage.As(BillingDetailsPage.class).billingAddress("10 Dowing Street", "Test Pur", "Dakota", "23546798");

        InitializeBrowser("chrome");
        GoToUrl();
        LOGGER.info("Initializing Driver");
    }

    @After
    public void tearDown() {

        LOGGER.info("Quiting Driver");
        quitDriver();
    }
}

