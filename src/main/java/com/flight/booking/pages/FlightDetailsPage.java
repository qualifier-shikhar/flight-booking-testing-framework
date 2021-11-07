package com.flight.booking.pages;


import com.flight.booking.base.BasePage;
import com.flight.booking.base.DriverContext;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightDetailsPage extends BasePage{
    @FindBy(xpath = "//*[@id='cid_37']/table/tbody/tr[1]/td/h1")
	private WebElement flights;

	@FindBy(how = How.CSS, using = "[type='radio'][value='oneway']")
	private WebElement oneWay;

	@FindBy(id="passCount")
	private WebElement numOfPassengers;

	@FindBy(name="fromPort")
	private WebElement departingPlace;

	@FindBy(name="fromMonth")
	private WebElement departingMonth;

	@FindBy(name="fromDay")
	private WebElement departingDay;

	@FindBy(name="toPort")
	private WebElement arrivingPlace;

	@FindBy(name="toMonth")
	private WebElement arrivingMonth;

	@FindBy(name="toDay")
	private WebElement arrivingDay;

	@FindBy(css="input[type='radio'][value='Business']")
	private WebElement businessClass;

	@FindBy(name="airline")
	private WebElement airlinePreference;

	@FindBy(id="findFlights")
	private WebElement submitBtn;

	public boolean isFlightDetails() {

		return oneWay.isDisplayed();
	}

	public void selectByValueElement(WebElement element, String value) {
		Select selectValue = new Select(element);
		selectValue.selectByValue(value);
	}

	public void selectByVisibleTextElement(WebElement element, String value) {
		Select selectValue = new Select(element);
		selectValue.selectByVisibleText(value);
	}
	
	public void flightDetailsForm(String passengerCount, String departFrom, String departOnMonth, String departOnDay, String arriveInPlace, String arriveInMonth, String arriveInDay, String airPreference) 
	{
		WebDriverWait wait = new WebDriverWait(DriverContext.Driver,10);
        wait.until(ExpectedConditions.visibilityOf(oneWay));
		
		oneWay.click();
		
		selectByValueElement(numOfPassengers, passengerCount);
		selectByVisibleTextElement(departingPlace, departFrom);
		selectByVisibleTextElement(departingMonth, departOnMonth);
		selectByValueElement(departingDay, departOnDay);
		selectByValueElement(arrivingPlace, arriveInPlace);
		selectByVisibleTextElement(arrivingMonth, arriveInMonth);
		selectByVisibleTextElement(arrivingDay, arriveInDay);

		businessClass.click();

		selectByVisibleTextElement(airlinePreference, airPreference);

	}
	
	public void flightSubmitBtn() {
		
		submitBtn.click();
	}
}
