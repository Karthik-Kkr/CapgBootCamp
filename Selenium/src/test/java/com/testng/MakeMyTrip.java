package com.testng;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip {
	
	WebDriver driver;
	
	@BeforeTest
	public void launchApp() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");	
	}
	
	@Test
	public void admin() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/label")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/label")).sendKeys("Banglore");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/label")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[3]/div[7]/div/p[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/p/a")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("bookbutton-RKEY:8a8c00c8-91a7-4877-9f4a-3180e19cb018:7_0")).click();
		driver.findElement(By.xpath("//*[@id=\"fli_list_item_8a6a9d3d-2d99-412d-b3d7-72ce04ea1ee7\"]/div[3]/div[1]/div[2]/div[2]/div[2]/button")).click();
		Thread.sleep(3000);
	}
	
	@AfterTest
	public void close() {
		driver.close();
	}
}
