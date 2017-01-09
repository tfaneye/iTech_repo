package object.oriented.programming.interfacePackage;

import java.util.Scanner;

/**
 * Created by Tunde on 09/01/2017.
 */
public class AbcBankPlc implements AbcPlc {

    private final long accountNumber;
    private String localAddress = "22 Newcastle Street, Local Branch";

    public AbcBankPlc(long accountNumber){
        this.accountNumber = accountNumber;
    }

    public double computeDeposit(){
        if(accountNumber != 0){
            double bal = findCustomerBalance(accountNumber);
            if(bal < 1000){

            }
        }
        return 0.0;
    }

    private double findCustomerBalance(long accountNumber) {
        return 5000;
    }

    @Override
    public void makeProfit() {
        System.out.println("We make profit by taking 0.05 of all our transactions");
    }

    @Override
    public double publishFinReport(long finYear) {
        if(finYear == 2016){
            return 80000 * 0.05;
        }
        return 0;
    }

    @Override
    public String displayOfficeAddress() {
        System.out.println("Which address do you want to request");
        Scanner scanner = new Scanner(System.in);
        String address = scanner.nextLine();
        if(address.equalsIgnoreCase("local")){
            System.out.println(localAddress);
            return localAddress;
        }
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
