package assessment;

import java.util.Scanner;

/**
 * Created by Tunde on 14/01/2018.
 */
public class Worldpay {

    public static void main(String[] args){
        System.out.println("Welcome to HackerRank's Java tutorials!");

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        System.out.println(s);
//==========================================================================
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.next();
        int myInt = scanner.nextInt();
        scanner.close();

        System.out.println("myString is: " + myString);
        System.out.println("myInt is: " + myInt);
    }
}
