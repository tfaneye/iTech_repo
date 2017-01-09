package object.oriented.programming.inspection.getterRunner;

import object.oriented.programming.getterSetter.ElectricCar;

/**
 * Created by Tunde on 17/11/2016.
 */
public class Government {

    public static void main(String[] args) {

        ElectricCar car = new ElectricCar();
        car.getCarPrice();
       // System.out.println(myCarPrice);

        car.setCarPrice(60000);
        car.getCarPrice();

    }
}
