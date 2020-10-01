package com.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseclass.Library;
import com.pages.OrderMsPage;
import com.selenium_reuseablefunctions.SeleniumUtility;

public class OrderMsTestCase extends Library {

	OrderMsPage orderPage;
	SeleniumUtility utility;

	@BeforeTest
	public void launchApp() {

		browserSetUp();
		logger.info("Browser launched");
//		utility.switchToAlert();
	}

	@Test
	public void addAnOrder() {
		
		utility= new SeleniumUtility(driver);
		utility.switchToAlert();
		orderPage = new OrderMsPage(driver);
		utility.switchToAlert();
		orderPage.addAnOrder(properties.getProperty("oId"), properties.getProperty("uId"),
				properties.getProperty("pId"), properties.getProperty("aId"), properties.getProperty("odStatus"));
		logger.info("Added Order");
		utility.switchToAlert();
		orderPage.submit();
		utility.switchToAlert();
		utility.to_take_screenshot("OrderAdded");
		utility.switchToAlert();
	}
	
	@Test
	public void viewOrders() {
		
		utility= new SeleniumUtility(driver);
		orderPage = new OrderMsPage(driver);
		utility.switchToAlert();
		orderPage.viewAllOrders();
		utility.to_take_screenshot("AllOrders");
		utility.switchToAlert();
		
	}

	@AfterTest
	public void closeApp() {
				
		utility= new SeleniumUtility(driver);
		tearDown();
		logger.info("Closing Browser");	
	}		
}



//@Test
//public void deleteAnOrder() {
//	
//	utility= new SeleniumUtility(driver);
//	orderPage = new OrderMsPage(driver);
//	utility.switchToAlert();
//	orderPage.deleteAnOrder();
//	utility.switchToAlert();
//	
//}

//@Test
//public void viewAnOrder() {
//	
//	utility= new SeleniumUtility(driver);
//	orderPage = new OrderMsPage(driver);
//	utility.switchToAlert();
//	orderPage.viewAnOrder(properties.getProperty("viewId"));
//	utility.switchToAlert();
//	utility.to_take_screenshot("OrderDetails");
//	utility.switchToAlert();
//	
//}