package com.hk.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hk.helper.Base;

public class ProductTagsPage extends Base{
	
	@FindBy(xpath = "//li[@class='nav-item has-treeview']//following-sibling::p")
	private WebElement catalogIcon;
	
	@FindBy(xpath = "//a[@href='/Admin/Product/ProductTags']")
	private WebElement productTags;
	
	@FindBy(xpath = "//input[@name='SearchTagName']")
	private WebElement productTagName;
	
	@FindBy(xpath = "//button[@id='search-product-tags']")
	private WebElement searchButton;
	
	public void productTags(WebDriver driver) throws InterruptedException {
		
		this.driver = driver;
        Thread.sleep(3000);
	}
	
	public void clickOnCatalogIcon() throws InterruptedException {
		
        Thread.sleep(3000);

        catalogIcon.click();
	}
	
	public void clickOnProductTagsIcon() throws InterruptedException {
		
        Thread.sleep(3000);

        productTags.click();
	}
	
    public void fillProductTagName(String name) throws InterruptedException {
		
        Thread.sleep(3000);

		productTagName.sendKeys(name);
	}
	
	public void clickOnSearchButton() throws InterruptedException {
		
        Thread.sleep(3000);

        searchButton.click();
	}
	
	public boolean isProductTagsSearched() {
        
        return true;
    }
}
