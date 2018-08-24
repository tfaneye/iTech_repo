package handligExceptions;

public class ExceptionDemo{

    private double balance;
    //private int number;


    public ExceptionDemo()
    {
        //this.number = number;
    }
    public void deposit(double initialDeposit)
    {
        balance += initialDeposit;
    }

    public void withdraw(double withdrawAmount) throws TundeException {
        if(withdrawAmount <= balance)
        {
            balance -= withdrawAmount;
        }
        else
        {
            double newBal = withdrawAmount - balance;
            throw new TundeException(newBal);
        }
    }


    /*public double getBalance()
    {
        return balance;
    }


    public int getNumber()
    {
        return number;
    }*/




    public static void main(String args[]) throws TundeException {

//Example 1 ========================================
        try{
            int a[] = new int[2];
            System.out.println("Access element three :" + a[3]);

        }catch(ArrayIndexOutOfBoundsException e){

            System.out.println("Exception thrown :" + e);
        }
        System.out.println("Out of the block");


//Example 2 Custom Exception ===================================================

        ExceptionDemo demo = new ExceptionDemo();
        System.out.println("\nDepositing £200...");
        demo.deposit(200.00);
        try
        {
            System.out.println("\nWithdrawing £20...");
            demo.withdraw(50.00);
            System.out.println("\nWithdrawing £400...");
            demo.withdraw(400.00);
        }catch(TundeException e)
        {
            System.out.println("\nSorry, but you are short of £" + e.getAmount());
            System.out.println("\n" + e.getMessage()+ "\n");
            e.printStackTrace();
        }
    }
}
