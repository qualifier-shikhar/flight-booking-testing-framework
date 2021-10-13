/**
 * @author: Shikhar Joshi
 * @date: 10/11/2021
 */

package com.flight.booking.StepDef;

import org.openqa.selenium.chrome.ChromeDriver;

import com.flight.booking.Utilities.DriverContext;
import com.flight.booking.pages.FlightDetails;
import com.flight.booking.pages.RegistrationPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FlightBookingStep {

	@Given("user accessed the flight booking application")
	public void user_accessed_the_flight_booking_application() {
		WebDriverManager.chromedriver().setup();
		DriverContext.driver = new ChromeDriver();
		DriverContext.driver.get("https://vins-udemy.s3.amazonaws.com/docker/docker-book-flight.html");
	}
	
	@When("user sign up and click on flights link")
	public void user_sign_up_and_click_on_flights_link() {
		RegistrationPage registrationPage = new RegistrationPage();
		registrationPage.register("kuch", "bhi", "9867653498", "test123", "test123@gmail.com", "pass", "pass");
		registrationPage.registrationConfirm();
	}

	@And("user is able to buy a one way ticket and select other details")
	public void user_is_able_to_buy_a_one_way_ticket_and_select_other_details() {
		FlightDetails flightDetail = new FlightDetails();
		flightDetail.flightDetailsForm("3", "London", "July", "29", "Paris", "August", "1", "Unified Airlines");
	}
	
	@And("user select departing flight and returning flight and its service class")
	public void user_select_departing_flight_and_returning_flight_and_its_service_class() throws Throwable {
		FlightDetails flightDetail = new FlightDetails();
		flightDetail.flightClassSelection();  
	}

	@And("user enter billing address")
	public void user_enter_billing_address() throws Throwable {
		FlightDetails flightDetail = new FlightDetails();
		flightDetail.billingAddress("10 Dowing Street", "Test Pur", "Dakota", "23546798");
		flightDetail.printPrice();
	}

	@Then("user should get confirmation page and final price")
	public void user_should_get_confirmation_page_and_final_price() throws Throwable {
		FlightDetails flightDetail = new FlightDetails();
		flightDetail.printPrice();
	}

	@Then("close the browser")
	public void close_the_browser() throws Throwable {
		DriverContext.driver.quit();
	}
}
