package objectConcept;

/**
 * Created by Tunde on 09/01/2017.
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
            }else if(detail == "Peak"){
                String milkName = (String)detail;
                System.out.println(milkName);
            }else if(detail == (Object) 230.0){
                double milkPrice = (double)detail;
                System.out.println(milkPrice);
            }
        }
    }

    public static void main(String[] args){
        RetailShops retailShops = new RetailShops();
        retailShops.checkMilkDetails();
    }
}
