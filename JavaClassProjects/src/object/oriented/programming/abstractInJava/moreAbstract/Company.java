package object.oriented.programming.abstractInJava.moreAbstract;

public abstract class Company {
    private double basicPay;
    private double bonus;
    private int numOfDaysWorked;
    private String employeeName;

    public Company(double basicPay, double bonus, int numOfDaysWorked, String employeeName) {
        this.basicPay = basicPay;
        this.bonus = bonus;
        this.numOfDaysWorked = numOfDaysWorked;
        this.employeeName = employeeName;
    }

    public double calculatePay(){
        return 0.0;
    }

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public double getBonus() {
        return bonus;
    }

    public double computeBonus(){
        if((numOfDaysWorked >=1) && (numOfDaysWorked <= 5) ){
            bonus = 2.0;
        }else if((numOfDaysWorked >= 6) && (numOfDaysWorked <= 10)){
            bonus = 5.0;
        }else if((numOfDaysWorked >= 11) && (numOfDaysWorked <= 20)){
            bonus = 10.0;
        }else if((numOfDaysWorked >= 21) && (numOfDaysWorked <= 30)){
            bonus = 25.0;
        }

        return bonus;
    }

    public void setBonus(double bonus) {

        this.bonus = bonus;
    }

    public int getNumOfDaysWorked() {
        return numOfDaysWorked;
    }

    public void setNumOfDaysWorked(int numOfDaysWorked) {
        this.numOfDaysWorked = numOfDaysWorked;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
