package com.flight.booking.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/resources/features/PriceConfirmationFeature.feature",
    glue = "com/flight/booking/stepdef",
    plugin = {
        "json:target/cucumber-reports/jsonReports/PriceConfirmationTestReport.json",
    }
)
public class PriceConfirmationTestRunner extends AbstractTestNGCucumberTests{

}
