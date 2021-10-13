/**
 * @author: Shikhar Joshi
 * @date: 10/11/2021
 */

package com.flight.booking.TestRunner;

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
	features = "src/test/resources/features", //the path of the feature files
    glue={"com/flight/booking/StepDef"}, //the path of the step definition files
    tags = "@Booking",
    plugin = {
        "summary",
        "pretty",
        "json:target/cucumber-reports/CucumberTestReport.json",
        "html:target/cucumber-report/cucumber.html"
    }		
)
public class TestRunner extends AbstractTestNGCucumberTests{
    private TestNGCucumberRunner testNGCucumberRunner;
    
    @BeforeClass(alwaysRun = true)
    public void setUpClass(){
    	testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
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
        System.out.println("Inside tearDown");
    	testNGCucumberRunner.finish();
    }

}
