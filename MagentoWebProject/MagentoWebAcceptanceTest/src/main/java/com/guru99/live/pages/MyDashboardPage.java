package com.guru99.live.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.guru99.live.pages.BasePage;

public class MyDashboardPage extends BasePage{

	public MyDashboardPage(WebDriver driver) {
		super(driver);
	}

	public String validateLogin() {
		//boolean ans = driver.getPageSource().toLowerCase().contains(name);
		String ans = driver.findElement(By.cssSelector("body>div>div>div.main-container.col2-left-layout>div>div.col-main>div>div>div.welcome-msg>p.hello>strong")).getText();
		//return new MyAccountPage(driver);
		//Assert.assertTrue("Does not contain "+name, !ans);
		return ans;
		
	}

}
