package com.valtech.hooks;

import com.valtech.browsers.SharedBrowsers;
import com.valtech.pages.MenuItem;
import com.valtech.pages.HomePage;
import org.junit.After;
import org.junit.Before;

/**
 * Created by tunde on 07/09/16.
 */
public class Hooks {

    private SharedBrowsers sharedBrowsers;
    protected HomePage homePage;
    private MenuItem menuItem;

    @Before
    public void testPreCondition() throws Exception{
        sharedBrowsers = new SharedBrowsers();
        homePage = sharedBrowsers
                .initialiseBrowsers()
                .setUpBrowsers()
                .loadDefaultBrowser();
    }
}
