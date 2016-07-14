package com.guru99.live.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
	
	private By myAccountField = By.xpath("//*[@id='top']/body/div[1]/div/div[3]/div/div[4]/ul/li[1]/a");
	private By ordersAndReturnsField = By.linkText("ORDERS AND RETURNS");
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public MyAccountPage goToMyAccount(){
		driver.findElement(myAccountField).click();
		return new MyAccountPage(driver);
	}

	public OrdersAndReturnsPage goToOrderAndReturn() {
		driver.findElement(ordersAndReturnsField).click();
		return new OrdersAndReturnsPage(driver);
		
	}

}
