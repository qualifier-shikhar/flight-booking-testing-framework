package com.flight.booking.stepdef;

import com.flight.booking.config.Settings;

import org.testng.Assert;

import io.cucumber.java.en.Then;

public class PriceConfirmationStep {

    @Then("^user goes to ticket price page$")
    public void user_goes_to_ticket_price_page() {

        Assert.assertTrue(Settings.priceConfirmation.isPrice(), "Ticket Price page is not loaded");
    }

    @Then("^user get ticket price$")
    public void user_get_ticket_price() {
        
        System.out.println(Settings.priceConfirmation.checkPrice());
    }
}
