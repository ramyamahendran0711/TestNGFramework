package com.salesforce.page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.salesforce.base.BasePage;

public class AccountsPage extends BasePage{
	
	@FindBy (xpath ="//div[@class='lbBody']/ul/li/span/a")
	List<WebElement> toolsLinks;

	public AccountsPage(WebDriver driver) {
		super(driver);
	}
	
	
	
}

