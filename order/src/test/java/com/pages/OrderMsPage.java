package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Library;
import com.selenium_reuseablefunctions.SeleniumUtility;

public class OrderMsPage extends Library{
	
	SeleniumUtility seleniumUtility;
		
	public OrderMsPage(WebDriver driver) {
			
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "/html/body/app-root/body/app-routing/div/nav/ul/div[1]/button/li/a")
	WebElement addingOrder;	
	@FindBy(id = "oId")
	WebElement oId;
	@FindBy(id = "uId")
	WebElement uId;		
	@FindBy(id = "pId")
	WebElement pId;	
	@FindBy(id = "aId")
	WebElement aId;	
	@FindBy(id = "odId")
	WebElement odStatus;	
	@FindBy(xpath = "/html/body/app-root/body/app-routing/app-add-order/form/button")
	WebElement addOrder;
	
		
	@FindBy(xpath = "/html/body/app-root/body/app-routing/div/nav/ul/div[2]/button/li/a")
	WebElement viewOrder;
	@FindBy(xpath = "//*[@id=\"oId\"]")
	WebElement viewId;
	@FindBy(xpath = "/html/body/app-root/body/app-routing/app-view-order/form/button")
	WebElement viewIdDetails;
	
	
	@FindBy(xpath = "/html/body/app-root/body/app-routing/div/nav/ul/div[3]/button/li/a")
	WebElement viewAllOrders;
	
	@FindBy(xpath = "/html/body/app-root/body/app-routing/div/nav/ul/div[4]/button/li/a")
	WebElement deleteOrder;
	@FindBy(xpath = "/html/body/app-root/body/app-routing/app-delete-order/table/tr[2]/td[9]/button")
	WebElement delete;
	
	public void addAnOrder(String orderId, String userId, String productId, String addressId, String orderDispatcherStatus) {
		
		seleniumUtility = new SeleniumUtility(driver);
		addingOrder.click();
		oId.sendKeys(orderId);
		uId.sendKeys(userId);
		pId.sendKeys(addressId);
		aId.sendKeys(productId);
		odStatus.sendKeys(orderDispatcherStatus);
		
	}
	
	public void submit() {
		
		addOrder.click();
	}
	
	public void viewAnOrder(String viewOrderId) {
		
		seleniumUtility = new SeleniumUtility(driver);
		viewOrder.click();
		viewId.sendKeys("viewOrderId");
		viewIdDetails.click();		
	}
	
	public void viewAllOrders() {
		
		seleniumUtility = new SeleniumUtility(driver);
		viewAllOrders.click();
	}
	
	public void deleteAnOrder() {
		
		seleniumUtility = new SeleniumUtility(driver);
		deleteOrder.click();
		delete.click();
	}
}
