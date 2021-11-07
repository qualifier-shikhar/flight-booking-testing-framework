package com.flight.booking.stepdef;

import com.flight.booking.config.Settings;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlightDetailsStep{

    @Then("^user is on the flight details webpage$")
    public void user_is_on_the_flight_details_webpage() throws Throwable {
        
        Assert.assertTrue(Settings.flightDetails.isFlightDetails(), "Flight Details Page is not loaded");
    }
    
    @When("^user filled up flight details$")
    public void user_filled_up_flight_details() throws Throwable {

        Settings.flightDetails.flightDetailsForm("3", "London", "July", "29", "Paris", "August", "1", "Unified Airlines");

    }

    @When("^user clicks continue button$")
    public void user_clicks_continue_button() throws Throwable {

        Settings.flightDetails.flightSubmitBtn();
    }
}
