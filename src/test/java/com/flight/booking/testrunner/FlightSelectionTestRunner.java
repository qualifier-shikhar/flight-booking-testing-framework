package com.flight.booking.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/resources/features/FlightSelectionFeature.feature",
    glue = "com/flight/booking/stepdef",
    plugin = {
        "json:target/cucumber-reports/jsonReports/FlightSelectionTestReport.json",
    }
)
public class FlightSelectionTestRunner extends AbstractTestNGCucumberTests{

}
