package com.salesforce.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.salesforce.base.BasePage;

public class CheckEmailPage extends BasePage{

	public CheckEmailPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (id = "header")
	WebElement pageTitle;
	
	public String checkEmailTxt() {
		explicitWaitTimeForLocator(pageTitle, 10);
		return pageTitle.getText();
		
	}
}
