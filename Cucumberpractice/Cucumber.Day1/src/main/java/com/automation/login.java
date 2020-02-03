package com.automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FunctionalLibrary.FunctionalLibrary;

public class login extends FunctionalLibrary{

	@FindBy(xpath = "//a[@class='login']")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}

	public login() {
		
		PageFactory.initElements(driver, this);
	}
}
