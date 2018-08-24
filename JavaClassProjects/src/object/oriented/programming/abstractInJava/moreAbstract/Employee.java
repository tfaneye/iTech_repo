package object.oriented.programming.abstractInJava.moreAbstract;

public class Employee extends Company{

    //private int daysWorked;

    public Employee(double basicPay, double bonus, int numOfDaysWorked, String employeeName) {
        super(basicPay, bonus, numOfDaysWorked, employeeName);

        //setDaysWorked(daysWorked);
    }

    /*public int getdaysWorked() {
        return daysWorked;
    }

    public void setDaysWorked(int numOfDaysWorked) {
        if(numOfDaysWorked >= 1){
            daysWorked = numOfDaysWorked;
        }
    }*/

    public double calculatePay(){
        double myBasicPay = getBasicPay();
        int daysWorked = getNumOfDaysWorked();

        double myBonus = computeBonus();

        double mySalary = (myBasicPay * daysWorked) + myBonus;

        return mySalary;
    }
}
