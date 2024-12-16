package com.salesforce.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.salesforce.base.BasePage;

public class ForgotPasswordPage extends BasePage{

	public ForgotPasswordPage(WebDriver driver) {
		super(driver);
	}
	
		
	@FindBy(xpath = "//input[@type = 'email']")
	WebElement txtEmail;
	
	@FindBy (xpath = "//input[@type = 'submit']")
	WebElement btnSubmit;
	
	@FindBy (id = "header")
	WebElement pageTitle;
	
	public void enterEmail() {
		txtEmail.sendKeys("ramyamprabhu0711@gmail.com");
	}
	
	public void clickSubmitBtn() {
		btnSubmit.click();
	}
	public String checkpageTitle() {
		explicitWaitTimeForLocator(pageTitle, 10);
		return pageTitle.getText();
		
	}
	
	
	
}


