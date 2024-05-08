package com.hk.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.hk.helper.Base;
import com.hk.pom.AddNewProductAttributesPage;
import com.hk.utilities.Utility;

public class AddNewProductAttributesTest extends Base{
  @Test
  public void verifyUserCanAddNewProductAttributesTest() throws InterruptedException {
	  
	  Utility utility = new Utility();
	  utility.loginPage("admin@yourstore.com", "admin");
	  
	  AddNewProductAttributesPage addNewProductAttributesPage = PageFactory.initElements(driver, AddNewProductAttributesPage.class);
	  
	  addNewProductAttributesPage.clickOnCatalogIcon();
	  
	  addNewProductAttributesPage.clickOnAttributesIcon();
	  
	  addNewProductAttributesPage.clickOnProductsAttributeIcon();
	  
	  addNewProductAttributesPage.clickOnAddNewButton();
	  
	  addNewProductAttributesPage.fillProductAttributeName("mobile");
	  
	  addNewProductAttributesPage.switchToProductAttributeDescriptionFrame();
	  
	  addNewProductAttributesPage.fillProductAttributeDescription("tag");
	  
	  addNewProductAttributesPage.switchProductInfoContent();
	  
	  addNewProductAttributesPage.clickOnSaveButton();
	  
	  Assert.assertTrue(addNewProductAttributesPage.isProductAttributeAdded(), "Product Attribute should be added successfully!!");

  }
}
