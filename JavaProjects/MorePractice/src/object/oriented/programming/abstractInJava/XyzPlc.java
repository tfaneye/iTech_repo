package object.oriented.programming.abstractInJava;

/**
 * Created by Tunde on 27/12/2016.
 */
public abstract class XyzPlc {

    public void paySalary(double baseSal){
        double sal = baseSal/12;
        System.out.println(sal);

    }

    abstract void promoteEmp(int empID);
    abstract void makeProfit();
    abstract double publishFinReport(long finYear);
    abstract String displayOfficeAddress();
    abstract int trainStaff();
}
