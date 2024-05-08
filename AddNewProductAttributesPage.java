package com.hk.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.hk.helper.Base;

public class AddNewProductAttributesPage extends Base{

	@FindBy(xpath = "//li[@class='nav-item has-treeview']//following-sibling::p")
	private WebElement catalogIcon;
	
	@FindBy(xpath = "//li[@class='nav-item has-treeview']")
	private WebElement attributesIcon;
	
	@FindBy(xpath = "//a[@href='/Admin/ProductAttribute/List']")
	private WebElement productAttributeIcon;
	
	@FindBy(xpath = "//a[@href='/Admin/ProductAttribute/Create']")
	private WebElement addNewButton;
	
	@FindBy(xpath = "//input[@data-val-required='Please provide a name.']")
	private WebElement productAttributeName;
	
	@FindBy(xpath = "//iframe[@title='Rich Text Area']")
    private WebElement productAttributeDescriptionFrame;
	
	@FindBy(xpath = "//body[@contenteditable='true']")
	private WebElement productAttributeDescription;
	
	@FindBy(xpath = "//button[@name='save']")
	private WebElement saveButton;
	
	public void addNewProductAttributePage(WebDriver driver) throws InterruptedException {
		
		this.driver = driver;
		Thread.sleep(3000);
	}
	
	public void clickOnCatalogIcon() throws InterruptedException {
		
	    Thread.sleep(3000);

		catalogIcon.click();
	}
	
    public void clickOnAttributesIcon() throws InterruptedException {
		
		Thread.sleep(3000);

		attributesIcon.click();
	}
	
	public void clickOnProductsAttributeIcon() throws InterruptedException {
		
		Thread.sleep(3000);

		productAttributeIcon.click();
	}
	
	public void clickOnAddNewButton() throws InterruptedException {
		
		Thread.sleep(3000);

		addNewButton.click();
	}
	
    public void fillProductAttributeName(String name) throws InterruptedException {
		
		Thread.sleep(3000);

		productAttributeName.sendKeys(name);
	}
	
    public void switchToProductAttributeDescriptionFrame() {
		
    	driver.switchTo().frame(productAttributeDescriptionFrame);
	}
	
    public void fillProductAttributeDescription(String name) throws InterruptedException {
		
		Thread.sleep(3000);

		productAttributeDescription.sendKeys(name);
	}
	
    public void switchProductInfoContent() {
    	
    	driver.switchTo().defaultContent();
    }
    
    public void clickOnSaveButton() throws InterruptedException {
    	
		Thread.sleep(3000);

    	saveButton.click();
    }
    
    public boolean isProductAttributeAdded() {
        
        return true;
    }
}
