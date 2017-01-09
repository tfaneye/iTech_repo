package staticModifierConcept;

/**
 * Created by Tunde on 09/01/2017.
 */
public class Milk {

    private String milkName;
    private static String companyName = "Cadbury Plc";

    public Milk(String milkName) {
        this.milkName = milkName;
    }

    public String getMilkName(){
        return milkName;
    }

    public static String getCompanyName(){
        return companyName;
    }

    public static void main(String[] args){
        Milk milk = new Milk("Peak");
        String name = milk.getMilkName();
        System.out.println(name);

        String compName = getCompanyName();
        System.out.println(compName);
    }
}
