package com.flight.booking.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestStep {

    @Given("user wants to check execution from TestStep")
	public void user_wants_to_check_execution_from_TestStep() throws Throwable {
		
        System.out.println("First Function from Test");
	}

	@When("user see execution from TestStep")
	public void user_see_execution_from_TestStep() throws Throwable {
		
        System.out.println("Second Function from Test");
	}

	@Then("user verifies test execution from TestStep")
	public void user_verifies_test_execution_from_TestStep() throws Throwable {
		
		System.out.println("Third Function from Test");
	}
}
