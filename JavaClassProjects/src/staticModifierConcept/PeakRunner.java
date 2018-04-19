package staticModifierConcept;

import static staticModifierConcept.PeakMilk.getCompanyName;

/**
 * Created by Tunde on 12/01/2017.
 */
public class PeakRunner {

    public static void main(String[] args){
        PeakMilk milk = new PeakMilk("Peak", 45);
        //String name = milk.getMilkName();
        //int number = milk.getRegNumber();
        //System.out.println(name + "; " + number);

        int regNumber = milk.regNumber;
        regNumber = 20;

        String compName = getCompanyName();
        System.out.println(compName);

        String comp = PeakMilk.getCompanyName();

        System.out.println(comp);

    }
}
