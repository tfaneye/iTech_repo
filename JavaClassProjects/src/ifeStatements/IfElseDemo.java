package ifeStatements;

public class IfElseDemo {

    private boolean isMoving = true;
    private int currentSpeed = 40;

    public int applyBrakes() {
        if (isMoving) {
            currentSpeed--;

        } else {
            System.err.println("The bicycle has already stopped!");
        }
        return currentSpeed--;
    }

        public static void main(String[] args) {

        IfElseDemo ifElseDemo = new IfElseDemo();
        int newSpeed = ifElseDemo.applyBrakes();
            System.out.println(newSpeed);

            int testScore = 76;
            char grade;

            if (testScore >= 90) {
                grade = 'A';
            } else if (testScore >= 80) {
                grade = 'B';
            } else if (testScore >= 70) {
                grade = 'C';
            } else if (testScore >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            System.out.println("Grade = " + grade);

            for(int i=1; i<11; i++){
                System.out.println("Count is: " + i);
                if(i==5){
                    break;
                }

            }

            String[] names = { "John", "Mark", "James", "Matt" };
            for (String name :
                 names) {
                System.out.println(name);
               // System.out.println("==============================");
                /*if (name.toLowerCase().contains("James".toLowerCase())){
                    System.out.println(name);
                    break;
                }*/

            }
        }


      //  public void

}
