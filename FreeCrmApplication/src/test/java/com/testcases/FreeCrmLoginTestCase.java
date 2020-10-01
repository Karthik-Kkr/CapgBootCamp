package com.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.base_class.Library;
import com.pages.FreeCrmLoginPage;
import com.selenium_reuseablefunctions.SeleniumUtility;

public class FreeCrmLoginTestCase extends Library{

	FreeCrmLoginPage crmLogin;
	SeleniumUtility utility;
	
	@BeforeTest
	public void launchApp() {
		
		browserSetUp();
		logger.info("Browser launched");
	}
	
	@Test
	public void login() {
		crmLogin= new FreeCrmLoginPage(driver);
		crmLogin.loginUser(properties.getProperty("username"), properties.getProperty("password"));
		logger.info("login successful");
	}
	
	@Test
	public void enterHome() {
		crmLogin= new FreeCrmLoginPage(driver);
		crmLogin.home();
	}
	
	@AfterTest
	public void closeApp() {
		
		utility= new SeleniumUtility(driver);
		utility.to_take_screenshot("login");
		tearDown();
		logger.info("Closing Browser");	
	}		
}
