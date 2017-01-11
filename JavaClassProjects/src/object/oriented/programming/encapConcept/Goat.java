package object.oriented.programming.encapConcept;

import object.oriented.programming.inheritance.Animal;

/**
 * Created by Tunde on 10/01/2017.
 */
public class Goat extends Animal {

    private boolean hasSkin = true;
    private String doveName = "Mountin Goat";
    private int numOfLegs = 4;

    public boolean isHasSkin() {
        return hasSkin;
    }

    public void setHasSkin(boolean hasSkin) {
        this.hasSkin = hasSkin;
    }

    public String getDoveName() {
        return doveName;
    }

    public void setDoveName(String doveName) {
        this.doveName = doveName;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }
}
