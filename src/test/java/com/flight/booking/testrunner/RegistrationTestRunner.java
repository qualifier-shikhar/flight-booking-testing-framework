package com.flight.booking.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/resources/features/RegistrationFeature.feature",
    glue = "com/flight/booking/stepdef",
    plugin = {
        "json:target/cucumber-reports/jsonReports/RegistrationTestReport.json",
    }
)
public class RegistrationTestRunner extends AbstractTestNGCucumberTests{

}
