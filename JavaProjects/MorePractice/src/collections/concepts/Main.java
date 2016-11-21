package collections.concepts;

/**
 * Created by Tunde on 20/11/2016.
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
        String[][] details = exampleArrayThreeTwoDim.getUserCredentials();

        //System.out.println(details[3][4]);

        for(int x = 0; x < details.length; x++){
            for (int y = 0; y < details[x].length; y++){
                System.out.println(details[x][y]);
            }
        }

        System.out.println("===============================================");

        ExampleArrayFourList shopping = new ExampleArrayFourList();
        String myShoppingItem = shopping.getItem(0);
        System.out.println(myShoppingItem);

        System.out.println("===============================================");

        shopping.showAllItems();

        System.out.println("===============================================");

        shopping.showAllItemsEnhanced();
    }
}