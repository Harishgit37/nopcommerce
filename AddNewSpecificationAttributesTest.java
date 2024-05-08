package com.hk.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.hk.helper.Base;
import com.hk.pom.AddNewSpecificationAttributesPage;
import com.hk.utilities.Utility;

public class AddNewSpecificationAttributesTest extends Base{
  @Test
  public void verifyUserCanAddNewSpecificationAttributesTest() throws InterruptedException {
	  
	  Utility utility = new Utility();
	  utility.loginPage("admin@yourstore.com", "admin");
	  
	  AddNewSpecificationAttributesPage addNewSpecificationAttributesPage = PageFactory.initElements(driver, AddNewSpecificationAttributesPage.class);
	  
	  addNewSpecificationAttributesPage.clickOnCatalogIcon();
	  
	  addNewSpecificationAttributesPage.clickOnAttributesIcon();
	  
	  addNewSpecificationAttributesPage.clickOnSpecificationAttributeIcon();
	  
	  addNewSpecificationAttributesPage.clickOnAddNewButton();
	  
	  addNewSpecificationAttributesPage.fillSpecificationAttributeName("mobile");
	  
	  addNewSpecificationAttributesPage.selectSpecificationAttributeGroup();
	  
	  addNewSpecificationAttributesPage.fillSpecificationAttributeDisplayOrder("9");
	  
	  addNewSpecificationAttributesPage.clickOnSaveButton();
	  
      Assert.assertTrue(addNewSpecificationAttributesPage.isSpecificationAttributeAdded(), "Specification Attribute should be added successfully!!");

  }
}
