/**
 * @author: Shikhar Joshi
 * @date: 10/11/2021
 */

package com.flight.booking.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flight.booking.Utilities.Base;
import com.flight.booking.Utilities.DriverContext;

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

	    WebDriverWait wait = new WebDriverWait(DriverContext.driver,10);

	    public void flightDetailsForm(String passengerCount, String departFrom, String departOnMonth, String departOnDay, String arriveInPlace, String arriveInMonth, String arriveInDay, String airPreference) 
	    {
	        wait.until(ExpectedConditions.visibilityOf(oneWay));
	        oneWay.click();
	        
	        Select selectPassenger = new Select(numOfPassengers);
	        selectPassenger.selectByValue(passengerCount);

	        Select selectDepartingPlace = new Select(departingPlace);
	        selectDepartingPlace.selectByValue(departFrom);

	        Select selectDepartingMonth = new Select(departingMonth);
	        selectDepartingMonth.selectByVisibleText(departOnMonth);

	        Select selectDepartingDay = new Select(departingDay);
	        selectDepartingDay.selectByValue(departOnDay);

	        Select selectArrivingPlace = new Select(arrivingPlace);
	        selectArrivingPlace.selectByValue(arriveInPlace);
	        
	        Select selectArrivingMonth = new Select(arrivingMonth);
	        selectArrivingMonth.selectByVisibleText(arriveInMonth);

	        Select selectArrivingDay = new Select(arrivingDay);
	        selectArrivingDay.selectByVisibleText(arriveInDay);

	        businessClass.click();

	        Select selectAirlinePreference = new Select(airlinePreference);
	        selectAirlinePreference.selectByVisibleText(airPreference);

	        submitBtn.click();
	    }
	    
	    public void flightClassSelection() {
	        wait.until(ExpectedConditions.visibilityOf(departReturnTable));
	        for(WebElement radioBtn : flightDepartureFirstClass){
	            radioBtn.click();
	        }
	        departReturnSubmitBtn.click();
	    }

	    public void billingAddress(String street, String city, String state, String postalCode) {
	        wait.until(ExpectedConditions.visibilityOf(billingAddressCheck));
	        streetAddress.sendKeys(street);
	        cityAddress.sendKeys(city);
	        stateNameAddress.sendKeys(state);
	        postalCodeAddress.sendKeys(postalCode);
	        billingAddressSubmitBtn.click();
	    }

	    public void printPrice() {
	        wait.until(ExpectedConditions.visibilityOf(confirmationTable));
	        System.out.println(prices.get(1).getText());
	    }
}
