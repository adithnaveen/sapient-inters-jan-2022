package com.naveen.step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {

	@Given("the application is loaded")
	public void the_application_is_loaded() {
	     System.out.println("the application is loaded ::: Invoked");
	}

	@When("^username is \"([a-zA-Z0-9]+)\"$")
	public void username_is(String userName) {
	    System.out.println("username is "+userName+" ::: Invoked");
	}
 
	@When("^password is \"([a-zA-Z0-9]+)\"$")
	public void password_is(String password) {
	    System.out.println("password is "+password+" ::: Invoked");
	}
 

	@Then("validate the user")
	public void validate_the_user() {
	   System.out.println("validate the user ::: Invoked ");
	}

	@Then("show dashboard")
	public void show_dashboard() {
	    System.out.println("show dashboard ::: Invoked");
	}

}
