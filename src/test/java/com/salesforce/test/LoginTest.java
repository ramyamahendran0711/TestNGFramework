package com.salesforce.test;

import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.salesforce.base.BaseTest;
import com.salesforce.page.CheckEmailPage;
import com.salesforce.page.ForgotPasswordPage;
import com.salesforce.page.HomePage;
import com.salesforce.page.LoginPage;

public class LoginTest extends BaseTest{
	
	LoginPage login;
	HomePage home;
	
	@BeforeMethod
	public void pageLoad() {
		urlLaunch();
		login = new LoginPage(driver);
	}
	
		
	@Test
	public void successLogin() {
		login.enterUsernametxt("ramyamprabhu0711@gmail.com");
		login.enterPasswordtxt("Compaq7#");
		login.clickLoginBtn();
		//Assert.assertTrue(driver.getTitle().contains("Salesforce"));
	}
	
	@Test
	public void loginFailed() {
		login.enterUsernametxt("test@gmail.com");
		login.enterPasswordtxt("test#");
		login.clickLoginBtn();
		Assert.assertTrue(login.loginErrorText().contains("Please check your username and password"));
	}
	@Test
	public void passwordEmpty() {
		login.enterUsernametxt("ramyamprabhu0711@gmail.com");
		login.enterPasswordtxt(" ");
		login.clickLoginBtn();
	}
	
	@Test
	public void rememberMeFunctionality() {
		
		HomePage home = new HomePage(driver);
		login.enterUsernametxt("ramyamprabhu0711@gmail.com");
		login.enterPasswordtxt("Compaq7#");
		login.checkRememberCheckBox();
		login.clickLoginBtn();
		home.clickOnuserNavButton();
		home.clickOnLogout();
		Assert.assertTrue(login.rememberMeFlagText().contains("Saved Username"));
		
	}
	@Test
		public void checkForgotPasswordFunctionality() {
		
		ForgotPasswordPage forgotPage = new ForgotPasswordPage(driver);
		CheckEmailPage chkEmailPage = new CheckEmailPage(driver);
		
		login.clickForgotPassword();
		Assert.assertTrue(forgotPage.checkpageTitle().contains("Forgot Your Password"));
		forgotPage.enterEmail();
		forgotPage.clickSubmitBtn();
		Assert.assertTrue(chkEmailPage.checkEmailTxt().contains("Check Your Email"));
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		closeDriver();
	}

}
