package uk.co.amazon.pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by Tunde on 29/06/2016.
 */
public class YourAccountPage extends BasePage {

   // String accountName = "Toks";

    public YourAccountPage(WebDriver driver) {
        super(driver);
    }

    public boolean validateUserAccountName(String message){
        boolean result = driver.getPageSource().toLowerCase().contains(message);

        return result;
    }
}
