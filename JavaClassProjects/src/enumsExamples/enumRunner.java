package enumsExamples;

import error.handling.FastFood;

/**
 * Created by Tunde on 09/01/2017.
 */
public class enumRunner {

    public static void main(String[] args){
        Geometry circleArea = new Geometry();

        circleArea.computeCircleArea();
        circleArea.computeCircleCircumfrence();

        System.out.println("==========================================");

        Weather weather = new Weather();
        weather.getCountryWeather();
        weather.getCityWeather(Weather.WeatherDegree.Outlook);
        weather.findMyWeather(Weather.WeatherDegree.Outlook);
        weather.arrayMethod();

        System.out.println("==========================================");

        FastFood fastFood = new FastFood();
        fastFood.addTwoNumbers(10, 0);
    }
}
