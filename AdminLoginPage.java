package com.hk.pom;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import com.hk.helper.Base;

public class AdminLoginPage extends Base {

	@FindBy(xpath = "//input[@type='email']")
	WebElement emailBtn;
	
	@FindBy(xpath = "//input[@value='admin']")
	WebElement passwordBtn;
	
	@FindBy(id="RememberMe")
	WebElement rememberMeCheckBox;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginBtn;

	public WebElement getEmailBtn() {
		return emailBtn;
	}

	public WebElement getPasswordBtn() {
		return passwordBtn;
	}

	public WebElement getRememberMeCheckBox() {
		return rememberMeCheckBox;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	
}
