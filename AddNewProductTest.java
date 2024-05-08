package com.hk.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.hk.helper.Base;
import com.hk.pom.AddNewProductPage;
import com.hk.utilities.Utility;

public class AddNewProductTest extends Base {
	

	@Test
	public void verifyUserCanAddNewProduct() throws InterruptedException {
		
		Utility utility = new Utility();
		utility.loginPage("admin@yourstore.com", "admin");
	
		AddNewProductPage addNewProductPage = PageFactory.initElements(driver, AddNewProductPage.class);
		
		addNewProductPage.clickOnCatalogIcon();
		
		addNewProductPage.clickOnProductsOption();
		
		addNewProductPage.clickOnAddNewButton();
		
		addNewProductPage.fillProductName("oneplus 7T");
		
		addNewProductPage.fillShortDescription("The OnePlus 7T and 7T Pro are Android-based smartphones manufactured by OnePlus."
				+ "The 7T and 7T Pro's designs are similar to their predecessors, with an anodized aluminum frame and Gorilla Glass on both the front and back. ");
		
		addNewProductPage.switchToFullDescriptionFrame();
		
		addNewProductPage.fillFullDescription("The OnePlus 7T and 7T Pro are Android-based smartphones manufactured by OnePlus."
				+ "The 7T was unveiled on 26 September 2019, and the 7T Pro was unveiled on 10 October 2019."
				+ "The McLaren edition from the 6T returns on the 7T Pro.[2] Both have minor upgrades as with previous T phones, such as new software, upgraded cameras and a faster chipset.");
		
		addNewProductPage.switchProductInfoContent();
		
		addNewProductPage.fillSku("One-plus-7T");
		
		addNewProductPage.clickOnCategoriesIcon();
		
		addNewProductPage.clickOnManufacturesIcon();
		
		addNewProductPage.clickOnProductTags("mobile");
		
		addNewProductPage.clickOnProductType("Simple");
		
		addNewProductPage.clickOnCustomerRoles();
		
		addNewProductPage.fillAvailableStartDate("3/12/2024 12:00 AM");
		
		addNewProductPage.fillAvailableEndDate("3/12/2025 12:00 AM");
		
		addNewProductPage.fillPrices("35000");
		
		addNewProductPage.clickOnSaveButton();
		
	    Assert.assertTrue(addNewProductPage.isProductAdded(), "Product should be added successfully!!");

	}
}
