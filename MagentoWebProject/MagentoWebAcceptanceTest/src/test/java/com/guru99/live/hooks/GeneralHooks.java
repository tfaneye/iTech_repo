package com.guru99.live.hooks;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.guru99.live.pages.BasePage;
import com.guru99.live.pages.HomePage;


public class GeneralHooks {
	
	
	private BasePage basePage;
	protected HomePage homePage;

	//Pre-Condition
	@Before
	public void setUp(){
		
		//WebDriver driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tunde\\TrainCentre\\JavaCodes\\Projects\\iTech_repo\\MagentoWebProject\\MagentoWebAcceptanceTest\\browser_driver\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "/home/inet-tech/ProjectRepos/lion_repo/MagentoWebProject/MagentoWebAcceptanceTest/browser_driver/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		this.basePage = new BasePage(driver);
		//this.myAccountPage = new MyAccountPage(driver);
		//this.myDashboardPage = new MyDashboardPage(driver);
		homePage = basePage.setUpTest();
	}
	
	//Post-Condition
		@After @Ignore
		public void tearDown(){
			basePage.cleanUpTest();
		}

}
