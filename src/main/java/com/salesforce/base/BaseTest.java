package com.salesforce.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.salesforce.util.PropertyFileReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	protected WebDriver driver;
	PropertyFileReader fileReaderObj;
	
	
	public void urlLaunch() {
		fileReaderObj =  new PropertyFileReader();
		String browerType = fileReaderObj.getPropertyFile("brower");
		driver = getDriver("browerType");
		
		String inputUrl = fileReaderObj.getPropertyFile("url");
		driver.get(inputUrl);
		driver.manage().window().maximize();
	}
	
	
	public WebDriver getDriver(String browser) {
		if (driver == null){
			
		switch (browser){
			case "chrome":					
						WebDriverManager.chromedriver().setup();
						ChromeOptions options = new ChromeOptions();
						options.addArguments("--disable-notifications");
						driver = new ChromeDriver(options);
						break;
			case "firefox":
						WebDriverManager.firefoxdriver().setup();
						driver = new FirefoxDriver(); 
						break;
			case "edge":
						WebDriverManager.edgedriver().setup();
						driver = new EdgeDriver(); 
						break;
				default:
					  WebDriverManager.chromedriver().setup(); 
					  ChromeOptions option = new
					  ChromeOptions(); 
					  option.addArguments("--disable-notifications"); driver = new
					  ChromeDriver(option);
					 
					  break;
			}
		}
		return driver;

	}
	
		
	public void closeDriver(){
		if (driver!=null) {
			driver.close();
			driver= null;
		}
	
	}
	


}
