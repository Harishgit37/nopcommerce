package com.hk.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.hk.helper.Base;
import com.hk.pom.AddNewDiscountsPage;
import com.hk.utilities.Utility;

public class AddNewDiscountsTest extends Base{
  @Test
  public void verifyUserCanAbleToAddNewDiscountsTest() throws InterruptedException {
	  
	  Utility utility = new Utility();
	  utility.loginPage("admin@yourstore.com", "admin");
	  
	  AddNewDiscountsPage addNewDiscountsPage = PageFactory.initElements(driver, AddNewDiscountsPage.class);
	  
	  addNewDiscountsPage.clickOnPromotionsOption();
	  
	  addNewDiscountsPage.clickOnDiscountsIcon();

	  addNewDiscountsPage.clickOnAddNewButton();

	  addNewDiscountsPage.clickOnIsActiveBox();

	  addNewDiscountsPage.fillDiscountName("Laptop");

	  addNewDiscountsPage.selectDiscountType();

	  addNewDiscountsPage.clickOnUsePercentageBox();
	  
	  addNewDiscountsPage.fillDiscountAmount("");

	  addNewDiscountsPage.clickOnRequiresCouponCodeBox();
	  
	  addNewDiscountsPage.startDate("04-05-2025");
	  
	  addNewDiscountsPage.endDate("29-06-2026");
	  
	  addNewDiscountsPage.cumulativeWithOtherDiscounts();
	  
	  addNewDiscountsPage.discountLimitation();
	  
	  addNewDiscountsPage.adminComment("Nice");
	  
	  addNewDiscountsPage.clickOnSaveButton();
	  
	  Assert.assertTrue(addNewDiscountsPage.isDiscountsAdded(), "Discounts should be added successfully!!");

  }
}
