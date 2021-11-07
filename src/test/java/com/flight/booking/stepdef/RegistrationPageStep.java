package com.flight.booking.stepdef;

import com.flight.booking.config.Settings;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationPageStep {
    
    @Given("^user is on the registration webpage$")
    public void user_is_on_the_registration_webpage() throws Throwable {
        
        Thread.sleep(3000);
        Assert.assertTrue(Settings.registrationPage.isRegister(), "The Registration page not Loaded");
    }

    @When("^user filled up registration details and hit submit$")
    public void user_filled_up_registration_details_and_hit_submit() throws Throwable {

        Settings.registrationPage.register("test", "testLast", "9867653498", "test123", "test123@gmail.com", "pass", "pass");
    }

    @Then("^user gets registration confirmation page$")
    public void user_gets_registration_confirmation_page() throws Throwable {

        Settings.registrationPage.registrationConfirm();
    }

    @Then("^user gets flights link to get to flight details page$")
    public void user_gets_flights_link_to_get_to_flight_details_page() throws Throwable {
        
        Settings.registrationPage.lnkFlights();
        Thread.sleep(3000);
    }
}
