package exampleOfClasses;


import java.awt.*;

/**
 * Created by inet-tech on 03/01/17.
 */
public class CreateObjectDemo {

    public static void main(String[] args) {

        Point originOne = new Point(23, 94);
        Rectangle rectOne = new Rectangle(originOne, 100, 200);
        Rectangle rectTwo = new Rectangle(50, 100);

        System.out.println("Width of recOne: " + rectOne.width);
        System.out.println("Height of recOne: " + rectOne.height);
        System.out.println("Area of recOne: " + rectOne.getArea());

        rectTwo.origin = originOne;
    }
}
