package exampleOfClasses;

/**
 * Created by inet-tech on 03/01/17.
 */
public class Bicycle {

    public int cadence;
    public int gear;
    public int speed;

    public Bicycle(int startCadence, int startGear, int startSpeed) {
        this.cadence = startCadence;
        this.gear = startGear;
        this.speed = startSpeed;
    }

    public void setCadence(int newValue){
        cadence = newValue;
    }

    public void setGear(int newValue){
        gear = newValue;
    }

    public void applyBreak(int decrement){
        speed -= decrement;
    }

    public void speedUp(int increment){
        speed += increment;
    }
}
