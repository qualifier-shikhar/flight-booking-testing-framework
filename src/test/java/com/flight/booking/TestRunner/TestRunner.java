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

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;

@CucumberOptions(
	features = "src/resources/features", //the path of the feature files
    glue={"com/flight/booking/stepdef"}, //the path of the step definition files
    tags="@Booking",
    plugin = {
        "pretty",
        "json:target/cucumber-reports/CucumberTestReport.json",
    }		
)

public class TestRunner{

    private TestNGCucumberRunner testNGCucumberRunner;
    
    @BeforeClass(alwaysRun = true)
    public void setUpClass(){
    	testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
        //driver code
        DriverInitializer.goToWebPage("chrome");
    }

    @Test(dataProvider = "features")
    public void feature(PickleWrapper pickle, FeatureWrapper cucumberFeature) {
        testNGCucumberRunner.runScenario(pickle.getPickle());
    }
    
    @DataProvider()
    public Object[][] features() {

    	if(testNGCucumberRunner == null) {
    		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    	}

    	return testNGCucumberRunner.provideScenarios();
    }
    
    @AfterClass(alwaysRun = true)
    public void tearDownClass(){
        Base.driver.quit();
    	testNGCucumberRunner.finish();
    }

}
