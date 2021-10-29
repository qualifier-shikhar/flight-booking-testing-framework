package com.flight.booking.base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverInitializer extends Base{
    
    public static void goToWebPage(String browser) {

        browser = browser.toLowerCase();
        switch(browser){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
               break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
               break;
        }  
        driver.get("https://vins-udemy.s3.amazonaws.com/docker/docker-book-flight.html");
    }
}
