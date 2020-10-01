package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base_class.Library;
import com.selenium_reuseablefunctions.SeleniumUtility;

public class OrangeHrmLoginPage extends Library{
	
	SeleniumUtility seleniumUtility;

	public OrangeHrmLoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "txtUsername")
	WebElement username;
	
	@FindBy(id = "txtPassword")
	WebElement password;
	
	@FindBy(id = "btnLogin")
	WebElement loginButton;
	
	@FindBy(xpath = "//*[@id='menu_admin_viewAdminModule']")
	WebElement adminDropdown;
	
	public void loginUser(String uname, String pass) {
	
		seleniumUtility = new SeleniumUtility(driver);
		username.sendKeys(uname);
		password.sendKeys(pass);
	
	}
	
	public void submit() {
		
		loginButton.click();
	}
}
