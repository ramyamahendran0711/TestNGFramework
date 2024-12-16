package com.salesforce.page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.salesforce.base.BasePage;


public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="username")
	WebElement txtUsername;
	
	@FindBy(id= "password")
	WebElement textPassword;
	
	@FindBy (id ="Login")
	WebElement btnLogin;
	
	@FindBy (name= "rememberUn")
	WebElement rememberMeCheckBox;
	
	@FindBy (id = "hint_back_chooser")
	WebElement rememberUserNameFlag;
	
	@FindBy (id = "error")
	WebElement loginErrorMessage;
	
	@FindBy (id = "forgot_password_link")
	WebElement forgotPasswordLink;
	
	public void enterUsernametxt(String username) {
		txtUsername.clear();
		txtUsername.sendKeys(username);
		
	}
	
	public void enterPasswordtxt(String password) {
		textPassword.clear();
		textPassword.sendKeys(password);
		
	}
	
	public void clickLoginBtn() {
		btnLogin.click();
}
	
	public void checkRememberCheckBox() {
		if (!rememberMeCheckBox.isSelected()){
			rememberMeCheckBox.click();
		} else {
		rememberMeCheckBox.clear();
		rememberMeCheckBox.click();
		}
		
	}
	
	public String rememberMeFlagText() {
		explicitWaitTimeForLocator(rememberUserNameFlag, 10);
		return rememberUserNameFlag.getText();
		
	}
	
	public String loginErrorText() {
		explicitWaitTimeForLocator(loginErrorMessage, 5);
		return loginErrorMessage.getText();
		
	}
	
	public void clickForgotPassword() {
		forgotPasswordLink.click();
}
		
}
