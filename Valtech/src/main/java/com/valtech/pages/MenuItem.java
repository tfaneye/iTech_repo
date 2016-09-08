package com.valtech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tunde on 07/09/16.
 */
public class MenuItem extends BasePage {

    private By caseField = By.tagName("a");
    private By serviceField = By.tagName("a");
    private By jobField = By.tagName("a");
    private By contactField = By.className("contactbody");

    public MenuItem(WebDriver driver) {
        super(driver);
    }

    public MenuItem selectCaseMenuItem(String menuItemOne){

        List<WebElement> caseTag = driver.findElements(caseField);
        for (WebElement tagCase : caseTag){
            if(tagCase.getText().toLowerCase().contains(menuItemOne)){
                tagCase.click();
                break;
            }
        }
        return new MenuItem(driver);
    }


    public boolean validateCasePage(){
        return driver.getPageSource().toLowerCase().contains("cases");
    }


    public MenuItem selectServiceMenuItem(String menuItemTwo){
        List<WebElement> serviceTag = driver.findElements(serviceField);
        for (WebElement tagService : serviceTag){
            if(tagService.getText().toLowerCase().contains(menuItemTwo)){
                tagService.click();
                break;
            }

        }
        return new MenuItem(driver);

    }

    public boolean validateServicePage(){
        return driver.getPageSource().toLowerCase().contains("services");
    }

    public MenuItem selectJobMenuItem(String menuItemThree) {

        List<WebElement> jobTag = driver.findElements(jobField);
        for (WebElement tagJob : jobTag){
            if(tagJob.getText().toLowerCase().contains(menuItemThree)){
                tagJob.click();
                break;
            }

        }
        return new MenuItem(driver);
    }

    public boolean validateJobPage(){
        return driver.getPageSource().toLowerCase().contains("jobs");
    }


    public List<String> getAllOfficeNames() {

        List<String> offices = new ArrayList<String>();

        for (WebElement element : driver.findElements(contactField)){
           if ( element.getText() != null){
               offices.add(element.getText());
           }
        }
        return offices;
    }
}
