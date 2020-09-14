package com.seleniumlearning;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadLessBrowser {
	public static void main(String[] args) {
		
//		WebDriverManager.chromedriver().setup();
		WebDriver driver = new HtmlUnitDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());
	}

}
