package com.seleniumlearning;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrmLogin {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		System.out.println("the title of page is:" + driver.getTitle());
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		System.out.println("the title of page is:" + driver.getTitle());
//		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("the title of page is:" + driver.getTitle());

	}
}
