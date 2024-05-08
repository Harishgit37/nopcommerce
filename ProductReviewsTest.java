package com.hk.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.hk.helper.Base;
import com.hk.pom.ProductReviewsPage;
import com.hk.utilities.Utility;

public class ProductReviewsTest extends Base{
  @Test
  public void verifyUserCanReviewProductsTest() throws InterruptedException {
	  
	  Utility utility = new Utility();
	  utility.loginPage("admin@yourstore.com", "admin");
	  
	  ProductReviewsPage productReviews = PageFactory.initElements(driver, ProductReviewsPage.class);

	  productReviews.clickOnCatalogIcon();
	  
	  productReviews.clickOnProductReviewsIcon();
	  
	  productReviews.fillSearchDateCreatedFrom("02-02-2024");
	  
	  productReviews.fillSearchDateCreatedTo("10-12-2025");
	  
	  productReviews.fillSearchInTitleMessage("The Product Is very nice!");
	  
	  productReviews.selectSearchApprovedProperty();
	  
	  productReviews.fillSearchSpecificProduct("Laptop");
	  
	  productReviews.clickOnSearchButton();
	  
      Assert.assertTrue(productReviews.isProductReviewsSearched(), "Product should be reviewed successfully!!");
  }
}
