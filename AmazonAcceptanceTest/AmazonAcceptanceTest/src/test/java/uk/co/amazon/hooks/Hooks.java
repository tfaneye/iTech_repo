package uk.co.amazon.hooks;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;

import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.internal.TestResult;
import uk.co.amazon.database.DatabaseManager;
import uk.co.amazon.pages.HomePage;
import uk.co.amazon.test_browsers.SharedBrowsers;
import uk.co.amazon.utils.Screenshot;

public class Hooks {
	
	private SharedBrowsers sharedBrowsers;
		protected HomePage homePage;


	@BeforeMethod
	public void testPreCondition() throws Exception{
	sharedBrowsers = new SharedBrowsers();
		homePage = sharedBrowsers
				.initialiseBrowsers()
				.setUpBrowsers()
				.loadDefaultBrowser();
		DatabaseManager.startMySqlDatabaseServer();
	}
	
	@AfterMethod
	public void testPostCondition(ITestResult testResult){
		if(testResult.getStatus() == ITestResult.FAILURE){
			String name = testResult.getName();
			homePage.takeShot(name);
		}else if(testResult.getStatus() == ITestResult.SUCCESS){
			System.out.println("No Screenshot taken as Test Passed");
		}

		DatabaseManager.shutMySqlDownDatabaseServer();
		//sharedBrowsers.tearDownBrowserSetUp();
	}

}
