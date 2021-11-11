package com.flight.booking.stepdef;

import com.flight.booking.base.Base;
import com.flight.booking.pages.BillingDetailsPage;

import io.cucumber.java.en.Then;

public class BillingDetailsStep extends Base{
    
    @Then("^user enter billing details$")
    public void user_enter_billing_details() throws Throwable{

        CurrentPage = GetInstance(BillingDetailsPage.class);
        CurrentPage.As(BillingDetailsPage.class).billingAddress("10 Dowing Street", "Test Pur", "Dakota", "23546798");
    }

    @Then("^user hit continue button$")
    public void user_hit_continue_button() throws Throwable{
        CurrentPage.As(BillingDetailsPage.class).billingContinueBtn();
    }
}
