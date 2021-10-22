/**
 * @author: Shikhar Joshi
 * @date: 10/11/2021
 */

package com.flight.booking.stepdef;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlightBookingStep extends PageObj{
	
	public FlightBookingStep() {
		super();
	}
	
	@Given("user is on flight booking webpage and filled sign up form")
	public void user_is_on_flight_booking_webpage_and_filled_sign_up_form() throws Throwable {
		
		register.register("test", "testLast", "9867653498", "test123", "test123@gmail.com", "pass", "pass");
		Assert.assertEquals(register.registrationConfirm(), "Registration Confirmation Page");
		register.selectFlights();
	}

	@When("user wants to buy a one way ticket and filled other details")
	public void user_wants_to_buy_a_one_way_ticket_and_filled_other_details() throws Throwable {
		
		flightDetails.flightDetailsForm("3", "London", "July", "29", "Paris", "August", "1", "Unified Airlines");
	}

	@And("user select departing flight and returning flight and its service class")
	public void user_select_departing_flight_and_returning_flight_and_its_service_class() throws Throwable {
		
		flightDetails.flightClassSelection();
	}

	@And("user enter billing address")
	public void user_enter_billing_address() throws Throwable {

		flightDetails.billingAddress("10 Dowing Street", "Test Pur", "Dakota", "23546798");
	}

	@Then("user should get confirmation page and final price")
	public void user_should_get_confirmation_page_and_final_price() throws Throwable {

		Assert.assertEquals(flightDetails.checkPrice(), "$1753 USD");
	}
}
