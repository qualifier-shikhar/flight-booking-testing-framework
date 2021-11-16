package com.flight.booking.stepdef;

import com.flight.booking.base.Base;
import com.flight.booking.pages.PriceConfirmationPage;

import org.testng.Assert;

import io.cucumber.java.en.Then;

public class PriceConfirmationStep extends Base{

    @Then("^user goes to ticket price page$")
    public void user_goes_to_ticket_price_page() {

        LOGGER.info("User is on Price Confirmation Page");
        CurrentPage = GetInstance(PriceConfirmationPage.class);
        Assert.assertTrue(CurrentPage.As(PriceConfirmationPage.class).isPrice(), "Ticket Price page is not loaded");
    }

    @Then("^user get ticket price$")
    public void user_get_ticket_price() {
        
        LOGGER.info("User's ticket price is: " + CurrentPage.As(PriceConfirmationPage.class).checkPrice());
    }
}
