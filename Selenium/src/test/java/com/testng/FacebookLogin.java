package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {
	
	WebDriver driver;
	
	@Test(dataProvider = "FacebookLogin")
	public void loginToFaceBook(String userName, String password) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_h")).click();
		Assert.assertEquals("https://www.facebook.com/", driver.getCurrentUrl());
		System.out.println(driver.getCurrentUrl());
		System.out.println("The user logged in");
	}
	
	@DataProvider(name = "FacebookLogin")
	public Object[][] passData(){
		
		Object[][] data=new Object[3][2];
		
		data[0][0]="9490796399";
		data[0][1]="dbfsfkjsed";
		
		data[1][0]="5678964789";
		data[1][1]="dhshdbx";
		
		data[2][0]="karthik8dhulipala@gmail.com";
		data[2][1]="karthikkkr";
		
		return data;
				
	}
	
	@AfterMethod
	public void tearDown() {
	driver.quit();
	}
}
