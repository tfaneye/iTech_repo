package com.valtech.ui_test;

import com.valtech.hooks.Hooks;
import com.valtech.pages.MenuItem;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tunde on 07/09/16.
 */
public class ValtechTest extends Hooks {

    //Test Data
    private String menuItemOne = "cases";
    private String menuItemTwo = "cervices";
    private String menuItemThree = "jobs";


    private MenuItem menuItem;

    @Test
    public void latestNews(){

        Assert.assertTrue("This page does not contain Latest News", homePage.validateLatestNews());
    }

    @Test
    public void cases(){

        // Actual Test
        menuItem = homePage.goToMenu().selectCaseMenuItem(menuItemOne);

        Assert.assertTrue("This page does not contain cases", menuItem.validateCasePage());

    }

    @Test
    public void services(){

       // String menuItemTwo = "Services";

        //Actual Test
        menuItem = homePage.goToMenu().selectServiceMenuItem(menuItemTwo);

        Assert.assertTrue("This page does not contain services", menuItem.validateServicePage());

    }


    @Test
    public void jobs() {

        //Actual Test
        menuItem = homePage.goToMenu().selectJobMenuItem(menuItemThree);

        Assert.assertTrue("This page does not contain jobs", menuItem.validateJobPage());
    }


    // Getting all the offices in the Valtech Contact Page
    @Test
    public void contacts(){
        for (String office : homePage.clickContact().getAllOfficeNames()){
            System.out.println(office);
        }
    }

}
