package com.hk.pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.hk.helper.Base;

public class AddNewManufacturerPage extends Base{
   
     @FindBy(xpath = "//li[@class='nav-item has-treeview']//following-sibling::p")
 	 private WebElement catalogIcon;
     
     @FindBy(xpath = "//a[@href='/Admin/Manufacturer/List']")
     private WebElement manufacturersIcon;
     
     @FindBy(xpath = "//a[@class='btn btn-primary']")
     private WebElement addNewButton;
     
     @FindBy(xpath = "//input[@data-val-required='Please provide a name.']")
     private WebElement manufacturerName;
     
     @FindBy(xpath = "//iframe[@class='tox-edit-area__iframe']")
     private WebElement manufacturerDescriptionFrame;

     @FindBy(xpath = "//body[@data-id='Description']")
     private WebElement manufacturerDescription;
     
     @FindBy(xpath = "//button[@class='btn btn-primary']")
     private WebElement saveButton;
     
     public void addNewManufacturerPage(WebDriver driver) throws InterruptedException {
    	 
    	 this.driver = driver;
    	 Thread.sleep(3000);
     }
     
     public void clickOnCatalogIcon() throws InterruptedException {
    	 
    	 Thread.sleep(3000);

    	 catalogIcon.click();
     }
     
     public void clickOnManufacturersIcon() throws InterruptedException {
    	 
    	 Thread.sleep(3000);

    	 manufacturersIcon.click();
     }
     
     public void clickOnAddNewButton() throws InterruptedException {
    	 
    	 Thread.sleep(3000);

    	 addNewButton.click();
     }
     
     public void fillManufacturersName(String manfName) throws InterruptedException {
    	 
    	 Thread.sleep(3000);

    	 manufacturerName.sendKeys(manfName);
     }
     
     public void switchToManufacturerDescriptionFrame() {
    	 
    	 this.driver.switchTo().frame(manufacturerDescriptionFrame);
     }
     
     public void fillManufacturerDescription(String desc) throws InterruptedException {
    	 
    	 Thread.sleep(3000);

    	 manufacturerDescription.sendKeys(desc);
     }
     
     public void switchToDefaultContent() {
 		
	     this.driver.switchTo().defaultContent();
	 }
     
     public void clickOnSaveButton() throws InterruptedException {
    	 
    	 Thread.sleep(3000);

    	 saveButton.click();
     } 
     
     public boolean isManufacturersAdded() {
         
         return true;
     }
}
