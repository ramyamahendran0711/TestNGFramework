package com.salesforce.page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.salesforce.base.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (id= "userNavButton")
	WebElement userProfileButton;
	
	@FindBy (xpath="//a[text() ='Logout']")
	WebElement logOut;
	
	@FindBy (xpath = "//a[text()='My Profile']")
	WebElement myProfile;
	
	@FindBy (id ="Account_Tab")
	WebElement accountsTab;
	
	@FindBy (xpath ="//h1[contains(text(),'Accounts')]")
	WebElement accountsPageTitle;
	/*
	 * @FindBy (id = "userNav-menuItems") WebElement userMenuDiv;
	 * 
	 * List<WebElement> userMenu = userMenuDiv.findElements(By.xpath(
	 * ".//a[contains(@class,'menuButtonMenuLink')]"));
	 * 
	 * ArrayList<String> actualList = new ArrayList<String>();
	 */
	
		
	public void clickOnuserNavButton() {
		explicitWaitTimeForLocator(userProfileButton, 10);
		userProfileButton.click();
	}
	
	public void clickOnLogout() {
		explicitWaitTimeForLocator(logOut, 10);
		logOut.click();
	}
	
	public void clickOnMyProfile() {
		explicitWaitTimeForLocator(myProfile, 10);
		myProfile.click();
	}
	
	public void clickOnAccountsTab() {
		explicitWaitTimeForLocator(accountsTab, 10);
		accountsTab.click();
	}
	
	public String accountsPageTitle() {
		return accountsPageTitle.getText();
		
	}
	
	/*
	 * public ArrayList<String> userMenuDropDown() {
	 * 
	 * for (WebElement element : userMenu) { actualList.add(element.getText()); }
	 * return actualList; }
	 */
}


