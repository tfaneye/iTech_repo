package object.oriented.programming.abstractInJava;

/**
 * Created by Tunde on 09/01/2017.
 */
public class AbstractRunner {

    static public void main(String[] args){

        XyzPlc xyzPlc = new XyzInsurancePlc();
        xyzPlc.paySalary(30000);

    }
}
