package object.oriented.programming.abstractInJava;

/**
 * Created by Tunde on 27/12/2016.
 */
public class AbstractRunner {

    static public void main(String[] args){

        XyzPlc xyzPlc = new XyzInsurancePlc();
        xyzPlc.paySalary(30000);

    }
}
