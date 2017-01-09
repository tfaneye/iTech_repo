package object.oriented.programming.getterSetter;

/**
 * Created by Tunde on 17/11/2016.
 */
public class ElectricCar {

    private String carName = "Passat";
    private double carPrice = 56000.00;
    private int carAge = 3;
    private boolean hasRegistrationPaper = true;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public double getCarPrice() {
        if(carPrice == 56000){
            System.out.println("Old Car price is " + carPrice);
        }
        else if(carPrice == 60000){
            System.out.println("New car price is "+ carPrice);
        }
        else {
            System.out.println("This price has not been defined");
        }
        return carPrice;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }

    public int getCarAge() {
        return carAge;
    }

    public void setCarAge(int carAge) {
        this.carAge = carAge;
    }

    public boolean isHasRegistrationPaper() {
        return hasRegistrationPaper;
    }

    public void setHasRegistrationPaper(boolean hasRegistrationPaper) {
        this.hasRegistrationPaper = hasRegistrationPaper;
    }
}
