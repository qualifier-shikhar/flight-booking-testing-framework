package com.flight.booking.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/resources/features/FlightDetailsFeature.feature",
    glue = "com/flight/booking/stepdef",
    plugin = {
        "json:target/cucumber-reports/jsonReports/FlightDetailsTestReport.json",
    }
)
public class FlightDetailsTestRunner extends AbstractTestNGCucumberTests{

}
