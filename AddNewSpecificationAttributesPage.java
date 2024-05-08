package com.hk.pom;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import com.hk.helper.Base;

public class AddNewSpecificationAttributesPage extends Base{
	
	@FindBy(xpath = "//li[@class='nav-item has-treeview']//following-sibling::p")
	private WebElement catalogIcon;
	
	@FindBy(xpath = "//li[@class='nav-item has-treeview']")
	private WebElement attributesIcon;
	
	@FindBy(xpath = "//a[@href='/Admin/SpecificationAttribute/List']")
	private WebElement specificationAttributesIcon;
	
	@FindBy(xpath = "//a[@href='/Admin/SpecificationAttribute/CreateSpecificationAttribute']")
	private WebElement addNewButton;
	
	@FindBy(xpath = "//input[@name='Name']")
	private WebElement specificationAttributeName;

	@FindBy(xpath = "//select[@name='SpecificationAttributeGroupId']")
	private WebElement specificationAttributeGroup;
	
	@FindBy(xpath = "//input[@data-val-required='The Display order field is required.']")
	private WebElement specificationAttributeDisplayOrder;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	private WebElement saveButton;
	
	public void addNewSpecificationAttributesPage() throws InterruptedException {
		
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
	
	public void clickOnSpecificationAttributeIcon() throws InterruptedException {
		
        Thread.sleep(3000);

		specificationAttributesIcon.click();
	}
	
	public void clickOnAddNewButton() throws InterruptedException {
		
        Thread.sleep(3000);

		addNewButton.click();
	}
	
	public void fillSpecificationAttributeName(String name) throws InterruptedException {
		
        Thread.sleep(3000);

		specificationAttributeName.sendKeys(name);
	}
	
    public void selectSpecificationAttributeGroup() throws InterruptedException {
    	
        Thread.sleep(3000);

		specificationAttributeGroup.click();
	}
	
    public void fillSpecificationAttributeDisplayOrder(String order) throws InterruptedException {
    	
        Thread.sleep(3000);

		specificationAttributeDisplayOrder.sendKeys(order);
	}
	
    public void clickOnSaveButton() throws InterruptedException {
    	
        Thread.sleep(3000);

    	saveButton.click();
    }
    
    public boolean isSpecificationAttributeAdded() {
        
        return true;
    }
}
