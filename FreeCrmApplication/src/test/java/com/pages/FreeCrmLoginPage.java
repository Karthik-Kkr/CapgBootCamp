package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base_class.Library;
import com.selenium_reuseablefunctions.SeleniumUtility;

public class FreeCrmLoginPage extends Library{
	
	SeleniumUtility seleniumUtility;
	
	public FreeCrmLoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a")
	WebElement login;
	
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div/form/div/div[1]/div/input")
	WebElement username;
	
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div/form/div/div[2]/div/input")
	WebElement password;
	
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div/form/div/div[3]")
	WebElement loginButton;
	
	@FindBy(xpath = "//*[@id=\"main-nav\"]/a[1]/span")
	WebElement home;
	
	@FindBy(xpath = "//*[@id=\"main-nav\"]/a[2]/span")
	WebElement calender;
	
	@FindBy(xpath = "//*[@id=\"main-nav\"]/a[3]/span")
	WebElement contacts;
	
	@FindBy(xpath = "//*[@id=\"main-nav\"]/a[4]/span")
	WebElement companies;
	
	@FindBy(xpath = "//*[@id=\"main-nav\"]/a[5]/span")
	WebElement deals;
	
	public void loginUser(String uname, String pass) {
		
		seleniumUtility = new SeleniumUtility(driver);
		login.click();
		username.sendKeys(uname);
		password.sendKeys(pass);		
	}
	
	public void submit() {		
		loginButton.click();
	}
	
	public void home() {		
		home.click();
	}
	
	public void calender() {		
		calender.click();
	}
	
	public void contacts() {	
		contacts.click();
	}
	
	public void companies() {
		companies.click();
	}
	
	public void deals() {
		deals.click();
	}
}
