package com.flight.booking.seleniumtest;

// import com.flight.booking.config.Settings;
import com.flight.booking.stepdef.TestInitialize;

// import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest extends TestInitialize {

    @Test
    public void signUp() {

        // Settings.registrationPage.register("test", "testLast", "9867653498", "test123", "test123@gmail.com", "pass", "pass");
		// Assert.assertEquals(Settings.registrationPage.registrationConfirm(), "Registration Confirmation Page");
        // Settings.registrationPage.lnkFlights();

        // Settings.flightDetails.flightDetailsForm("3", "London", "July", "29", "Paris", "August", "1", "Unified Airlines");

        // Settings.flightSelection.flightClassSelection();

        // Settings.billingDetails.billingAddress("10 Dowing Street", "Test Pur", "Dakota", "23546798");

        // Assert.assertEquals(Settings.priceConfirmation.checkPrice(), "$1753 USD");
    }
}
