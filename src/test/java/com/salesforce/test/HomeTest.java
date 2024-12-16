package com.salesforce.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.salesforce.base.BaseTest;
import com.salesforce.page.HomePage;
import com.salesforce.page.LoginPage;

public class HomeTest extends BaseTest{
	
	LoginPage login;
	HomePage home ;
	
	@BeforeMethod
	public void pageLoad() {
		urlLaunch();
		login = new LoginPage(driver);
		home = new HomePage(driver);
	}
	
	
	/*
	 * @BeforeMethod public void pageSetup() { LoginTest loginTest = new
	 * LoginTest(); loginTest.pageLoad(); loginTest.successLogin(); home = new
	 * HomePage(driver);
	 * 
	 * }
	 */
	/*
	 * @Test public void validateUserMenu() {
	 * 
	 * home.clickOnuserNavButton(); home.userMenuDropDown();
	 * 
	 * }
	 */
	@Test
	public void validateMyProfile() {
		
		login.enterUsernametxt("ramyamprabhu0711@gmail.com");
	  	login.enterPasswordtxt("Compaq7#");
	  	login.clickLoginBtn();
		home.clickOnuserNavButton();
		home.clickOnMyProfile();
		
	}
	
	
	  @AfterMethod 
	  public void closeBrowser() {
		  closeDriver(); 
	}
	 

}
