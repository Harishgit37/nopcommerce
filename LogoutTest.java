package com.hk.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.hk.helper.Base;
import com.hk.pom.LogoutPage;
import com.hk.utilities.Utility;

public class LogoutTest extends Base{
  @Test
  public void verifyUserCanBeAbleToLogout() throws InterruptedException {
	  	  
	  Utility utility = new Utility();
	  utility.loginPage("admin@yourstore.com", "admin");
	  
	  LogoutPage logoutPage = PageFactory.initElements(driver, LogoutPage.class);
	  logoutPage.clickOnLogOutButton();
	  
  }
}
