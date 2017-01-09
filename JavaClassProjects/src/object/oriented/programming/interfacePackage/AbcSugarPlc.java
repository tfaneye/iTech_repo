package object.oriented.programming.interfacePackage;

/**
 * Created by Tunde on 09/01/2017.
 */
public class AbcSugarPlc implements AbcPlc {

    private double salesAmount = 29000.00;

    public AbcSugarPlc(double salesAmount) {
        this.salesAmount = salesAmount;
    }

    @Override
    public void makeProfit() {
        double runningCost = 0.57 * salesAmount;
        double profit = salesAmount - runningCost;

        System.out.println("Our annual profit is " +profit);

    }

    @Override
    public double publishFinReport(long finYear) {

        double result = 0.0;
        if(finYear < 2016){
            System.out.println("We make " +80000);
            result = 80000;
        }else if(finYear == 2016){
            if(salesAmount < 1000){
                System.out.println("We make " +50000);
                result = 50000;
            }else {
                System.out.println("We make " +53000);
                result = 53000;
            }
        }else if(finYear > 2016){
            System.out.println("This is only a projected figure " +90000);
            result = 90000;
        }
        return result;
    }

    @Override
    public String displayOfficeAddress() {
        System.out.println(COMPANY_ADDRESS_NUMBER);
        return COMPANY_ADDRESS_NUMBER;
    }

    @Override
    public int trainStaff() {
        return 0;
    }

    @Override
    public void paySalary() {

    }

    @Override
    public void promoteEmp(int empId) {

    }
}
