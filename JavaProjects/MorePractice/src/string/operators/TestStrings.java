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
    }
}
