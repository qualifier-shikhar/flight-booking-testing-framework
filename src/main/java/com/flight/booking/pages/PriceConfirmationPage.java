package com.flight.booking.pages;

import java.util.List;

import com.flight.booking.base.BasePage;
import com.flight.booking.base.DriverContext;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PriceConfirmationPage extends BasePage{

    @FindBy(id="flight-confirmation")
	private WebElement confirmationTable;

	@FindBy(xpath = "//font[contains(text(), 'USD')]")
	private List<WebElement> prices;

	public boolean isPrice() {

		DriverContext.ExplicitWaitForWebElement(confirmationTable);
		return confirmationTable.isDisplayed();
	}
    public String checkPrice() {
		
		WebDriverWait wait = new WebDriverWait(DriverContext.Driver,10);
        wait.until(ExpectedConditions.visibilityOf(confirmationTable));
		return prices.get(1).getText();
	}
}
