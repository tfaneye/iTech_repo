package object.oriented.programming.polymorphism;

/**
 * Created by Tunde on 22/12/2016.
 */
public class Tea {

    private String teaName;
    private int teaNumber;
    private double teaPrice;

    public Tea() {
        this.teaName = "Lipton";
        this.teaNumber = 5;
        this.teaPrice = 50.0;
    }

    public Tea(String teaName) {
        this.teaName = teaName;
        this.teaNumber = 5;
        this.teaPrice = 50.0;
    }

    public Tea(String teaName, int teaNumber) {
        this.teaName = teaName;
        this.teaNumber = teaNumber;
        this.teaPrice = 50.0;
    }

    public Tea(String teaName, int teaNumber, double teaPrice) {
        this.teaName = teaName;
        this.teaNumber = teaNumber;
        this.teaPrice = teaPrice;
    }

    //example of Overloading by changing number of Arg Parameter
    public void drinkTea(){
        System.out.println("No parameter");
    }

    public void drinkTea(String teaName){
        System.out.println("Takes one parameter");
    }

    public void drinkTea(String teaName, String ShopName){
        System.out.println("Takes two parameters");
    }

    public void drinkTea(String teaName, String ShopName, String shopOwner){
        System.out.println("Takes three parameters");
    }


    //example of Overloading by changing the datatype
    public void drinkTea(int teaNumber){
        System.out.println("No parameter");
    }

    public void drinkTea(int teaNumber, int teaPrice){
        System.out.println("two parameter");
    }

    public void drinkTea(int teaNumber, int teaPrice, double teaCode){
        System.out.println("three parameter");
    }

    //example of Overloading by using customised datatype
    public void drinkTea(SalesGirl salesGirlName){
        System.out.println("customised parameter "+salesGirlName);
    }
}
