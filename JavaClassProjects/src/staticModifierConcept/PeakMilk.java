package staticModifierConcept;

/**
 * Created by Tunde on 09/01/2017.
 */
public class PeakMilk {

    public int regNumber = 49;
    private String milkName = "Peak";

    //private String milkName = "milk";
    private static String companyName = "Cadbury Plc";

    public PeakMilk(String milkName, int regNumber) {
        this.milkName = milkName;
        this.regNumber = regNumber;
    }

    /*public String getMilkName(){
        return milkName;
    }*/

    /*public int getRegNumber(){
        return regNumber;
    }*/

    public static String getCompanyName(){
        return companyName;
    }
}