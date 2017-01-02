package controlStatements;

/**
 * Created by inet-tech on 01/01/17.
 */
public class IfElseDemo {

    public static void main(String[] args){
        int testscore = 76;
        char grade;

        if(testscore >=90){
            grade = 'A';
        }else if(testscore >= 80){
            grade = 'B';
        }else if(testscore >= 70){
            grade = 'C';
        }else if(testscore >= 60){
            grade = 'D';
        }else if(testscore >= 50){
            grade = 'E';
        }else{
            grade = 'F';
        }
        System.out.println("Grade = " +grade);
    }
}
