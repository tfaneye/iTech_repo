package collections.concepts.oneDimArrays;

/**
 * Created by Tunde on 20/11/2016.
 */
public class ExampleArrayOne {

    /*private int studentOneAge = 23;
    private int studentTwoAge = 25;
    private int studentThreeAge = 30;
    private int studentFourAge = 20;
    private int studentFiveAge = 35;
    */

    public void checkBasicArrayConcepts() {

        //1st Concept of Array
        int studentAge[] = new int[5];         //example of int Array
        String studentName[] = new String[5];

        //2nd Concept of Array
        int[] studentAges = new int[5];       //preferred way of writing Array
        studentAges[0] = 23;
        studentAges[1] = 25;
        studentAges[2] = 30;
        studentAges[3] = 20;
        studentAges[4] = 35;

        String[] studentNames = new String[5]; //example of String Array, preferred way
        studentNames[2] = "Ruth Klose";

        //3rd Concept of Array
        double[] schoolFess = new double[]{2500.00, 3000.00};

        //4th Concept of Array
        double[] schFees = {4500.00, 3500.00, 6000.00}; //preferred way of writing Array
        System.out.println(schFees[1]);
    }

    public String showStudentAges(int age){
        int[] studentAges = new int[5];
        studentAges[0] = 23;
        studentAges[1] = 25;
        studentAges[2] = 30;
        studentAges[3] = 20;
        studentAges[4] = 35;

        for(int i = 0; i < studentAges.length; i++){
            if(i == 2){
                break;
            }
            System.out.println(studentAges[i]);
        }

        //Using foreach loop
        for (int studentAge:
             studentAges) {
            if(studentAge == age){
                return "Yes";
            }

           // System.out.println(studentAge);
        }
        return "No";
    }

}
