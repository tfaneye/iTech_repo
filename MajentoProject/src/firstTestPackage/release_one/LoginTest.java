package firstTestPackage.release_one;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.BasePage;
import pages.HomePage;
import pages.MyAccountPage;
import pages.MyDashboardPage;

public class LoginTest {
	
	private BasePage basePage;
	private HomePage homePage;
	//private MyAccountPage myAccountPage;
	//private MyDashboardPage myDashboardPage;
	
	//Pre-Condition
	@Before
	public void setUp(){
		
		WebDriver driver = new FirefoxDriver();
		this.basePage = new BasePage(driver);
		this.homePage = new HomePage(driver);
		//this.myAccountPage = new MyAccountPage(driver);
		//this.myDashboardPage = new MyDashboardPage(driver);
		basePage.setUpTest();
	}
	
	@Test
	public void magentoLoginTest(){
		homePage
		.goToMyAccount()
		.loginWith("234dotus@gmail.com","password123")
		.validateLogin("Hello, Donald Jonathan!");
	}
	
	@Test @Ignore
	public void magentoLogoutTest(){
		//myAccountPage.logout();
	}
	
	//Post-Condition
	@After @Ignore
	public void tearDown(){
		basePage.cleanUpTest();
	}

}
