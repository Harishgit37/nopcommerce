package com.hk.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hk.helper.Base;

public class LogoutPage extends Base{

	@FindBy(xpath = "//a[@href='/logout']")
	private WebElement logOutBtn;

	public void clickOnLogOutButton() throws InterruptedException {
		
		Thread.sleep(3000);
		
		logOutBtn.click();
	}
}
