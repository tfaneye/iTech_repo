package string.operators;

public class MoreStringExamples {

    public static void main(String[] args) {
         String greeting = "Hello World!";
         String money = "£40";

        //length
         int greet = greeting.length();

        System.out.println(greet);

        //Uppercase
        String upper = greeting.toUpperCase();
        System.out.println(upper);

        //contentEquals
        boolean gt = greeting.contentEquals("Hello World!");
        System.out.println(gt);

        //replaceFirst
        String newMoney = money.replaceFirst("£", "");
        System.out.println(newMoney);



    }
}
