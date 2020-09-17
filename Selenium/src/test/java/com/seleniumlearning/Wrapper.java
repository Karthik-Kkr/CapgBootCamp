package com.seleniumlearning;

import java.io.IOException;

public class Wrapper {

	public static void main(String[] args) throws IOException  {
		
		  WrapperMethod wm = new WrapperMethod();
		  wm.insertapp("https://opensource-demo.orangehrmlive.com/");
		  wm.enterbyid("txtUsername", "Admin");
		  wm.enterbyid("txtPassword", "admin123");
		  wm.clickbyId("btnLogin");
		  wm.takesnap("src/test/resources/Screenshots/filebin1.png");
		  wm.closeapp();
	}
}
