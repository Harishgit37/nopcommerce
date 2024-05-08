package com.hk.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.hk.helper.Base;
import com.hk.pom.ProductTagsPage;
import com.hk.utilities.Utility;

public class ProductTagsTest extends Base{
  @Test
  public void verifyUserCanSearchForProductTags() throws InterruptedException {
	  
	  Utility utility = new Utility();
	  utility.loginPage("admin@yourstore.com", "admin");

	  ProductTagsPage productTags = PageFactory.initElements(driver, ProductTagsPage.class);
	  
	  productTags.clickOnCatalogIcon();
	  
	  productTags.clickOnProductTagsIcon();
	  
	  productTags.fillProductTagName("laptop");
	  
	  productTags.clickOnSearchButton();
	  
	  Assert.assertTrue(productTags.isProductTagsSearched(), "Product should be searched successfully!!");
  }
  
}
