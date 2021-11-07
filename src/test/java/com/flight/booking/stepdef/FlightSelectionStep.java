package com.flight.booking.stepdef;

import com.flight.booking.config.Settings;

import io.cucumber.java.en.Then;

public class FlightSelectionStep {
    
    @Then("^user selects departure and return flight$")
    public void user_selects_departure_and_return_flight() throws Throwable {
        
        Settings.flightSelection.flightClassSelection();
    }

    @Then("^user select continue button$")
    public void user_select_continue_button() throws Throwable {

        Settings.flightSelection.flightSelectionContinueBtn();
    }
}
