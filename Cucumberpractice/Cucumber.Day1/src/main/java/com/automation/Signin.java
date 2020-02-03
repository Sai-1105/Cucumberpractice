package com.automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FunctionalLibrary.FunctionalLibrary;

public class Signin extends FunctionalLibrary{
	
	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(id = "passwd")
	private WebElement pswd;
	
	@FindBy(xpath = "//i[@class='icon-lock left']")
	private WebElement sign;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPswd() {
		return pswd;
	}

	public WebElement getSign() {
		return sign;
	}
	
	public Signin() {
		PageFactory.initElements(driver, this);
	}
	
}
