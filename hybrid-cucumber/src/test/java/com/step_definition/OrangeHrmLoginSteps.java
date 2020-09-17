package com.step_definition;

import com.base_class.Library;
import com.pages.OrangeHrmLoginPage;
import com.selenium_reuseablefunctions.SeleniumUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHrmLoginSteps extends Library{
	
	OrangeHrmLoginPage orangeHrmLoginPage;
	SeleniumUtility seleniumUtility;

	@Given("To launch the browser and Navigate to the Url")
	public void to_launch_the_browser_and_Navigate_to_the_Url() {
	    browserSetUp();
	    logger.info("Browser launched");
	    
	}

	@When("To Enter Username and Password")
	public void to_Enter_Username_and_Password() {
	    
		orangeHrmLoginPage=new OrangeHrmLoginPage(driver);
		orangeHrmLoginPage.loginUser(properties.getProperty("username"), properties.getProperty("password"));
		logger.info("Entered username and password");
	}

	@Then("To Click the Submit button")
	public void to_Click_the_Submit_button() {
	    
		orangeHrmLoginPage.submit();
		logger.info("Login button clicked");
	}

	@Then("To Take the Screenshot and the Title")
	public void to_Take_the_Screenshot_and_the_Title() {
	   
		seleniumUtility=new SeleniumUtility(driver);
		seleniumUtility.to_take_screenshot("loginPage1");
		
	}

}
