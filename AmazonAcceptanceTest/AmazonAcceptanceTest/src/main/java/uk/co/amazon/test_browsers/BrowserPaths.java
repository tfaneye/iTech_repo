package uk.co.amazon.test_browsers;

/**
 * Created by Tunde on 11/07/2016.
 */
public class BrowserPaths {


    public static String getBrowserPath(String browserName){

        String browserPath = null;
        String systemPath = System.getProperty("user.dir");
        String chromePath = "\\browsers_driver\\chromedriver.exe";
        String iePath = "\\browsers_driver\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe";
        
        if(browserName.toLowerCase().contains("chrome")){
            browserPath = systemPath + chromePath;
        }else if(browserName.toLowerCase().contains("ie")){
            browserPath = systemPath + iePath;
        }

        return browserPath;

    }
}
