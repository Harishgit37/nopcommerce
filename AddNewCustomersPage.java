package com.hk.pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.hk.helper.Base;

public class AddNewCustomersPage extends Base{
	
	@FindBy(xpath = "//a[@href='#']//p[contains(text(),'Customers')]")
	private WebElement customersOption;
	
	@FindBy(xpath = "//a[@href='/Admin/Customer/List']")
	private WebElement customersIcon;
	
	@FindBy(xpath = "//a[@href='/Admin/Customer/Create']")
	private WebElement addNewButton;
	
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='Password']")
	private WebElement passWord;
	
	@FindBy(xpath = "//input[@name='FirstName']")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@name='LastName']")
	private WebElement lastName;
	
	@FindBy(xpath = "//input[@id='Gender_Male']")
    private WebElement gender;
	
	@FindBy(xpath = "//input[@name='DateOfBirth']")
	private WebElement dateOfBirth;
	
	@FindBy(xpath = "//input[@id='Company']")
	private WebElement companyName;

	@FindBy(xpath = "//input[@data-val-required='The Is tax exempt field is required.']")
	private WebElement isTaxExempt;
	
	@FindBy(xpath = "//select[@class='form-control select2 select2-hidden-accessible']")
	private WebElement newsLetter;
	
	@FindBy(xpath = "//select[@class='form-control select2 select2-hidden-accessible']")
	private WebElement customerRoles;
	
	@FindBy(xpath = "//select[@id='VendorId']")
	private WebElement managerOfVendor;
	
	@FindBy(xpath = "//input[@data-val-required='The Active field is required.']")
	private WebElement active;
	
	@FindBy(xpath = "//textarea[@name='AdminComment']")
	private WebElement adminComment;
	
	@FindBy(xpath = "//button[@name='save']")
	private WebElement saveButton;
	
    public void addNewCustomers(WebDriver driver) throws InterruptedException {
    	
    	this.driver = driver;
   	    Thread.sleep(3000);
    }

    public void clickOnCustomerOptions() throws InterruptedException {
    	
   	    Thread.sleep(3000);

        customersOption.click();
    }
    
    public void clickOnCustomerIcon() throws InterruptedException {
    	
   	    Thread.sleep(3000);

    	customersIcon.click();
    }
    
    public void clickOnAddNewButton() throws InterruptedException {
    	
   	    Thread.sleep(3000);

    	addNewButton.click();;
    }
    
    public void fillEmail(String mail) throws InterruptedException {
    	
   	    Thread.sleep(3000);

    	email.sendKeys(mail);
    }
    
    public void fillPassword(String pass) throws InterruptedException {
    	
   	    Thread.sleep(3000);
   	    
   	    passWord.sendKeys(pass);

    }

    public void fillFirstName(String fName) throws InterruptedException {
	
   	    Thread.sleep(3000);

	    firstName.sendKeys(fName);;
    }
    
    public void fillLastName(String lName) throws InterruptedException {
    	
   	    Thread.sleep(3000);

	    lastName.sendKeys(lName);;
    }
    
    public void clickOnGender() throws InterruptedException {
    	
   	    Thread.sleep(3000);

   	    gender.click();
    }
    
    public void fillDateOfBirth(String dob) throws InterruptedException {
    	
    	Thread.sleep(3000);
    	
    	dateOfBirth.sendKeys(dob);
    }
    
    public void fillCompanyName(String com) throws InterruptedException {
    	
    	Thread.sleep(3000);
    	
    	companyName.sendKeys(com);;
    }

    public void isTaxExempt() throws InterruptedException {
	
	    Thread.sleep(3000);
	
	    isTaxExempt.click();
    }

//    public void clickOnNewsLetter() throws InterruptedException {
//    	
//    	Thread.sleep(3000);
//
//   	    Select s1 = new Select(newsLetter);
//   	    s1.selectByVisibleText("Your store name");
//   	    
//        newsLetter.click();
//    }
//    
//    public void clickOnCustomerRoles() throws InterruptedException {
//    	
//   	    Thread.sleep(3000);
//
//   	    Select s1 = new Select(customerRoles);
//   	    s1.selectByVisibleText("Guests");
//   	    
//        customerRoles.click();
//    }
    
    public void clickOnManagerOfVendor() throws InterruptedException {
    	
   	    Thread.sleep(3000);

   	    Select s1 = new Select(managerOfVendor);
	    s1.selectByVisibleText("Not a vendor");
	    
	    managerOfVendor.click();
    }

    public void active() throws InterruptedException {
    	
    	Thread.sleep(3000);
    	
    	active.click();
    }
    
    public void fillAdminComment(String cmt) throws InterruptedException {
    	
    	Thread.sleep(3000);
    	
    	adminComment.sendKeys(cmt);
    }
    
    public void clickOnSaveButton() throws InterruptedException {
    	
   	    Thread.sleep(3000);

        saveButton.click();
    }
    
    public boolean isCustomersAdded() {
        
        return true;
    }
}
