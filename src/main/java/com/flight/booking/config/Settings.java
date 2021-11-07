package com.flight.booking.config;

import com.flight.booking.pages.BillingDetailsPage;
import com.flight.booking.pages.FlightDetailsPage;
import com.flight.booking.pages.FlightSelectionPage;
import com.flight.booking.pages.PriceConfirmationPage;
import com.flight.booking.pages.RegistrationPage;

public class Settings {
    
    public static RegistrationPage registrationPage = new RegistrationPage();
    public static FlightDetailsPage flightDetails = new FlightDetailsPage();
    public static FlightSelectionPage flightSelection = new FlightSelectionPage();
    public static BillingDetailsPage billingDetails = new BillingDetailsPage();
    public static PriceConfirmationPage priceConfirmation = new PriceConfirmationPage();
}
