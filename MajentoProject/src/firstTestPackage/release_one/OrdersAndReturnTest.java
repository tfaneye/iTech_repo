package firstTestPackage.release_one;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.BasePage;
import pages.HomePage;
import pages.OrderInformationPage;
import pages.OrdersAndReturnsPage;

public class OrdersAndReturnTest {
	
	private BasePage basePage;
	private HomePage homePage;
	private OrdersAndReturnsPage ordersAndReturnsPage;

	//Pre-condition
	@Before
	public void setUp(){
		
		WebDriver driver = new FirefoxDriver();
		this.basePage = new BasePage(driver);
		this.homePage = new HomePage(driver);
		this.ordersAndReturnsPage = new OrdersAndReturnsPage(driver);
		homePage = basePage.setUpTest();
	}
	
	@Test
	public void searchForOrderAndReturnItem1(){
		String orderID = "100000976";
		String customerLastName = "Jonathan";
		String emailOrZip = "Email Address";
		String valueEmailOrZip = "234dotus@gmail.com";
		
		OrderInformationPage orderInformationPage = homePage
				.goToOrderAndReturn()
				.populateOrderInformation(orderID, customerLastName, emailOrZip, valueEmailOrZip)
				.searchForOrdersAndReturns();
		Assert.assertTrue("Does not contain Pending", orderInformationPage.validateStatus());
		
	}
	
	@Test
	public void searchForOrderAndReturnItem2(){
		String orderID = "100000976";
		String customerLastName = "Jonathan";
		String emailOrZip = "ZIP Code";
		String valueEmailOrZip = "e13 0qe";
		
		OrderInformationPage orderInformationPage = homePage
				.goToOrderAndReturn()
				.populateOrderInformation(orderID, customerLastName, emailOrZip, valueEmailOrZip)
				.searchForOrdersAndReturns();
		Assert.assertTrue("Does not contain Pending", orderInformationPage.validateStatus());
	}
	
	@Test
	public void searchForOrderAndReturnItem3(){
		String orderID = "100001402";
		String customerLastName = "Jonathan";
		String emailOrZip = "ZIP Code";
		String valueEmailOrZip = "e13 0qe";
		
		OrderInformationPage orderInformationPage = homePage
				.goToOrderAndReturn()
				.populateOrderInformation(orderID, customerLastName, emailOrZip, valueEmailOrZip)
				.searchForOrdersAndReturns();
		Assert.assertTrue("Does not contain Pending", orderInformationPage.validateStatus());
		
	}
	
	@Test
	public void searchForOrderAndReturnItem4(){
		String orderID = "100000976";
		String customerLastName = "Jonathan";
		String emailOrZip = "ZIP Code";
		String valueEmailOrZip = "KT17 4NR";
		
		OrderInformationPage orderInformationPage = homePage
				.goToOrderAndReturn()
				.populateOrderInformation(orderID, customerLastName, emailOrZip, valueEmailOrZip)
				.searchForOrdersAndReturns();
		Assert.assertTrue("Does not contain Entered data is incorrect. Please try again", ordersAndReturnsPage.validateStatusFour());
		
	}
	
	//Post-Condition
		@After @Ignore
		public void tearDown(){
			basePage.cleanUpTest();
		}

}
