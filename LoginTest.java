
package com.hk.testcase;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.hk.helper.Base;
import com.hk.pom.AdminDashboardPage;
import com.hk.utilities.Utility;

public class LoginTest extends Base {
	
  
  public String sheetName = "sheetName";
  
  
  @Test
  public void verifyUserCanLoginWithValidCred() throws  IOException {
	 
	  Utility utility = new Utility();
	  utility.loginPage("admin@yourstore.com", "admin");
	  AdminDashboardPage adminDashboardPage = PageFactory.initElements(driver, AdminDashboardPage.class);
	  Assert.assertTrue(adminDashboardPage.getDashBoardTitle().isDisplayed());
  }
}
