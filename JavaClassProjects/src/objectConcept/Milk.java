package objectConcept;

/**
 * Created by Tunde on 09/01/2017.
 */
public class Milk {

    private final String milkName;
    //private Object milkName = "Cow Bell";
    Object[] names;

    public Milk(String milkName) {
        this.milkName = milkName;

        names = new Object[10];
        names[0] = "Peak Mil";
        names[1] = 12;
        names[0] = 230.00;
        names[0] = true;
        names[0] = 87542212l;
    }



    public String getMilkName(){
        return(String) milkName;
    }

    public Object[] getMilkDetails(){
        return names;
    }
}
