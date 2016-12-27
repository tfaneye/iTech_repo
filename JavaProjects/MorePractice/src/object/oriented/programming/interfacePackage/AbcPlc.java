package object.oriented.programming.interfacePackage;

/**
 * Created by Tunde on 25/12/2016.
 */
public interface AbcPlc {

    String COMPANY_NAME = "ABC Plc UK";
    int COMPANY_AGE = 5;
    String COMPANY_ADDRESS_NUMBER = "15 New Road, Head Ofice, London";
    double ANNUAL_PROFIT = 3568.00;

    void makeProfit();
    double publishFinReport(long finYear);
    String displayOfficeAddress();
    int trainStaff();
    void paySalary();
    void promoteEmp(int empId);
}
