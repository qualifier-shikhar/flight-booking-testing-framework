package com.flight.booking.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameworkInitialize {
    
    public void InitializeBrowser(String browser) {
        
        browser = browser.toLowerCase();
        WebDriver driver = null;
        switch(browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "edge":

                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
        }
        // Set the driver
        DriverContext.setDriver(driver);
        // Browser
        DriverContext.Browser = new Browser(driver);
    }
}
