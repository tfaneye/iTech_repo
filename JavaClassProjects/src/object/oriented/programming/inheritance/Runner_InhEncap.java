package object.oriented.programming.inheritance;

import object.oriented.programming.encapConcept.Dove;

/**
 * Created by Tunde on 10/01/2017.
 */
public class Runner_InhEncap {

    public static void main(String[] args) {

        Dove dove = new Dove();
        dove.getDoveName();
        dove.walk();
        dove.resistAntibiotic();

        //Using superclass to instantiate subclass
        Animal dove1 = new Dove();
        dove1.resistAntibiotic();

        LivingOrganism dove2 = new Dove();
        dove2.resistAntibiotic();
    }
}
