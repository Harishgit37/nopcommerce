package com.hk.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.Select;

import com.hk.helper.Base;

public class AddNewProductPage extends Base{

	@FindBy(xpath = "//li[@class='nav-item has-treeview']//following-sibling::p")
	private WebElement catalogIcon;
	
	@FindBy(xpath = "//a[@href='/Admin/Product/List']//following-sibling::p")
	private WebElement productsOption;
	
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	private WebElement addNewButton;
	
	@FindBy(xpath = "//input[@name='Name']")
	private WebElement productName;
	
	@FindBy(xpath = "//textarea[@name='ShortDescription']")
	private WebElement shortDescription;
	
	@FindBy(xpath = "//iframe[@id='FullDescription_ifr']")
	private WebElement fullDescriptionFrame;
	
	@FindBy(xpath = "//body[@data-id='FullDescription']")
	private WebElement fullDescription;

	@FindBy(xpath = "//input[@id='Sku']")
	private WebElement sku;

	@FindBy(xpath = "//select[@id='SelectedCategoryIds']")
	private WebElement categories;

	@FindBy(xpath = "//select[@id='SelectedManufacturerIds']")
	private WebElement manufactures;

	@FindBy(xpath = "//input[@name='Published']")
	private WebElement published;
	
	@FindBy(xpath = "//ul[@class='tag-editor ui-sortable']/descendant :: li[2]")
	private WebElement productTags;
    
	@FindBy(xpath = "//input[@id='ShowOnHomepage']")
	private WebElement showOnHomePage;
	
	@FindBy(xpath = "//select[@name='ProductTypeId']")
	private WebElement productType;

	@FindBy(xpath = "//input[@id='VisibleIndividually']")
	private WebElement visibleIndividually;
	
	@FindBy(xpath = "//input[@aria-owns='SelectedCustomerRoleIds_taglist SelectedCustomerRoleIds_listbox']")
	private WebElement customerRoles;

	@FindBy(xpath = "//input[@data-val-required='The Allow customer reviews field is required.']")
	private WebElement allowCustomerReviews;
	
	@FindBy(xpath = "//input[@id='AvailableStartDateTimeUtc']")
	private WebElement availableStartDate;

	@FindBy(xpath = "//input[@id='AvailableEndDateTimeUtc']")
	private WebElement availableEndDate;

	@FindBy(xpath = "//input[@aria-valuemin='-7.922816251426434e+28']")
	private WebElement prices;

	@FindBy(xpath = "//button[@name='save']")
	private WebElement saveButton;

	
	public void addNewProductPage(WebDriver driver) throws InterruptedException {
		
		 this.driver = driver;
	     Thread.sleep(3000);

	}
	
	public void clickOnCatalogIcon() throws InterruptedException {
		
        Thread.sleep(3000);

        catalogIcon.click();
    }
	
	public void clickOnProductsOption() throws InterruptedException{
		
        Thread.sleep(3000);

		productsOption.click();
	}
	
	public void clickOnAddNewButton() throws InterruptedException {
		
        Thread.sleep(3000);

        addNewButton.click();
    }
	
	public void fillProductName(String name) throws InterruptedException {
		
        Thread.sleep(3000);

		productName.sendKeys(name);
	}
	
    public void fillShortDescription(String sD) throws InterruptedException {
    	
        Thread.sleep(3000);

		shortDescription.sendKeys(sD);
	}
    
    public void switchToFullDescriptionFrame() {
    	
    	driver.switchTo().frame(fullDescriptionFrame);
    }
    
    public void fillFullDescription(String fD) throws InterruptedException {
    	
        Thread.sleep(3000);

    	fullDescription.sendKeys(fD);
    }
    
    public void switchProductInfoContent() {
    	
    	driver.switchTo().defaultContent();
    }
    
    public void fillSku(String sKu) throws InterruptedException {
    	
        Thread.sleep(3000);

    	sku.sendKeys(sKu);
    }
    
    public void clickOnCategoriesIcon() throws InterruptedException {
    	
        Thread.sleep(3000);
        
        Select s1 = new Select(categories);
	    s1.selectByVisibleText("Electronics >> Cell phones");
	    
    	categories.click();
    }
    
    public void clickOnManufacturesIcon() throws InterruptedException {
    	
        Thread.sleep(3000);

        Select s1 = new Select(manufactures);
	    s1.selectByVisibleText("Apple");
	    
    	manufactures.click();
    }
    
    public void clickPublisedCheckBox() throws InterruptedException {
    	
        Thread.sleep(3000);

        boolean check = published.isSelected();
        if (check==false) {
        	    published.click();
        }else {
        	System.out.println("It's already clicked!");
        }
        
    	published.click();
    }
 
    public void clickOnProductTags(String pTags) throws InterruptedException {
    	
        Thread.sleep(3000);

        productTags.sendKeys(pTags);
    }
    
    public void clickShowOnHomePageCheckBox() throws InterruptedException {
    	
        Thread.sleep(3000);

        boolean check = showOnHomePage.isSelected();
        if (check==false) {
        	    showOnHomePage.click();
        }else {
        	System.out.println("It's already clicked!");
        }
        
    	showOnHomePage.click();
    }

    public void clickOnProductType(String pType) throws InterruptedException {
    	
        Thread.sleep(3000);

    	productType.sendKeys(pType);
    }
    
    public void clickVisibleIndividuallyCheckBox() throws InterruptedException {
     	
        Thread.sleep(3000);

        boolean check = visibleIndividually.isSelected();
        if (check==false) {
        	    visibleIndividually.click();
        }else {
        	System.out.println("It's already clicked!");
        }
        
 	    visibleIndividually.click();
    }
    
    public void clickOnCustomerRoles() throws InterruptedException {
    	
        Thread.sleep(3000);

    	customerRoles.click();;
    }
    
    public void clickAllowCustomerReviewsCheckBox() throws InterruptedException {
     	
        Thread.sleep(3000);

        boolean check = allowCustomerReviews.isSelected();
        if (check==false) {
        	    allowCustomerReviews.click();
        }else {
        	System.out.println("It's already clicked!");
        }
        
 	    allowCustomerReviews.click();
    }
    
    public void fillAvailableStartDate(String avlStartDate) throws InterruptedException {
    	
        Thread.sleep(3000);

    	availableStartDate.sendKeys(avlStartDate);
    }
    
    public void fillAvailableEndDate(String avlEndDate) throws InterruptedException {
    	
        Thread.sleep(3000);

	    availableEndDate.sendKeys(avlEndDate);
    }
    
    public void fillPrices(String price) throws InterruptedException {
    	
        Thread.sleep(3000);

	    prices.sendKeys(price);
    }
    
    public void clickOnSaveButton() throws InterruptedException {
    	
        Thread.sleep(3000);

    	saveButton.click();
    }
    
    public boolean isProductAdded() {
        
        return true;
    }
}
