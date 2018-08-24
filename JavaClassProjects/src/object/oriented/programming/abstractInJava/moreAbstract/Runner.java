package object.oriented.programming.abstractInJava.moreAbstract;

public class Runner {

    public static void main(String[] args) {

        Employee emp = new Employee(150, 0.0, 28, "John");
        double salary = emp.calculatePay();

        System.out.println(emp.getEmployeeName() + ", This is your monthly " + salary);

        Company comp = new Employee(200, 100, 30, "Janet");
        double newSal = comp.calculatePay();

        System.out.println(comp.getEmployeeName() + ", This is your monthly " + newSal);
    }
}
