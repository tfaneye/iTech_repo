package exampleOfClasses;

/**
 * Created by inet-tech on 03/01/17.
 */
public class MountainBike extends Bicycle {

    public int seatHeight;
    public MountainBike(int startHeight, int startCadence, int startGear, int startSpeed) {
        super(startCadence, startGear, startSpeed);

        seatHeight = startHeight;
    }

    public void setHeight(int newValue){
        seatHeight = newValue;
    }

}
