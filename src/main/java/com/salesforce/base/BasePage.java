package com.salesforce.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean explicitWaitTimeForLocator(WebElement Element,int waitTime) {
		
		try {
		WebDriverWait wait = new WebDriverWait(driver,waitTime);
		wait.until(ExpectedConditions.visibilityOf(Element));
		return true;
		}
		catch (Exception ex) {
			
			System.out.println("Exception : " + ex.getMessage());
		}
		return false;
		
	}	
	
	public boolean explicitWaitTimeForTitle(String PageTitle , int waitTime) {
		
	    try {
		WebDriverWait wait = new WebDriverWait(driver,waitTime);
		wait.until(ExpectedConditions.titleContains(PageTitle));
		return true;
	    }
	    catch (Exception ex)
	    {
	    	System.out.println("Exception : " + ex.getMessage());
	    }

		return false;
	}

}
