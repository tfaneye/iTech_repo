package uk.co.amazon.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class BasePage{
	
	protected WebDriver driver;
	private Properties config = new Properties();
	private FileInputStream fis;
	protected static Logger logger = LogManager.getLogger("TestLogger");

	public BasePage(WebDriver driver){
		this.driver = driver;
		
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\environment_testdata.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			config.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public HomePage loadDefaultBrowser(){
		driver.navigate().to(config.getProperty("baseUrl"));
		logger.info("Browser loaded successfully");
				
		return new HomePage(driver);
	}

}
