package controlStatements;

/**
 * Created by inet-tech on 01/01/17.
 */
public class IfElseDemo {

    public static void main(String[] args){
        int testScore = 97;

        char grade;

        if(testScore >=90){
            grade = 'A';
        }else if(testScore >= 80){
            grade = 'B';
        }else if(testScore >= 70){
            grade = 'C';
        }else if(testScore >= 60){
            grade = 'D';
        }else if(testScore >= 50){
            grade = 'E';
        }else{
            grade = 'F';
        }
        System.out.println("Grade = " +grade);

        System.out.println("================================================");

        int month = 10;
        int year = 2017;
        int numDays = 0;

        switch (month) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                numDays = 31;
                break;
            case 4: case 6:
            case 9: case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
        System.out.println("Number of Days = "
                + numDays);
    }
}
