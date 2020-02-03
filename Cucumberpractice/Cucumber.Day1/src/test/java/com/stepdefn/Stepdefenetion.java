package com.stepdefn;

import com.FunctionalLibrary.FunctionalLibrary;
import com.automation.Signin;
import com.automation.login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Stepdefenetion extends FunctionalLibrary {
	
	@Given("^User launches the Automation application$")
	public void user_launches_the_Facebook_application() throws Throwable {
		geturl("http://automationpractice.com/");
	}

	@Then("^User clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		login l = new login();
		click(l.getLogin());
	}

	@Given("^User enters the username$")
	public void user_enters_the_username() throws Throwable {
		Signin s = new Signin();
		clearAndsendElement(s.getEmail(), "yuva@gmail.com");
	}

	@Given("^User enters the password$")
	public void user_enters_the_password() throws Throwable {
		Signin s = new Signin();
		clearAndsendElement(s.getPswd(), "1258iou");

	}

	@Then("^user clicks on Signin$")
	public void user_clicks_on_Signin() throws Throwable {
		Signin s = new Signin();
		click(s.getSign());
	}

}


