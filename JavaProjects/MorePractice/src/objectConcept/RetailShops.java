package objectConcept;

/**
 * Created by Tunde on 27/12/2016.
 */
public class RetailShops {

    public void checkMilkDetails(){
        Milk milk = new Milk("Peak");
        Object[] details = milk.getMilkDetails();

        for(Object detail : details){
            if(detail == (Object) true){
                boolean isMilkExpired = (boolean)detail;
                System.out.println(isMilkExpired);
            }else if(detail == (Object) 12){
                int milkQty = (int)detail;
                System.out.println(milkQty);
            }
        }
    }

    public static void main(String[] args){
        RetailShops retailShops = new RetailShops();
        retailShops.checkMilkDetails();
    }
}
