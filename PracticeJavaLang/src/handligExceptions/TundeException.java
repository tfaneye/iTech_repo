package handligExceptions;

public class TundeException extends ArithmeticException {

    private String message = "You do not have enough money in your account";
    private double amount;

    public TundeException(double amount) {

        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public String getMessage(){
        return message;
    }
}
