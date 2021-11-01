package com.flight.booking.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestOneStep{
    
    @Given("user wants to see second execution from TestOneStep")
	public void user_user_wants_to_see_second_execution_from_TestOneStep() throws Throwable {
		System.out.println("First Function from TestOne");
		
	}

	@When("user saw execution from TestOneStep")
	public void user_saw_execution_from_TestOneStep() throws Throwable {
		
        System.out.println("Second Function from TestOne");
	}

	@Then("user verifies execution from TestOneStep")
	public void user_verifies_execution_from_TestOneStep() throws Throwable {

		System.out.println("Third Function from TestOne");
	}
}
