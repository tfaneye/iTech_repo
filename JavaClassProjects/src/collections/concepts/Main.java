package collections.concepts;

import collections.concepts.hashtables.Employee;
import collections.concepts.hashtables.Library;
import collections.concepts.lists.ExampleArrayFourList;
import collections.concepts.oneDimArrays.ExampleArrayOne;
import collections.concepts.oneDimArrays.ExampleArrayTwo;
import collections.concepts.twoDimArrays.ExampleArrayThreeTwo_Dim;

/**
 * Created by Tunde on 09/01/2017.
 */
public class Main {

    public static void main(String[] args){

        ExampleArrayOne exampleArrayOne = new ExampleArrayOne();
        exampleArrayOne.checkBasicArrayConcepts();
        exampleArrayOne.showStudentAges();

        System.out.println("===============================================");

        ExampleArrayTwo exampleArrayTwo = new ExampleArrayTwo();
        exampleArrayTwo.showMyStudentAges();

        System.out.println("===============================================");

        String result = exampleArrayTwo.findStudentAge(100);
        System.out.println(result);

        int studentTotal = exampleArrayTwo.getTotalStudents();
        System.out.println(studentTotal);

        System.out.println("===============================================");

        ExampleArrayThreeTwo_Dim exampleArrayThreeTwoDim = new ExampleArrayThreeTwo_Dim();
        // String[][] details = exampleArrayThreeTwoDim.ExampleArrayThreeTwo_Dim();
        String[][] details = exampleArrayThreeTwoDim.getUserCredentials();

        //System.out.println(details[3][4]);

        for(int x = 0; x < details.length; x++){
            for (int y = 0; y < details[x].length; y++){
                System.out.println(details[x][y]);
            }
        }
        System.out.println("===============================================");
        exampleArrayThreeTwoDim.moreTwoDimArrays();


        System.out.println("===============================================");

        ExampleArrayFourList shopping = new ExampleArrayFourList();
        String myShoppingItem = shopping.getItem(0);
        System.out.println(myShoppingItem);

        System.out.println("===============================================");

        shopping.showAllItems();

        System.out.println("===============================================");

        shopping.showAllItemsEnhanced();

        System.out.println("===============================================");

        Library library = new Library();
        String carName = library.getCar("Tunde");
               System.out.println(carName);
        /*
         System.out.println("===============================================");

         Scanner scanner = new Scanner(System.in);
         System.out.println("Please enter your car key");
         String carKey = scanner.nextLine();

         System.out.println("Please enter your car name");
         String carModel = scanner.nextLine();
         library.setCar(carKey, carModel);
         library.clearCarRecord();

         String newCarName = library.getCar(carKey);
         System.out.println("Your new car is: " +newCarName);
 */

        System.out.println("===============================================");
        Employee employee = new Employee();
        Double empSalary = employee.getEmpRecord("Dan");

        System.out.println(empSalary);

        System.out.println("===============================================");
    }
}
