package com.guru99.live.firstPackageTest;

import org.testng.Assert;
//import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.guru99.live.hooks.TestNgHooks;

public class DataProviderLoginTest extends TestNgHooks {

	// private WebDriver driver;
	//private HomePage homePage;

	@Test(dataProvider = "LoginTestData")
	public void magentoLoginTest1(String newUsername, String newPassword, String name) {
		boolean ans = homePage
		.goToMyAccount()
		.loginWith(newUsername, newPassword)
		.validateLogin(name);
		Assert.assertTrue(ans, "Does not contain "+name);
	}

	@DataProvider(name = "LoginTestData")
	public Object[][] getLoginData() {
		return new Object[][] { 
			{ "234dotus@gmail.com", "password123", "Hello, Donald Jonathan!" },
		};
	}

}
