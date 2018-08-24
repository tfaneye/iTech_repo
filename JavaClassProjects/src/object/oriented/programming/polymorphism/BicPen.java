package object.oriented.programming.polymorphism;

/**
 * Created by Tunde on 09/01/2017.
 */
public class BicPen extends Pen {

    private long penNumber = 689L;  //no need for child's field,

    public BicPen(long penNumber) {
        super(penNumber);
    }

    //Examples of Overriding & Overloading
    public void writeLetter(){
            super.writeLetter();
            System.out.println("I can write with pen from Child with serial number: " +penNumber);
    }

    public void writeLetter(String testName){
            super.writeLetter(testName);
            System.out.println(testName);

    }
}
