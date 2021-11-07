package com.flight.booking.pages;

import java.util.List;

import com.flight.booking.base.BasePage;
import com.flight.booking.base.DriverContext;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightSelectionPage extends BasePage{
    
    @FindBy(id="select-flight")
	private WebElement departReturnTable;

	@FindBy(id="input_50_1_1")
	private List<WebElement> flightDepartureFirstClass;

	@FindBy(id="reserveFlights")
	private WebElement departReturnSubmitBtn;

    public void flightClassSelection() {
		
		WebDriverWait wait = new WebDriverWait(DriverContext.Driver,10);
        wait.until(ExpectedConditions.visibilityOf(departReturnTable));

		for(WebElement radioBtn : flightDepartureFirstClass){
			radioBtn.click();
		}
	}
	
	public void flightSelectionContinueBtn() {
		
		departReturnSubmitBtn.click();
	}
}
