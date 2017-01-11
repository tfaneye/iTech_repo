package enumsExamples;

/**
 * Created by Tunde on 09/01/2017.
 */
public class Weather {

    enum WeatherDegree{
        HOT,
        COLD,
        OUTLOOK,
        OVERCAST,
        SNOWY,
        RAINY
    }

    public void getCountryWeather(){
        WeatherDegree degree = WeatherDegree.HOT;

        if(degree == WeatherDegree.COLD){
            System.out.println("We are in UK");
        }else if(degree == WeatherDegree.HOT){
            System.out.println("We are in Cameroon");
        }else if(degree == WeatherDegree.OUTLOOK){
            System.out.println("We are in Ghana");
        }else if(degree == WeatherDegree.RAINY){
            System.out.println("We are in South Africa");
        }else{
            System.out.println("We are in nowhere!!");
        }
    }

    public void getCityWeather(WeatherDegree degree) {
        if (degree == WeatherDegree.COLD) {
            System.out.println("We must be in UK");
        } else if (degree == WeatherDegree.HOT) {
            System.out.println("We must be in Cameroon");
        } else if (degree == WeatherDegree.OUTLOOK) {
            System.out.println("We must be in Ghana");
        } else if (degree == WeatherDegree.RAINY) {
            System.out.println("We must be in South Africa");
        } else {
            System.out.println("We must be in nowhere!!");
        }
    }

    public void findMyWeather(WeatherDegree weatherDegree){
        switch (weatherDegree){
            case HOT:
                System.out.println("This is Morocco");
                break;
            case RAINY:
                System.out.println("This is Senega");
                break;
            case COLD:
                System.out.println("This is England");
                break;
            case SNOWY:
                System.out.println("This is Canada");
                break;
            case OVERCAST:
                System.out.println("This is Spain");
                break;
            default:
                System.out.println("This is not possible");
                break;
        }
    }

    //using array with Enums
    public enum Browsers{
        CHROME, FIREFOX, INTERNET_EXPLORER, SAFARI, PHANTOM_JS, OPERA
    }

    public void selectBrowser(){
        Browsers[] browsers = new Browsers[6];
        browsers[0] = Browsers.CHROME;
        browsers[1] = Browsers.FIREFOX;
        browsers[2] = Browsers.INTERNET_EXPLORER;
        browsers[3] = Browsers.SAFARI;
        browsers[4] = Browsers.PHANTOM_JS;
        browsers[5] = Browsers.OPERA;

        for (Browsers browser :
                browsers) {
            System.out.println(browser);
        }
    }
}
