package com.guru99.live.hooks;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.guru99.live.pages.BasePage;
import com.guru99.live.pages.HomePage;

public class TestNgHooks {
	
	protected BasePage basePage;
	protected HomePage homePage;
	
	
	//Pre-Condition
	@BeforeMethod
	public void setUp(){
		
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tunde\\TrainCentre\\JavaCodes\\Projects\\iTech_repo\\MagentoWebProject\\MagentoWebAcceptanceTest\\browser_driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		this.basePage = new BasePage(driver);
		this.homePage = new HomePage(driver);
		//this.myAccountPage = new MyAccountPage(driver);
		//this.myDashboardPage = new MyDashboardPage(driver);
		basePage.setUpTest();
	}
	
	//Post-Condition
		@AfterMethod
		public void tearDown(){
			basePage.cleanUpTest();
		}

}
