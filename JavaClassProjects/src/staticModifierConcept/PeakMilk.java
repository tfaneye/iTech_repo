package staticModifierConcept;

/**
 * Created by Tunde on 09/01/2017.
 */
public class PeakMilk {

    private String milkName = "milk";
    private static String companyName = "Cadbury Plc";

    /*public PeakMilk(String milkName) {
        this.milkName = milkName;
    }*/

    public String getMilkName(){
        return milkName;
    }

    public static String getCompanyName(){
        return companyName;
    }
}