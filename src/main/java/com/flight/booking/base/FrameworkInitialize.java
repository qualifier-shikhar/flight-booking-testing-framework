package com.flight.booking.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FrameworkInitialize {
    
    public void InitializeBrowser(String browser) {
        
        browser = browser.toLowerCase();
        WebDriver driver = null;
        switch(browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "C:/Users/shikhar.joshi/Software/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "edge":

                driver = new EdgeDriver();
                break;
        }
        // Set the driver
        DriverContext.setDriver(driver);
        // Browser
        DriverContext.Browser = new Browser(driver);
    }
}
