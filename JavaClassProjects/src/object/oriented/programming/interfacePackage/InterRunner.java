package object.oriented.programming.interfacePackage;

/**
 * Created by Tunde on 09/01/2017.
 */
public class InterRunner {

    public static void main(String[] args) {

        AbcBankPlc abcBankPlc = new AbcBankPlc(01234567);
        abcBankPlc.displayOfficeAddress();

        //Using Interface to instantiate child Class
        AbcPlc abcPlc = new AbcSugarPlc(30000);
        abcPlc.displayOfficeAddress();
    }
}
