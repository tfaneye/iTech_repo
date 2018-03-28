package enumsExamples;

/**
 * Created by Tunde on 09/01/2017.
 */
public class Geometry {

    private static final float PI = 3.143f;  //Use Capital to signify Constant
    //private static float name = 746864f;
    private double radius = 5.6;

    public double computeCircleArea(){
        double area = PI * radius * radius;
        System.out.println(area);
        return area;
    }

    public double computeCircleCircumfrence(){
        double circumference = 2 * PI * radius;
        System.out.println(circumference);
        return circumference;
    }
}
