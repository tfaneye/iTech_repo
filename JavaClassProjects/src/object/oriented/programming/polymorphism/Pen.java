package object.oriented.programming.polymorphism;

/**
 * Created by Tunde on 09/01/2017.
 */
public class Pen {

    //Example of Overriding

    protected long penNumber;

    public Pen(long penNumber) {
        this.penNumber = penNumber;
    }

    public void writeLetter(){
        System.out.println("I can write with pen from Parent with serial number: " +penNumber);
    }

    public void writeLetter(String testName){
        System.out.println(testName);

    }


}
