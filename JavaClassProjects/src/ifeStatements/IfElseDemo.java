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



            // Example of for loop
            for(int i=1; i<11; i++){
                System.out.println("Count is: " + i);
                if(i==5){
                    break;
                }

            }

            // Example of Advanced for loop or foreach loop
            String[] names = { "John", "Mark", "James", "Matt" };
            for (String name : names) {
                System.out.println(name);
                System.out.println("==============================");
                if (name.toLowerCase().contains("James".toLowerCase())){
                    System.out.println(name);
                    break;
                }

            }

            int[] numbers = {1,2,3,4,5,6,7,8,9,10};
            for (int item : numbers) {
                System.out.println("Count is: " + item);
            }



            String word = "mississipi";
            int len = word.length();
            int numSs = 0;
            for (int i=0; i < len; i++){
                //we only interested in s
                if (word.charAt(i) != 's')
                    continue;

                //number of s increment
                numSs++;
            }
            System.out.println("there are " + numSs + "'s in " + word);
        }


      //  public void

}
