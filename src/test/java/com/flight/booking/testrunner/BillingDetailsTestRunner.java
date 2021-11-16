package com.flight.booking.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/resources/features/BillingDetailsFeature.feature",
    glue = "com/flight/booking/stepdef",
    plugin = {
        "json:target/cucumber-reports/jsonReports/BillingDetailsTestReport.json",
    }
)
public class BillingDetailsTestRunner extends AbstractTestNGCucumberTests{

}
