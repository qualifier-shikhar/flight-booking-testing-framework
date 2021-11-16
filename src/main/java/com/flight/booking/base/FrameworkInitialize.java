package com.flight.booking.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameworkInitialize extends Base{
    
    WebDriver driver = null;
    public void InitializeBrowser(String browser) {
        
        browser = browser.toLowerCase();
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
    }

    public void GoToUrl() {

        driver.get("https://vins-udemy.s3.amazonaws.com/docker/docker-book-flight.html");
    }

    public void quitDriver() {

        driver.close();
    }
}
