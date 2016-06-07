package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePage{
	private By emailAddressField = By.id("email");
	private By passwordField = By.id("pass");
	private By submitLoginField = By.id("send2");


	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	public MyDashboardPage loginWith(String username, String password) {
		driver.findElement(emailAddressField).sendKeys(username);
		driver.findElement(passwordField).sendKeys(password);
		driver.findElement(submitLoginField).click();
		
		//driver.findElement(By.linkText("ACCOUNT")).click();
		//driver.findElement(By.linkText("Log Out")).click();
		
		return new MyDashboardPage(driver);
		
	}
	
	public MyDashboardPage loginWithoutUsername(String password){
		driver.findElement(passwordField).sendKeys(password);
		driver.findElement(submitLoginField).click();
		return new MyDashboardPage(driver);
	}
	
	public MyDashboardPage loginWithoutClicking(String username, String password) {
		driver.findElement(emailAddressField).sendKeys(username);
		driver.findElement(passwordField).sendKeys(password);
		return new MyDashboardPage(driver);
	}
/*
	public void logout() {
		driver.findElement(By.linkText("Account")).click();
		driver.findElement(By.linkText("Log Out")).click();

	}
*/
}
