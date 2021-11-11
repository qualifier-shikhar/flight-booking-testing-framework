package com.flight.booking.stepdef;

import com.flight.booking.base.Base;
import com.flight.booking.pages.FlightSelectionPage;

import io.cucumber.java.en.Then;

public class FlightSelectionStep extends Base{
    
    @Then("^user selects departure and return flight$")
    public void user_selects_departure_and_return_flight() throws Throwable {
        
        CurrentPage = GetInstance(FlightSelectionPage.class);
        CurrentPage.As(FlightSelectionPage.class).flightClassSelection();
    }

    @Then("^user select continue button$")
    public void user_select_continue_button() throws Throwable {

        CurrentPage.As(FlightSelectionPage.class).flightSelectionContinueBtn();
    }
}
