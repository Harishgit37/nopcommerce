package com.hk.helper;

import java.io.FileInputStream;



import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

 	public String proPath= ".//src//test//resources//configfiles//property.properties";
	public String browser = "browser";
	public String browserName1 = "chrome";
	public String browserName2 = "firefox";
	public String browserName3 = "edge";
	public String ssPath = "screenshotpath";
	public String tdPath = "tdpath";
	public String udPath = "udPath" ;
	public static WebDriver driver;
	public String url = "url";
	public ChromeOptions chromeOptions = new ChromeOptions();
	public FirefoxOptions firefoxOptions = new FirefoxOptions();
	public EdgeOptions edgeOptions = new EdgeOptions();
	
	public FileInputStream fileInputStream;
	public String getProperty(String name) throws IOException  {
		
	    this.fileInputStream = new FileInputStream(this.proPath);
		Properties pro = new Properties();
		pro.load(fileInputStream);
		return pro.getProperty(name);	
	}
	
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		
		 String browser = this.getProperty(this.browser);
		 
		 if(browser.equals(browserName1)){
			 
	            driver = new ChromeDriver();
	            
	        }else if (browser.equals(browserName2)) {
	        	
	            driver = new FirefoxDriver();
	            
	        }else if (browser.equals(browserName3)){
	        	
	            driver = new EdgeDriver();
	        }
		 
	        driver.get(this.getProperty(this.url));
	        driver.manage().window().maximize();
	        Thread.sleep(3000);

	}
	
	@AfterMethod
	public void tearDown(){
		
		driver.quit();
	}
	
	
	public String getData(String sheetName,int row,int cell ) throws  IOException {
		
		this.fileInputStream = new FileInputStream(this.getProperty(this.tdPath));
		XSSFWorkbook workBook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = workBook.getSheet(sheetName);
		XSSFRow xssfRow = sheet.getRow(row);
		XSSFCell xssfCell = xssfRow.getCell(cell);
		return xssfCell.getStringCellValue();
	}
}
