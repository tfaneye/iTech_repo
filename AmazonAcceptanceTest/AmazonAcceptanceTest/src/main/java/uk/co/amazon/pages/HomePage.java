package uk.co.amazon.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.amazon.utils.Screenshot;

public class HomePage extends BasePage {

	//private By signInField = By.tagName("span");

	@FindBy(tagName = "span")
	private List<WebElement> signInTag;

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public SignInPage goToSignInPage(){
		//List<WebElement> signInTag = driver.findElements(signInField);
		for(WebElement tagSignIn : signInTag){
			if(tagSignIn.getText().equalsIgnoreCase("Hello. Sign in")){
				tagSignIn.click();
				break;
			}
			
		}
        return PageFactory.initElements(driver, SignInPage.class);
		//return new SignInPage(driver);
	}

	public void takeShot(String name){
		Screenshot screenshot = new Screenshot(driver);
		screenshot.snap(name);
	}
	

}
