package object.oriented.programming.getterSetter;

/**
 * Created by Tunde on 09/01/2017.
 */
public class GetterRunner {

    public static void main(String[] args) {

        ElectricCar car = new ElectricCar();
        double myCarPrice = car.getCarPrice();
        System.out.println(myCarPrice);

        car.setCarPrice(60000);
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

        ConstructorAsASetter conSetter = new ConstructorAsASetter(car);
        conSetter.displayCarName();
    }
}
