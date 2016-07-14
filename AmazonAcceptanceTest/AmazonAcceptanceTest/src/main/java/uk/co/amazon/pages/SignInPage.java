package uk.co.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BasePage {
	/*
	private By usernameField = By.id("ap_email");
	private By passwordField = By.id("ap_password");
	private By signInButtonField = By.id("signInSubmit");
	*/
	@FindBy(id = "ap_email")
	private WebElement usernameField;
	@FindBy(id = "ap_password")
	private WebElement passwordField;
	@FindBy(id = "signInSubmit")
	private WebElement signInButtonField;

	public SignInPage(WebDriver driver) {
		super(driver);
	}

	public YourAccountPage populateSignInDetails(String username, String password){
		/*
		driver.findElement(usernameField).sendKeys(username);
		driver.findElement(passwordField).sendKeys(password);
		driver.findElement(signInButtonField).click();
		return new YourAccountPage(driver);
		*/
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		signInButtonField.click();
		return PageFactory.initElements(driver, YourAccountPage.class);

	}



}
