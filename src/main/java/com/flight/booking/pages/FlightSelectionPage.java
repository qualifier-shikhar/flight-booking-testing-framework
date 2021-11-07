package com.flight.booking.pages;

import java.util.List;

import com.flight.booking.base.BasePage;
import com.flight.booking.base.DriverContext;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightSelectionPage extends BasePage{
    
    @FindBy(id="select-flight")
	private WebElement departReturnTable;

	@FindBy(id="input_50_1_1")
	private List<WebElement> flightDepartureFirstClass;

	@FindBy(id="reserveFlights")
	private WebElement departReturnSubmitBtn;

    public void flightClassSelection() {
		
		DriverContext.ExplicitWaitForWebElement(departReturnTable);

		for(WebElement radioBtn : flightDepartureFirstClass){
			radioBtn.click();
		}
	}
	
	public void flightSelectionContinueBtn() {
		
		departReturnSubmitBtn.click();
	}
}
