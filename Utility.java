 package com.hk.utilities;

import java.time.Duration;



import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

import com.hk.helper.Base;
import com.hk.pom.AdminLoginPage;

public class Utility extends Base{

	public void loginPage(String username , String password) {
		
		AdminLoginPage adminLoginPage = PageFactory.initElements(driver, AdminLoginPage.class);
		adminLoginPage.getEmailBtn().clear();
		adminLoginPage.getEmailBtn().sendKeys(username);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		adminLoginPage.getPasswordBtn().clear();
		adminLoginPage.getPasswordBtn().sendKeys(password);
		adminLoginPage.getLoginBtn().click();
	}

	@DataProvider(name = "userData")
	public Object[][] userData(){
		  
	   return new Object[][] {	  
			
		 new Object[] { "admin@yourstore.com" ,"admin"},
		 
		 }; 
	  }
}
