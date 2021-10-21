package com.flight.booking.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
    public Base() {
        PageFactory.initElements(DriverContext.driver, this);
    }
    
    public static void waitForElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(DriverContext.driver,10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
