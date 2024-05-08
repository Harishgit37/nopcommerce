package com.hk.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.hk.helper.Base;
import com.hk.pom.AddNewManufacturerPage;
import com.hk.utilities.Utility;

public class AddNewManufacturerTest extends Base{
  @Test
  public void verifyUserCanAddNewManufacturerTest() throws InterruptedException {
	  
	  Utility utility = new Utility();
	  utility.loginPage("admin@yourstore.com", "admin");

	  AddNewManufacturerPage addNewManufacturerPage = PageFactory.initElements(driver, AddNewManufacturerPage.class);
	  
	  addNewManufacturerPage.clickOnCatalogIcon();
	  
	  addNewManufacturerPage.clickOnManufacturersIcon();
	  
	  addNewManufacturerPage.clickOnAddNewButton();
	  
	  addNewManufacturerPage.fillManufacturersName("Apple");
	  
	  addNewManufacturerPage.switchToManufacturerDescriptionFrame();
	  
	  addNewManufacturerPage.fillManufacturerDescription("Apple IPhone 15pro");
	  
	  addNewManufacturerPage.switchToDefaultContent();
	  
	  addNewManufacturerPage.clickOnSaveButton();	
	  
	  Assert.assertTrue(addNewManufacturerPage.isManufacturersAdded(), "Manufacturers should be added successfully!!");

  }
}
