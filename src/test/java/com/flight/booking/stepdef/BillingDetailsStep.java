package com.flight.booking.stepdef;

import com.flight.booking.config.Settings;

import io.cucumber.java.en.Then;

public class BillingDetailsStep {
    
    @Then("^user enter billing details$")
    public void user_enter_billing_details() throws Throwable{

        Settings.billingDetails.billingAddress("10 Dowing Street", "Test Pur", "Dakota", "23546798");
    }

    @Then("^user hit continue button$")
    public void user_hit_continue_button() throws Throwable{
        Settings.billingDetails.billingContinueBtn();
    }
}
