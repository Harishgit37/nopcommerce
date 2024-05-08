package com.hk.pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import com.hk.helper.Base;

public class AddNewCategoriesPage extends Base{
	
	@FindBy(xpath = "//li[@class='nav-item has-treeview']//following-sibling::p")
	private WebElement catalogIcon;
	
	@FindBy(xpath = "//a[@href='/Admin/Category/List']")
	private WebElement categoriesOption;
	
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	private WebElement addNewButton;
	
	@FindBy(xpath = "//input[@data-val-required='Please provide a name.']")
	private WebElement categoryName;
	
	@FindBy(xpath = "//iframe[@class='tox-edit-area__iframe']")
	private WebElement categoryDescriptionFrame;
	
	@FindBy(xpath = "//body[@data-id='Description']")
	private WebElement categoryDescription;
	
	@FindBy(xpath = "//select[@data-val-required='The Parent category field is required.']")
	private WebElement parentCategory;
	
	@FindBy(xpath = "//input[@title='file input']")
	private WebElement pictureUploadFile;
	
	@FindBy(xpath = "//input[@id='PriceFrom']")
	private WebElement priceFrom;

	@FindBy(xpath = "//input[@id='PriceTo']")
	private WebElement priceTo;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	private WebElement saveButton;

	
	public void AddNewCatagoriesPage(WebDriver driver) throws InterruptedException {
		
	         this.driver = driver; 
	         Thread.sleep(3000);
	}

	public void clickOnCatalogIcon() throws InterruptedException {
		   
            Thread.sleep(3000);

            catalogIcon.click();
 
	}

    public void clickCategoriesOption() throws InterruptedException {     

            Thread.sleep(3000);

            categoriesOption.click();

	}

	public void clickOnAddNewButton() throws InterruptedException {
            

        Thread.sleep(3000);

        addNewButton.click();

	}

    public void fillCategoryName(String name) throws InterruptedException {
            

        Thread.sleep(3000);

        categoryName.sendKeys(name);;

	}

	public void switchToCategoryDescriptionFrame() {
		
	        this.driver.switchTo().frame(categoryDescriptionFrame);
	}

	public void fillCategoryDescription(String description) throws InterruptedException {
       

        Thread.sleep(3000);

        categoryDescription.sendKeys(description);

	}

	public void switchToDefaultContent() {
		
	        this.driver.switchTo().defaultContent();
	}
	    
	public void clickOnParentCategory() throws InterruptedException {
       
            Thread.sleep(3000);
		
		    Select s1 = new Select(parentCategory);
		    s1.selectByVisibleText("Electronics >> Cell phones");
		    
		    parentCategory.click();
	}

    public void pictureUploadFile(String filePath) throws InterruptedException {

    	Thread.sleep(3000);
    	
        pictureUploadFile.sendKeys(filePath);
    	
//    	WebElement pictureInput = driver.findElement(By.xpath("//div[text()='Upload a file']"));
//        pictureInput.sendKeys(filePath);
   
//
//        JavascriptExecutor executor = (JavascriptExecutor) driver;
//        executor.executeScript("arguments[0].click();", pictureUploadFile);
//
//        WebElement fileInput = driver.findElement(By.xpath("//input[@title='file input']"));
//
//        fileInput.sendKeys(filePath);
        
	}
	     
	public void fillPriceFrom(String pFrom) throws InterruptedException {
        
        Thread.sleep(3000);

        priceFrom.sendKeys(pFrom);;

	}
	
	public void fillPriceTo(String pTo) throws InterruptedException {

        Thread.sleep(3000);

        priceTo.sendKeys(pTo);;
	}
	
	public void clickOnSaveButton() throws InterruptedException {
		

        Thread.sleep(3000);

        saveButton.click();
	}
	
    public boolean isCategoriesAdded() {
        
        return true;
    }
}
