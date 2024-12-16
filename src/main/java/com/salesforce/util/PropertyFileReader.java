package com.salesforce.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {
	
	public String getPropertyFile(String inputKey) {
		String filePath = "D:\\Ramya\\WhiteBoxTesting\\SalesForceFramework\\SaleForceFramework\\applications\\application.properties";
		FileInputStream fileObject = null;
		String valueOutput;
		try {
			fileObject= new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Properties fileProperties = new Properties();
		try {
			fileProperties.load(fileObject);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		valueOutput = fileProperties.getProperty(inputKey);
		return valueOutput;
		
	}

}


