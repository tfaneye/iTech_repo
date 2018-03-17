package getterSetterExamples;

/**
 * Created by inet-tech on 08/01/17.
 */
public class MyCompany {

    private double employeeSalary = 2000;

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public void giveBonus(){

        if(employeeSalary <= 2000){
            employeeSalary = employeeSalary + 500;
            System.out.println("Your new Sal in now " + employeeSalary);
        }else{
            System.out.println("You are not entitle for bonus at this time");
        }

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
