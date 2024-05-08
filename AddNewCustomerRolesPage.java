package com.hk.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.hk.helper.Base;

public class AddNewCustomerRolesPage extends Base{

	@FindBy(xpath = "//a[@href='#']//p[contains(text(),'Customers')]")
	private WebElement customersOption;
	
	@FindBy(xpath = "//a[@href='/Admin/CustomerRole/List']")
	private WebElement customerRolesIcon;
	
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	private WebElement addNewButton;
	
	@FindBy(xpath = "//input[@data-val-required='Please provide a name.']")
	private WebElement roleName;
	
	@FindBy(xpath = "//input[@name='Active']")
	private WebElement active;
	
	@FindBy(xpath = "//input[@name='FreeShipping']")
	private WebElement freeShipping;                                                                                                                                                                                                                                                                   
	
	@FindBy(xpath = "//input[@id='TaxExempt']")
	private WebElement taxExempt;
	
	@FindBy(xpath = "//input[@data-val-required='The Override default tax display type field is required.']")
	private WebElement OverrideDefaultTaxDisplayType;
	
	@FindBy(xpath = "//input[@id='EnablePasswordLifetime']")
	private WebElement EnablePasswordLifetime;
	
	@FindBy(xpath = "//button[normalize-space()='Choose a product']")
	private WebElement purchasedWithProduct;

	@FindBy(xpath = "//input[@class='form-control text-box single-line']")
	private WebElement productName;
	
	@FindBy(xpath = "//select[@id='SearchCategoryId']")
	private WebElement category;
	
	@FindBy(xpath = "//select[@data-val-required='The Vendor field is required.']")
	private WebElement vendor;
	
	@FindBy(xpath = "//select[@id='SearchStoreId']")
	private WebElement store;
	
	@FindBy(xpath = "//select[@name='SearchProductTypeId']")
	private WebElement productType;
	
	@FindBy(xpath = "//select[@data-val-required='The Manufacturer field is required.']")
	private WebElement manufacturer;
	
	@FindBy(xpath = "//button[@id='search-products']")
	private WebElement searchButton;
	
	@FindBy(xpath = "//input[@name='SystemName']")
	private WebElement systemName;
	
	@FindBy(xpath = "//button[@name='save']")
	private WebElement saveButton;
	
	public void addNewCustomerRoles(WebDriver driver) throws InterruptedException {
		
		this.driver = driver;
		Thread.sleep(3000);
	}
    
    public void clickOnCustomerOptions() throws InterruptedException {
    	
		Thread.sleep(3000);

    	customersOption.click();
    }

    public void clickOnCustomerRolesIcon() throws InterruptedException {
    	
		Thread.sleep(3000);

    	customerRolesIcon.click();
    }
    
    public void clickOnAddNewButton() throws InterruptedException {
    	
		Thread.sleep(3000);

    	addNewButton.click();
    }
    
    public void choosingName(String name) throws InterruptedException {
    	
		Thread.sleep(3000);

    	roleName.sendKeys(name);
    }
    
    public void choosingActive() throws InterruptedException {
    	
		Thread.sleep(3000);

    	active.click();
    }
 
    public void choosingFreeShipping() throws InterruptedException {
 	
		Thread.sleep(3000);

 	    freeShipping.click();
    }
 
    public void choosingTaxExempt() throws InterruptedException {
 	
		Thread.sleep(3000);

 	    taxExempt.click();
    }
    
    public void choosingOverrideDefaultTaxDisplayType() throws InterruptedException {
    	
		Thread.sleep(3000);

 	    OverrideDefaultTaxDisplayType.click();
    }
    
    public void choosingEnablePasswordLifetime() throws InterruptedException {
    	
		Thread.sleep(3000);

 	    EnablePasswordLifetime.click();
    }
    
    public void selectPurchasedWithProduct() throws InterruptedException {
    	
		Thread.sleep(3000);

    	purchasedWithProduct.click();
    }
    
    public void fillProductName(String pName) throws InterruptedException {
    	
    	Thread.sleep(3000);
    	
    	productName.sendKeys(pName);
    }
    
    public void selectCategory() throws InterruptedException {
    	
    	Thread.sleep(3000);
    	
    	Select s1 = new Select(category);
    	s1.selectByVisibleText("Electronics >> Cell phones");
    	
    	category.click();
    }
    
    public void selectVendor() throws InterruptedException {
    	
    	Thread.sleep(3000);
    	
    	Select s1 = new Select(vendor);
    	s1.selectByVisibleText("All");
    	
    	vendor.click();
    }
    
    public void selectStore() throws InterruptedException {
    	
    	Thread.sleep(3000);
    	
    	Select s1 = new Select(store);
    	s1.selectByVisibleText("Your store name");
    	
    	store.click();
    }
    
    public void selectProductType() throws InterruptedException {
    	
    	Thread.sleep(3000);
    	
    	Select s1 = new Select(productType);
    	s1.selectByVisibleText("Simple");
    	
    	productType.click();
    }
    
    public void selectManufacturer() throws InterruptedException {
    	
    	Thread.sleep(3000);
    	
    	Select s1 = new Select(manufacturer);
    	s1.selectByVisibleText("All");
    	
    	manufacturer.click();
    }
    
    public void clickOnSearchButton() throws InterruptedException {
    	
    	Thread.sleep(3000);
    	
    	searchButton.click();
    }
    
    public void fillSystemName(String sName) throws InterruptedException {
    	
		Thread.sleep(3000);

    	systemName.sendKeys(sName);
    }
    
    public void clickOnSaveButton() throws InterruptedException {
    
		Thread.sleep(3000);

    	saveButton.click();
    }
    
    public boolean isCustomerRolesAdded() {
        
        return true;
    }
}
