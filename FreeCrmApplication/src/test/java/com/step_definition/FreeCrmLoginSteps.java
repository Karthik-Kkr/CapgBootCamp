package com.step_definition;

import com.base_class.Library;
import com.pages.FreeCrmLoginPage;
import com.selenium_reuseablefunctions.SeleniumUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FreeCrmLoginSteps extends Library{
	
	FreeCrmLoginPage freeCrmLoginPage;
	SeleniumUtility seleniumUtility;
	
	@Given("To launch the browser and Navigate to the Url")
	public void to_launch_the_browser_and_Navigate_to_the_Url() {
		
	    browserSetUp();
	    logger.info("browser launched");
	}

	@When("To Enter Username and Password")
	public void to_Enter_Username_and_Password() {
	    
		freeCrmLoginPage= new FreeCrmLoginPage(driver);
		freeCrmLoginPage.loginUser(properties.getProperty("username"), properties.getProperty("password"));
		logger.info("Entered Username and Password");
	}

	@Then("To Click the Submit button")
	public void to_Click_the_Submit_button() {
		
	    freeCrmLoginPage.submit();
	}

	@Then("To Take the Screenshot and the Title")
	public void to_Take_the_Screenshot_and_the_Title() {
	    
		seleniumUtility=new SeleniumUtility(driver);
		seleniumUtility.to_take_screenshot("Login");
		logger.info("Screenshot was clicked after login");
	}
	
	@Then("To open home page")
	public void to_open_home_page() {
	   
		freeCrmLoginPage= new FreeCrmLoginPage(driver);
		seleniumUtility=new SeleniumUtility(driver);
		freeCrmLoginPage.home();
		seleniumUtility.to_take_screenshot("Home");
	}

	@Then("To open calender page")
	public void to_open_calender_page() {
	    
		freeCrmLoginPage= new FreeCrmLoginPage(driver);
		seleniumUtility=new SeleniumUtility(driver);
		freeCrmLoginPage.calender();
		seleniumUtility.to_take_screenshot("Calender");
	}

	@Then("To open contacts page")
	public void to_open_contacts_page() {
	    
		freeCrmLoginPage= new FreeCrmLoginPage(driver);
		seleniumUtility=new SeleniumUtility(driver);
		freeCrmLoginPage.contacts();
		seleniumUtility.to_take_screenshot("Contacts");
	}

	@Then("To open companies page")
	public void to_open_companies_page() {
	    
		freeCrmLoginPage= new FreeCrmLoginPage(driver);
		seleniumUtility=new SeleniumUtility(driver);
		freeCrmLoginPage.companies();
		seleniumUtility.to_take_screenshot("Companies");
	}

	@Then("To open deals page")
	public void to_open_deals_page() {
	    
		freeCrmLoginPage= new FreeCrmLoginPage(driver);
		seleniumUtility=new SeleniumUtility(driver);
		freeCrmLoginPage.deals();
		seleniumUtility.to_take_screenshot("Deals");
	}
}
