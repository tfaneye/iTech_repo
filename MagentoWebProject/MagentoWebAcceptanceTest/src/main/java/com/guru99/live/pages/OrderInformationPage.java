package com.guru99.live.pages;

import org.openqa.selenium.WebDriver;

import com.guru99.live.pages.BasePage;

public class OrderInformationPage extends BasePage {

	public OrderInformationPage(WebDriver driver) {
		super(driver);
	}

	public boolean validateStatus() {
		boolean ans = driver.getPageSource().contains("Pending");
		//return ans;
		return new OrderInformationPage(driver) != null;
		
	}

}
