package com.flight.booking.pages;

import java.util.List;

import com.flight.booking.base.BasePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PriceConfirmationPage extends BasePage{

    @FindBy(id="flight-confirmation")
	private WebElement confirmationTable;

	@FindBy(xpath = "//font[contains(text(), 'USD')]")
	private List<WebElement> prices;

	public boolean isPrice() {

		ExplicitWaitForWebElement(confirmationTable);
		return confirmationTable.isDisplayed();
	}
    public String checkPrice() {

		return prices.get(1).getText();
	}
}
