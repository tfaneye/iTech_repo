package com.guru99.live.pages;

import org.openqa.selenium.WebDriver;

import com.guru99.live.pages.BasePage;

public class MyDashboardPage extends BasePage{

	public MyDashboardPage(WebDriver driver) {
		super(driver);
	}

	public boolean validateLogin(String name) {
		boolean ans = driver.getPageSource().toLowerCase().contains(name);
		//return new MyAccountPage(driver);
		//Assert.assertTrue("Does not contain "+name, !ans);
		return ans;
		
	}

}
