package com.hk.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.hk.helper.Base;
import com.hk.pom.AddNewCustomerRolesPage;
import com.hk.utilities.Utility;

public class AddNewCustomerRolesTest extends Base{
  @Test
  public void verifyUserCanAddNewCustomerRolesTest() throws InterruptedException {
	  
	  Utility utility = new Utility();
	  utility.loginPage("admin@yourstore.com", "admin");
	  
	  AddNewCustomerRolesPage addNewCustomerRolesPage = PageFactory.initElements(driver, AddNewCustomerRolesPage.class);
	  
	  addNewCustomerRolesPage.clickOnCustomerOptions();
	  
	  addNewCustomerRolesPage.clickOnCustomerRolesIcon();
	  
	  addNewCustomerRolesPage.clickOnAddNewButton();
	  
	  addNewCustomerRolesPage.choosingName("abc");
	  
	  addNewCustomerRolesPage.choosingActive();
	  
	  addNewCustomerRolesPage.choosingFreeShipping();
	  
	  addNewCustomerRolesPage.choosingTaxExempt();
	  
	  addNewCustomerRolesPage.choosingOverrideDefaultTaxDisplayType();
	  
	  addNewCustomerRolesPage.choosingEnablePasswordLifetime();
	  
	  addNewCustomerRolesPage.selectPurchasedWithProduct();
	  
      addNewCustomerRolesPage.fillProductName("oneplus");
	  
	  addNewCustomerRolesPage.selectCategory();
	  
	  addNewCustomerRolesPage.selectVendor();
	  
	  addNewCustomerRolesPage.selectStore();
	  
	  addNewCustomerRolesPage.selectProductType();
	  
	  addNewCustomerRolesPage.selectManufacturer();
	  
	  addNewCustomerRolesPage.clickOnSearchButton();
	  
	  addNewCustomerRolesPage.fillSystemName("Admin");
	  
	  addNewCustomerRolesPage.clickOnSaveButton();
	  
	  Assert.assertTrue(addNewCustomerRolesPage.isCustomerRolesAdded(), "Customer Roles should be added successfully!!");

  }
}
