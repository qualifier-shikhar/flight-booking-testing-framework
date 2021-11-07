package com.flight.booking.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverContext{
    
    public static WebDriver Driver;
    public static Browser Browser;

    public static void setDriver(WebDriver driver) {
        Driver = driver;
    }
        
    public static void ExplicitWaitForWebElement(WebElement el) {

        WebDriverWait wait = new WebDriverWait(DriverContext.Driver,10);
        wait.until(ExpectedConditions.visibilityOf(el));
    }
}
