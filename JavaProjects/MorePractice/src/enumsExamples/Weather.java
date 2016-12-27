package enumsExamples;

/**
 * Created by Tunde on 05/12/2016.
 */
public class Weather {

     enum WeatherDegree{
        Hot,
        Cold,
        Outlook,
        Overcast,
        Snowy,
        Rainy
    }

    public void getCountryWeather(){
        WeatherDegree degree = WeatherDegree.Hot;

        if(degree == WeatherDegree.Cold){
            System.out.println("We are in UK");
        }else if(degree == WeatherDegree.Hot){
            System.out.println("We are in Cameroon");
        }else if(degree == WeatherDegree.Outlook){
            System.out.println("We are in Ghana");
        }else if(degree == WeatherDegree.Rainy){
            System.out.println("We are in South Africa");
        }else{
            System.out.println("We are in nowhere!!");
        }
    }

    public void getCityWeather(WeatherDegree degree) {
        if (degree == WeatherDegree.Cold) {
            System.out.println("We must be in UK");
        } else if (degree == WeatherDegree.Hot) {
            System.out.println("We must be in Cameroon");
        } else if (degree == WeatherDegree.Outlook) {
            System.out.println("We must be in Ghana");
        } else if (degree == WeatherDegree.Rainy) {
            System.out.println("We must be in South Africa");
        } else {
            System.out.println("We must be in nowhere!!");
        }
    }

    public void findMyWeather(WeatherDegree weatherDegree){
        switch (weatherDegree){
            case Hot:
                System.out.println("This is Morocco");
                break;
            case Rainy:
                System.out.println("This is Senega");
                break;
            case Cold:
                System.out.println("This is England");
                break;
            case Snowy:
                System.out.println("This is Canada");
                break;
            case Overcast:
                System.out.println("This is Spain");
                break;
            default:
                System.out.println("This is not possible");
                break;
        }
    }

    //using array with Enums
    public enum Browsers{Chrome, Firefox, InternetExplorer, Safari, PhantomJS, Opera}

    public void arrayMethod(){
        Browsers[] browsers = new Browsers[6];
        browsers[0] = Browsers.Chrome;
        browsers[1] = Browsers.Firefox;
        browsers[2] = Browsers.InternetExplorer;
        browsers[3] = Browsers.Safari;
        browsers[4] = Browsers.PhantomJS;
        browsers[5] = Browsers.Opera;

        for (Browsers browser :
                browsers) {
            System.out.println(browser);
        }
    }
}
