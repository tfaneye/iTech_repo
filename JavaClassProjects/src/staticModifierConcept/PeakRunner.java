package staticModifierConcept;

import static staticModifierConcept.PeakMilk.getCompanyName;

/**
 * Created by Tunde on 12/01/2017.
 */
public class PeakRunner {

    public static void main(String[] args){
        PeakMilk milk = new PeakMilk("Peak");
        String name = milk.getMilkName();
        System.out.println(name);

        String compName = getCompanyName();
        System.out.println(compName);

        String comp = PeakMilk.getCompanyName();

        System.out.println(comp);

    }
}
