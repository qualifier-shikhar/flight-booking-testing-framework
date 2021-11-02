/**
 * @author: Shikhar Joshi
 * @date: 10/11/2021
 */

package com.flight.booking.testrunner;

import com.flight.booking.base.Base;
import com.flight.booking.base.DriverInitializer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test; 

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;

@CucumberOptions(
	features = "src/resources/features/FlightBooking.feature", //the path of the feature files
    glue={"com/flight/booking/stepdef"}, //the path of the step definition files
    monochrome = true,
    tags = "@Booking",
    plugin = {
        "pretty",
        "json:target/cucumber-reports/CucumberTestReport.json",
    }		
)

public class TestRunner extends AbstractTestNGCucumberTests{

    // private TestNGCucumberRunner testNGCucumberRunner;
    
    @BeforeClass(alwaysRun = true)
    public void setUpClass(){
        
        //driver code
        DriverInitializer.goToWebPage("chrome");
    }

    // @Override
    // @DataProvider(parallel = true)
    // public Object[][] scenarios() {
    //     return super.scenarios();
    // }

    @AfterClass(alwaysRun = true)
    public void tearDownClass(){
        Base.driver.quit();
    }

}
