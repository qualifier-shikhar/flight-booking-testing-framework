package com.flight.booking.pages;

import java.util.List;
import com.flight.booking.utilities.Base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class FlightDetails extends Base{
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

	@FindBy(id="select-flight")
	private WebElement departReturnTable;

	@FindBy(id="input_50_1_1")
	private List<WebElement> flightDepartureFirstClass;

	@FindBy(id="reserveFlights")
	private WebElement departReturnSubmitBtn;

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

	@FindBy(id="confirm-table")
	private WebElement confirmationTable;

	@FindBy(xpath = "//font[contains(text(), 'USD')]")
	private List<WebElement> prices;

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
		Base.waitForElement(oneWay);
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

		submitBtn.click();
	}
	
	public void flightClassSelection() {
		Base.waitForElement(departReturnTable);
		for(WebElement radioBtn : flightDepartureFirstClass){
			radioBtn.click();
		}
		departReturnSubmitBtn.click();
	}

	public void billingAddress(String street, String city, String state, String postalCode) {
		Base.waitForElement(billingAddressCheck);
		streetAddress.sendKeys(street);
		cityAddress.sendKeys(city);
		stateNameAddress.sendKeys(state);
		postalCodeAddress.sendKeys(postalCode);
		billingAddressSubmitBtn.click();
	}

	public String checkPrice() {
		Base.waitForElement(confirmationTable);
		return prices.get(1).getText();
	}
}
