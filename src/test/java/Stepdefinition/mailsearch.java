package Stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mailsearch {
	@Given("Load the application")
	public void load_the_application() {
		System.out.println("load the application");
	    	}

	@When("provide the valid inputs in username and password")
	public void provide_the_valid_inputs_in_username_and_password() {
		System.out.println("valid input username and password");
	   	}

	@When("Click the ok button")
	public void click_the_ok_button() {
		System.out.println("click ok button");
	   
	}

	@Then("User is able to use the mail")
	public void user_is_able_to_use_the_mail() {
		System.out.println("Able to use the mail");
	    	}

	@When("provide the inputs in username and in valid password")
	public void provide_the_inputs_in_username_and_in_valid_password() {
		System.out.println("valid input username and password");
	}

	@When("provide the inputs in invalid username and password")
	public void provide_the_inputs_in_invalid_username_and_password() {
		System.out.println("valid input username and password");    
	}
}
