package com.hk.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.hk.helper.Base;
import com.hk.pom.AddNewCustomersPage;
import com.hk.utilities.Utility;

public class AddNewCustomersTest extends Base{
  @Test
  public void verifyUserCanAddNewCustomers() throws InterruptedException {
	  
	  Utility utility = new Utility();
	  utility.loginPage("admin@yourstore.com", "admin");
	  
	  AddNewCustomersPage addNewCustomersPage = PageFactory.initElements(driver, AddNewCustomersPage.class);
	  
	  addNewCustomersPage.clickOnCustomerOptions();
	  
	  addNewCustomersPage.clickOnCustomerIcon();
	  
	  addNewCustomersPage.clickOnAddNewButton();
	  
	  addNewCustomersPage.fillEmail("sharishkumar3720@gmail.com");
	  
	  addNewCustomersPage.fillPassword("hknop19#");
	  
	  addNewCustomersPage.fillFirstName("Harish");
	  
	  addNewCustomersPage.fillLastName("kumar");
	  
	  addNewCustomersPage.clickOnGender();

	  addNewCustomersPage.fillDateOfBirth("03-07-2000");
	  
	  addNewCustomersPage.fillCompanyName("abc");
	  
	  addNewCustomersPage.isTaxExempt();
	  
	  //addNewCustomersPage.clickOnNewsLetter();
	  
	  //addNewCustomersPage.clickOnCustomerRoles();
	  
	  addNewCustomersPage.clickOnManagerOfVendor();
	  
	  addNewCustomersPage.active();
	  
	  addNewCustomersPage.fillAdminComment("Nice");
	  
	  addNewCustomersPage.clickOnSaveButton();  
	  
	  Assert.assertTrue(addNewCustomersPage.isCustomersAdded(), "Customers should be added successfully!!");

  }
}
