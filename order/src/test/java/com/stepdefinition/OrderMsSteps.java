package com.stepdefinition;

import com.baseclass.Library;
import com.pages.OrderMsPage;
import com.selenium_reuseablefunctions.SeleniumUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderMsSteps extends Library{
	
	OrderMsPage orderMsPage;
	SeleniumUtility seleniumUtility;

	@Given("To launch the browser and Navigate to the Url")
	public void to_launch_the_browser_and_Navigate_to_the_Url() {
	    
		browserSetUp();
		logger.info("Browser launched");
	}

	@When("To Enter the Order Details")
	public void to_Enter_the_Order_Details() {
	    
		orderMsPage=new OrderMsPage(driver);
    	orderMsPage.addAnOrder(properties.getProperty("oId"), properties.getProperty("uId"),
				properties.getProperty("pId"), properties.getProperty("aId"), properties.getProperty("odStatus"));
    	logger.info("Details Entered");
	}

	@Then("To Click the Submit button")
	public void to_Click_the_Submit_button() {
	   
		orderMsPage=new OrderMsPage(driver);
		seleniumUtility=new SeleniumUtility(driver);
    	orderMsPage.submit();
    	
	}
	
	@Then("To Click the view Order")
    public void to_click_the_view_order() {
		
		orderMsPage=new OrderMsPage(driver);
		seleniumUtility=new SeleniumUtility(driver);
		seleniumUtility.switchToAlert();
		orderMsPage.viewAnOrder(properties.getProperty("viewId"));
    }

    @Then("To Click the view All Orders")
    public void to_click_the_view_all_orders() {
    	
    	orderMsPage=new OrderMsPage(driver);
    	seleniumUtility=new SeleniumUtility(driver);
		seleniumUtility.switchToAlert();
    	orderMsPage.viewAllOrders();
    }
    
    @Then("Closing the browser")
    public void closing_the_browser() {
    	
    	tearDown();
    }
}
