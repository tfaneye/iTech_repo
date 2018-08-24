package object.oriented.programming.getterSetter;

public class ConstructorAsASetter {

    private final ElectricCar car;

    public ConstructorAsASetter(ElectricCar car) {

        this.car = car;
    }

    public void displayCarName(){
        if(car.getCarName().contains("Passat")){
            System.out.println("This is my car");
        }

        int carAge = car.getCarAge();
        System.out.println(carAge);

        //set new car age
        car.setCarAge(5);

        //get new car age
        int newAge = car.getCarAge();
        System.out.println(newAge);
    }
}
