package object.oriented.programming.interfacePackage;

/**
 * Created by Tunde on 09/01/2017.
 */
public class TescoExtra implements SunderlandCityCouncil {


    @Override
    public void getFreshFarmProduce() {

    }

    @Override
    public String showStoreName() {
        return null;
    }

    @Override
    public long getShopAccreditationNumber(String company) {
        return 0;
    }

    @Override
    public void payTaxToSunderlandCityCouncil() {

    }

    @Override
    public boolean doYouHaveCoolingVan() {
        return false;
    }

    @Override
    public void sellTobaccoToOver25() {
        boolean doesCustomerLookUnder25 = false;

        if(doesCustomerLookUnder25 == true){
            System.out.println("Please can you provide an ID");
        }else{
            System.out.println("Could you please go to the counter");
        }
    }
}
