package enumsExamples;

import error.handling.FastFood;

/**
 * Created by Tunde on 05/12/2016.
 */
public class enumRunner {

    public static void main(String[] args){
        Geometry circleArea = new Geometry();

        circleArea.computeCircleArea();

        Weather weather = new Weather();
        weather.getCountryWeather();
        weather.getCityWeather(Weather.WeatherDegree.Outlook);
        weather.findMyWeather(Weather.WeatherDegree.Outlook);
        weather.arrayMethod();

        FastFood fastFood = new FastFood();
        fastFood.addTwoNumbers(10, 0);
    }

}
