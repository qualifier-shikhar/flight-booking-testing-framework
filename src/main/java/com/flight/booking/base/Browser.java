package com.flight.booking.base;

import org.openqa.selenium.WebDriver;

public class Browser{
    
    private WebDriver driver;
    
    public Browser(WebDriver _driver) {
        driver = _driver;
    }

    public void GoToUrl(String url) {

        driver.get(url);
    }
}
