package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OrdersAndReturnsPage extends BasePage {
	private By orderIDField = By.id("oar_order_id");
	private By customerLastNameField = By.id("oar_billing_lastname");
	private By quickSearchIDField = By.id("quick_search_type_id");
	private By emailField = By.id("oar_email");
	private By zipCodeField = By.id("oar_zip");

	public OrdersAndReturnsPage(WebDriver driver) {
		super(driver);
	}

	public OrdersAndReturnsPage populateOrderInformation(String orderID, String customerLastName, String emailOrZip, String valueOfEmailOrZip) {
		driver.findElement(orderIDField).sendKeys(orderID);
		driver.findElement(customerLastNameField).sendKeys(customerLastName);
		WebElement findOrderBy = driver.findElement(quickSearchIDField);
		Select selectEmailOrZip = new Select(findOrderBy);
		if(emailOrZip.contains("Email")){
			selectEmailOrZip.selectByVisibleText(emailOrZip);
			driver.findElement(emailField).sendKeys(valueOfEmailOrZip);
		}
		else{
			selectEmailOrZip.selectByVisibleText(emailOrZip);
			driver.findElement(zipCodeField).sendKeys(valueOfEmailOrZip);
		}
		return new OrdersAndReturnsPage(driver);
		
	}

	public OrderInformationPage searchForOrdersAndReturns() {
		driver.findElement(By.xpath(".//*[@id='oar_widget_orders_and_returns_form']/div[2]/button")).click();
		return new OrderInformationPage(driver);
	}

	public boolean validateStatusFour() {
		boolean res = driver.getPageSource().contains("Entered data");
		return res;
	
	}

}
