package exampleOfClasses;

/**
 * Created by inet-tech on 03/01/17.
 */
public class Loan {

    public double computePayment(double loanAmt, double rate, double futureValue, int numPeriods){

        double interest = rate/100.0;
        double partial1 = Math.pow((1 + interest), - numPeriods);
        double denominator = (1 - partial1)/interest;
        double monthlyPayment = (-loanAmt / denominator) - ((futureValue * partial1)/denominator);

        System.out.println(monthlyPayment);

        return monthlyPayment;

    }

    public static void main(String[] args){
        Loan loan = new Loan();
        loan.computePayment(1000.0, 2.0, 2000.0, 12);
    }
}
