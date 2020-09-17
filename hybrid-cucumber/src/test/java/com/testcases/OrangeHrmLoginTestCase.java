package com.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base_class.Library;
import com.pages.OrangeHrmLoginPage;
import com.selenium_reuseablefunctions.SeleniumUtility;

public class OrangeHrmLoginTestCase extends Library{
	
	OrangeHrmLoginPage lPage;
	SeleniumUtility utility;
	
	@BeforeTest
	public void launchApp() {
		
//		launchApplication("chrome", "https://opensource-demo.orangehrmlive.com/");
		browserSetUp();
		logger.info("Browser launched");
	}
	
	@Test
	public void login() {
		
		lPage= new OrangeHrmLoginPage(driver);
//		lPage.loginUser("Admin", "admin123");
		lPage.loginUser(properties.getProperty("username"),properties.getProperty("password"));
		logger.info("Browser login successful");
	}
	
	@AfterTest
	public void closeApp() {
		
		utility= new SeleniumUtility(driver);
		utility.getTitle();
		utility.to_take_screenshot("login");
		tearDown();
		logger.info("Closing Browser");
	}

}
