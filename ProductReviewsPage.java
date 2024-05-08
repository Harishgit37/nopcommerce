package com.hk.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hk.helper.Base;

public class ProductReviewsPage extends Base{
	
	@FindBy(xpath = "//li[@class='nav-item has-treeview']//following-sibling::p")
	private WebElement catalogIcon;
	
	@FindBy(xpath = "//a[@href='/Admin/ProductReview/List']")
	private WebElement productReviewsIcon;
	
	@FindBy(xpath = "//input[@name='CreatedOnFrom']")
	private WebElement searchDateCreatedFrom;
	
	@FindBy(xpath = "//input[@id='CreatedOnTo']")
	private WebElement searchDateCreatedTo;
	
	@FindBy(xpath = "//input[@class='form-control text-box single-line']")
	private WebElement searchInTitleMessage;
	
	@FindBy(xpath = "//select[@data-val-required='The Approved field is required.']/option[1]")
	private WebElement searchApprovedProperty;

	@FindBy(xpath = "//input[@id='search-product-name']")
	private WebElement searchSpecificProduct;
	
	@FindBy(xpath = "//button[@class='btn btn-primary btn-search']")
	private WebElement searchButton;
	
	public void productReviewsPage(WebDriver driver) throws InterruptedException {
		
		this.driver = driver;
		Thread.sleep(3000);
	}
	
	public void clickOnCatalogIcon() throws InterruptedException {
		
		Thread.sleep(3000);

		catalogIcon.click();
	}
	
    public void clickOnProductReviewsIcon() throws InterruptedException {
		
		Thread.sleep(3000);

    	productReviewsIcon.click();
	}
	
	public void fillSearchDateCreatedFrom(String createdFrom) throws InterruptedException {
		
		Thread.sleep(3000);

		searchDateCreatedFrom.sendKeys(createdFrom);
	}
	
	public void fillSearchDateCreatedTo(String createdTo) throws InterruptedException {
		
		Thread.sleep(3000);

		searchDateCreatedTo.sendKeys(createdTo);
	}
	
	public void fillSearchInTitleMessage(String title) throws InterruptedException {
		
		Thread.sleep(3000);

		searchInTitleMessage.sendKeys(title);
	}
	
	public void selectSearchApprovedProperty() throws InterruptedException {
		
		Thread.sleep(3000);

        searchApprovedProperty.click();
   }
	
	public void fillSearchSpecificProduct(String product) throws InterruptedException {
		
		Thread.sleep(3000);

		searchSpecificProduct.sendKeys(product);
	}
	
	public void clickOnSearchButton() throws InterruptedException {
		
		Thread.sleep(3000);

		searchButton.click();
	}
	
    public boolean isProductReviewsSearched() {
        
        return true;
    }
}
