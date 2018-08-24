import handligExceptions.ExceptionDemo;

public class Runner {

    public static void main(String[] args) {
        ExceptionDemo demo = new ExceptionDemo();
        demo.deposit(500);
        demo.withdraw(200);
        demo.withdraw(500);


    }
}
