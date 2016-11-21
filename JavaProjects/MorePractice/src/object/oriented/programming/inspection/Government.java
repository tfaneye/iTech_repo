package object.oriented.programming.inspection;

import object.oriented.programming.getterSetter.ElectricCar;

/**
 * Created by Tunde on 17/11/2016.
 */
public class Government {

    public static void main(String[] args) {

        ElectricCar car = new ElectricCar();
        double myCarPrice = car.getCarPrice();
        System.out.println(myCarPrice);

        car.setCarPrice(600000);
        double myNewCarPrice = car.getCarPrice();
        if(myNewCarPrice == 56000){
            System.out.println("Old Car price");
        }
        else if(myNewCarPrice == 60000){
            System.out.println("New car price is "+ myNewCarPrice);
        }
        else {
            System.out.println("This price has not been defined");
        }
    }
}
