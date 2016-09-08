package com.valtech.browsers;

import com.valtech.pages.BasePage;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by tunde on 07/09/16.
 */
public class SharedBrowsers {

    private static WebDriver driver;
    private FileInputStream fis;
    private Properties config = new Properties();
    protected static Logger logger = LogManager.getLogger("TestLogger");


    public SharedBrowsers initialiseBrowsers() throws Exception {

        if (driver == null) {
            try {
                fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/testdata.properties");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            try {

                config.load(fis);
            } catch (IOException e1) {

                e1.printStackTrace();
            }
            if (config.getProperty("browser").equalsIgnoreCase("FireFox")) {
                driver = new FirefoxDriver();
            } else if (config.getProperty("browser").toLowerCase().contains("chrome")) {
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");
                driver = new ChromeDriver();
            }else {
                throw new Exception("There is no such browser");
            }
        }
        return new SharedBrowsers();
    }

    public BasePage setUpBrowsers() {
        try {
            driver.manage().deleteAllCookies();
            logger.info("All browser cookies are cleared");
            driver.manage().window().maximize();
            logger.info("Browser has been maximized");
        }catch(Exception e) {
            logger.error("Error occurred while setting up browser: "+e);
        }
        return new BasePage(driver);
    }

    public void tearDownBrowserSetUp(){
        try {
            if(driver != null) {
                driver.quit();
                logger.info("Browser has successfully closed");
            }
        }catch(Exception e) {
            logger.error("Browser failed to close with error message: ", e);
        }
    }
}
