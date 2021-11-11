package com.flight.booking.stepdef;

import com.flight.booking.base.Base;
import com.flight.booking.pages.RegistrationPage;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationPageStep extends Base{
    
    @Given("^user is on the registration webpage$")
    public void user_is_on_the_registration_webpage() throws Throwable {
        
        CurrentPage = GetInstance(RegistrationPage.class);
        Assert.assertTrue(CurrentPage.As(RegistrationPage.class).isRegister());
    }

    @When("^user filled up registration details and hit submit$")
    public void user_filled_up_registration_details_and_hit_submit() throws Throwable {

        CurrentPage.As(RegistrationPage.class).register("test", "testLast", "9867653498", "test123", "test123@gmail.com", "pass", "pass");
    }

    @Then("^user gets registration confirmation page$")
    public void user_gets_registration_confirmation_page() throws Throwable {

        CurrentPage.As(RegistrationPage.class).registrationConfirm();
    }

    @Then("^user gets flights link to get to flight details page$")
    public void user_gets_flights_link_to_get_to_flight_details_page() throws Throwable {
        
        CurrentPage.As(RegistrationPage.class).lnkFlights();
    }
}
