package com.hk.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.hk.helper.Base;
import com.hk.pom.AddNewCheckoutAttributesPage;
import com.hk.utilities.Utility;

public class AddNewCheckoutAttributesTest extends Base{
  @Test
  public void verifyUserCanAddNewCheckoutAttributesTest() throws InterruptedException {
	  
	  Utility utility = new Utility();
	  utility.loginPage("admin@yourstore.com", "admin");
	  
	  AddNewCheckoutAttributesPage addNewCheckoutAttributesPage = PageFactory.initElements(driver, AddNewCheckoutAttributesPage.class);
	  
	  addNewCheckoutAttributesPage.clickOnCatalogIcon();
	  
	  addNewCheckoutAttributesPage.clickOnAttributesIcon();
	  
	  addNewCheckoutAttributesPage.clickOnCheckoutAttributesIcon();
	  
	  addNewCheckoutAttributesPage.clickOnAddNewButton();
	  
	  addNewCheckoutAttributesPage.fillCheckoutAttributeName("Mobile");
	  
	  addNewCheckoutAttributesPage.selectCheckoutAttributeControlType();
	  
	  addNewCheckoutAttributesPage.choosingAnAppropriateAttributeValue();
	  
	  addNewCheckoutAttributesPage.fillCheckoutAttributeDisplayOrder("9");
	  
	  addNewCheckoutAttributesPage.clickOnSaveButton();
	  
	  Assert.assertTrue(addNewCheckoutAttributesPage.isCheckoutAttributeAdded(), "Checkout Attribute should be added successfully!!");

  }
}
