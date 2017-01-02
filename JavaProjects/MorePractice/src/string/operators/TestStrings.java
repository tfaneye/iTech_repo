package string.operators;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Tunde on 25/11/2016.
 */
public class TestStrings {

    public static void main(String[] args){

        String name = "Johnston";

        char letter = name.charAt(2);
        int letter1 = name.compareTo("John");


        System.out.println(name.concat(" Humphries"));

        System.out.println("================================================");

        Date date = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("E dd/MM/yyyy 'at' hh:mm:ss a zzz");
        String dateTime = dateFormat.format(date);
        System.out.println(dateTime);

        System.out.println("================================================");

        int result = 1 + 2;
        // result is now 3
        System.out.print("This is additive example ---> ");
        System.out.println("1 + 2 = " + result);
        int original_result = result;

        result = result - 1;
        // result is now 2
        System.out.println(original_result + " - 1 = " + result);
        original_result = result;

        result = result * 2;
        // result is now 4
        System.out.println(original_result + " * 2 = " + result);
        original_result = result;

        result = result / 2;
        // result is now 2
        System.out.println(original_result + " / 2 = " + result);
        original_result = result;

        result = result + 8;
        // result is now 10
        System.out.println(original_result + " + 8 = " + result);
        original_result = result;

        result = result % 7;
        // result is now 3
        System.out.println(original_result + " % 7 = " + result);

        System.out.println("================================================");


        //More practice on For Loop
        int i;
        //++i;*/
        for(i=0;i<=10;++i)
        System.out.println(i);
        /*i++;

        System.out.println(i);

        System.out.println(++i);*/

        


    }
}
