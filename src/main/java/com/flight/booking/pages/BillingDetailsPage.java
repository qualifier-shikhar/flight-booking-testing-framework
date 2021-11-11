package com.flight.booking.pages;

import com.flight.booking.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BillingDetailsPage extends BasePage{
    
    @FindBy(id="book-flight")
	private WebElement billingAddressCheck;
	
	@FindBy(id="input_53_addr_line1")
	private WebElement streetAddress;

	@FindBy(id="input_53_city")
	private WebElement cityAddress;
	
	@FindBy(id="input_53_state")
	private WebElement stateNameAddress;
	
	@FindBy(id="input_53_postal")
	private WebElement postalCodeAddress;

	@FindBy(id="buyFlights")
	private WebElement billingAddressSubmitBtn;

    public void billingAddress(String street, String city, String state, String postalCode) {
		
		ExplicitWaitForWebElement(billingAddressCheck);
		streetAddress.sendKeys(street);
		cityAddress.sendKeys(city);
		stateNameAddress.sendKeys(state);
		postalCodeAddress.sendKeys(postalCode);
	}
	
	public void billingContinueBtn() {
		
		billingAddressSubmitBtn.click();
	}
}
