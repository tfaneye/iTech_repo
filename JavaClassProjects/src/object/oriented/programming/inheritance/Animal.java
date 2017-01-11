package object.oriented.programming.inheritance;

/**
 * Created by Tunde on 10/01/2017.
 */
public class Animal extends LivingOrganism{

    protected boolean hasEyes = true;
    private String animalTagByCountry = "BED005";

    public void makeNoise(){
        System.out.println("Making noise");
    }

    public void walk(){
        System.out.println("Walking");
    }
}
