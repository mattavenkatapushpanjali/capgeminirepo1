package com.Gmail.Users.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class loginDemo {
	
	
	@Given("I navigated to login page$")
	public void i_navigate_to_login_page() throws Throwable {
	   
	   System.out.println("Homepage launched...");
	}

	@And("^I entered username and password$")
	public void i_entered_username_and_password() throws Throwable {
	    System.out.println("credencials Entered...");
	}
	@But("^Invalid pwd$")
	public void invalid_pwd() throws Throwable {
	   System.out.println("invlid pwd");
	}
	
	@And("^I clicked signin button$")
	public void i_clicked_signin_button() throws Throwable {
	   
		System.out.println("kO done...");
	}

	@Then("^Itas navigated to the HomePage$")
	public void itas_navigated_to_the_HomePage() throws Throwable {
	    System.out.println("compeleted...");
	}
	
	

@Then("Itas navigated to the error msg")
public void itas_navigated_to_the_error_msg() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
}













