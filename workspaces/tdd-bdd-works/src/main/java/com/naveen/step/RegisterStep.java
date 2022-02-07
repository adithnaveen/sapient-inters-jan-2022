package com.naveen.step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStep {

	@Given("the application is working")
	public void the_application_is_working() {
		 System.out.println("the application is working");
	}

	@When("trainer details are valid")
	public void trainer_details_are_valid() {
		 System.out.println("trainer details are valid");
	}

	@Then("register the trainer")
	public void register_the_trainer() {
		 System.out.println("register the trainer");
	}

}
