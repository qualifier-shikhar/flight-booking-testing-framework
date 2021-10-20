package com.flight.booking.stepdef;

import com.flight.booking.pages.FlightDetails;
import com.flight.booking.pages.RegistrationPage;
import com.flight.booking.utilities.DriverContext;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefHelper {
    
    public void register(String firstName, String lastName, String phoneNumber, String userName, String e_mail, String pass_word, String password_Confirm) {

        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.register(firstName, lastName, phoneNumber, userName, e_mail, pass_word, password_Confirm);

        registrationPage.registrationConfirm();
    }

    public void goToWebPage() {
        WebDriverManager.chromedriver().setup();
        DriverContext.driver = new ChromeDriver();
        DriverContext.driver.get("https://vins-udemy.s3.amazonaws.com/docker/docker-book-flight.html");
    }

    public void flightDetailsForm(String passengerCount, String departFrom, String departOnMonth, String departOnDay, String arriveInPlace, String arriveInMonth, String arriveInDay, String airPreference) {
        
        FlightDetails flightDetails = new FlightDetails();
        flightDetails.flightDetailsForm(passengerCount, departFrom, departOnMonth, departOnDay, arriveInPlace, arriveInMonth, arriveInDay, airPreference);
	}

	public void flightClassSelection() {

        FlightDetails flightDetails = new FlightDetails();
        flightDetails.flightClassSelection();
	}

    public void billingAddress(String street, String city, String state, String postalCode) {

        FlightDetails flightDetails = new FlightDetails();
        flightDetails.billingAddress(street, city, state, postalCode);
    }

    public String checkPrice() {

        FlightDetails flightDetails = new FlightDetails();
        return flightDetails.checkPrice();
    }
}
