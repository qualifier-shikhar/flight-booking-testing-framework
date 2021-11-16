package com.flight.booking.stepdef;

import com.flight.booking.base.Base;
import com.flight.booking.pages.FlightDetailsPage;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlightDetailsStep extends Base{

    @Then("^user is on the flight details webpage$")
    public void user_is_on_the_flight_details_webpage() throws Throwable {
        
        LOGGER.info("User is on Flight Details Page");
        LOGGER.info("User is on filling Flight Details");
        CurrentPage = GetInstance(FlightDetailsPage.class);
        Assert.assertTrue(CurrentPage.As(FlightDetailsPage.class).isFlightDetails(), "Flight Details Page is not loaded");
    }
    
    @When("^user filled up flight details$")
    public void user_filled_up_flight_details() throws Throwable {

        CurrentPage.As(FlightDetailsPage.class).flightDetailsForm("3", "London", "July", "29", "Paris", "August", "1", "Unified Airlines");
    }

    @When("^user clicks continue button$")
    public void user_clicks_continue_button() throws Throwable {

        LOGGER.info("User clicks continue button");
        CurrentPage.As(FlightDetailsPage.class).flightSubmitBtn();
    }
}
