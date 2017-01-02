package enumsExamples;

/**
 * Created by Tunde on 05/12/2016.
 */
public class Geometry {

    private static final float PI = 3.143f;  //Use Capital to signify Constant
    private static float name = 746864f;
    private double radius = 5.6;

    public double computeCircleArea(){
        double area = PI * radius * radius;
        return area;
    }
}
