package com.hk.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.hk.helper.Base;
import com.hk.pom.AddNewCategoriesPage;
import com.hk.utilities.Utility;

public class AddNewCategoriesTest extends Base {
  @Test
  public void verifyUserCanAddNewCategoriesTest() throws InterruptedException {
	  
	  Utility utility = new Utility();
	  utility.loginPage("admin@yourstore.com", "admin");
	  
	  AddNewCategoriesPage addNewCategoriesPage = PageFactory.initElements(driver, AddNewCategoriesPage.class);

	  addNewCategoriesPage.clickOnCatalogIcon();
	  
	  addNewCategoriesPage.clickCategoriesOption();
	  
	  addNewCategoriesPage.clickOnAddNewButton();
	  
	  addNewCategoriesPage.fillCategoryName("Cell phones");
	  
	  addNewCategoriesPage.switchToCategoryDescriptionFrame();
	  
	  addNewCategoriesPage.fillCategoryDescription("basic phones, feature phones, and smartphones. Smartphones are equipped with a QWERTY keypad. The mobile phone is primarily a communication device that uses voice, SMS, or MMS.");
	  
	  addNewCategoriesPage.switchToDefaultContent();
	  
	  addNewCategoriesPage.clickOnParentCategory();
	  
	  addNewCategoriesPage.pictureUploadFile(".//src//test//resources//userdata//userdata.data//oneplus-7t.jpg");
	  
	  addNewCategoriesPage.fillPriceFrom("15000");
	  
	  addNewCategoriesPage.fillPriceTo("30000");
	  
	  addNewCategoriesPage.clickOnSaveButton();
	  
	  Assert.assertTrue(addNewCategoriesPage.isCategoriesAdded(), "Categories should be added successfully!!");

  }
}
