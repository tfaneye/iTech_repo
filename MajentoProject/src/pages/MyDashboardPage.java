package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class MyDashboardPage extends BasePage{

	public MyDashboardPage(WebDriver driver) {
		super(driver);
	}

	public MyAccountPage validateLogin(String name) {
		boolean ans = driver.getPageSource().toLowerCase().contains(name);
		return new MyAccountPage(driver);
		//Assert.assertTrue("Does not contain "+name, !ans);
		
	}

}
