package controlStatements;

/**
 * Created by inet-tech on 02/01/17.
 */
public class WhileDemo {

    public static void main(String[] args){
        int count = 1;
        /*while (count <= 10){
            System.out.println("Count is " + count);
            count++;
        }*/

        do{
            System.out.println("Count is " + count);
            ++count;
        }while(count < 11);

        for(count = 1; count<11; count++){
            System.out.print(count +", ");
        }
    }
}
