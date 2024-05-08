package com.hk.pom;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import com.hk.helper.Base;

public class AdminDashboardPage extends Base{

	@FindBy(xpath = " //p[text()=' Dashboard']")
	WebElement dashBoardTitle;

	public WebElement getDashBoardTitle() {
		return dashBoardTitle;
	}
	
}
