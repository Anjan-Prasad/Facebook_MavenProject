package com.facebook.stepDefination;

import com.facebook.pageObject.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class LoginStepDefination extends LoginPage{
	
	LoginPage loginPage = new LoginPage();
	
	@Given("^I am a user of facebook application$")
	public void i_am_a_user_of_facebook_application() throws Throwable {
		loginPage.openUrl();
	}

	@When("^User enter username$")
	public void user_enter_username() throws Throwable {
		loginPage.userName();
	}

	@When("^User enter password$")
	public void user_enter_password() throws Throwable {
		loginPage.password();
	}

	@When("^User click on login button$")
	public void user_click_on_login_button() throws Throwable {
		loginPage.loginButton();
	}

	@Then("^User should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
	   
		System.out.println("Logged in successfully");
	}


}
