package com.flight.booking.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/resources/features/FlightDetailsFeature.feature",
    glue = "com/flight/booking/stepdef",
    plugin = {
        "pretty",
        "json:target/cucumber-reports/CucumberTestReport.json",
    },
    monochrome = true
)
public class FlightDetailsTestRunner extends AbstractTestNGCucumberTests{

}
