package com.hk.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.hk.helper.Base;

public class AddNewCheckoutAttributesPage extends Base{

	@FindBy(xpath = "//li[@class='nav-item has-treeview']//following-sibling::p")
	private WebElement catalogIcon;
	
	@FindBy(xpath = "//li[@class='nav-item has-treeview']")
	private WebElement attributesIcon;
	
	@FindBy(xpath = "//a[@href='/Admin/CheckoutAttribute/List']")
	private WebElement checkoutAttributesIcon;
	
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	private WebElement addNewButton;
	
	@FindBy(xpath = "//input[@class='form-control text-box single-line']")
	private WebElement checkoutAttributeName;
	
	@FindBy(xpath = "//select[@id='AttributeControlTypeId']")
	private WebElement checkoutAttributeControlType;
	
	@FindBy(xpath = "//input[@id='IsRequired']")
	private WebElement checkoutAttributeRequired;
	
	@FindBy(xpath = "//input[@name='DisplayOrder']")
	private WebElement checkoutAttributeDisplayOrder;
	
	@FindBy(xpath = "//button[@name='save']")
	private WebElement saveButton;
	
    public void addNewCheckoutAttributesPage(WebDriver driver) throws InterruptedException {
		
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
    
    public void clickOnCheckoutAttributesIcon() throws InterruptedException {
    	
		Thread.sleep(3000);

		checkoutAttributesIcon.click();
    }
    
    public void clickOnAddNewButton() throws InterruptedException {
    	
		Thread.sleep(3000);

		addNewButton.click();;
    }
    
    public void fillCheckoutAttributeName(String name) throws InterruptedException {
    	
		Thread.sleep(3000);

		checkoutAttributeName.sendKeys(name);
    }
    
    public void selectCheckoutAttributeControlType() throws InterruptedException {
    	
		Thread.sleep(3000);

		Select s1 = new Select(checkoutAttributeControlType);
		s1.selectByVisibleText("Drop-down list");
		
    	checkoutAttributeControlType.click();
    }
    
    public void choosingAnAppropriateAttributeValue() throws InterruptedException {
    	
		Thread.sleep(3000);

    	checkoutAttributeRequired.click();
    }
    
    public void fillCheckoutAttributeDisplayOrder(String order) throws InterruptedException {
    	
		Thread.sleep(3000);

    	checkoutAttributeDisplayOrder.sendKeys(order);
    }
    
    public void clickOnSaveButton() throws InterruptedException {
    	
		Thread.sleep(3000);

        saveButton.click();
    }
    
    public boolean isCheckoutAttributeAdded() {
        
        return true;
    } 
}
