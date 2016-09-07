package com.valtech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by tunde on 07/09/16.
 */
public class HomePage extends BasePage {

    //private By menuList = By.tagName("i");
    private By menuList = By.className("hamburger");
    private By contactField = By.className("hamburger-contact");

    public HomePage(WebDriver driver) {
        super(driver);
    }



    public boolean validateLatestNews(){
        return driver.getPageSource().toLowerCase().contains("latest news");

    }

    public MenuItem goToMenu(){

        driver.findElement(menuList).click();

        return new MenuItem(driver);
    }

    public MenuItem clickContact(){
        driver.findElement(contactField).click();

        return new MenuItem(driver);
    }
}
