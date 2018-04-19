package ifeStatements;

import java.util.Scanner;

public class Transportation {

    private int currentCarSpeed = 40;
    private String roadType = "Motorway";
    private boolean isCarMoving = true;





    public void checkVehicleSpeed(){

        if(isCarMoving){
            currentCarSpeed--;
        }else {
            System.out.println("Car not moving");
            currentCarSpeed++;
        }

        //System.out.println("What road are you travelling?");

        /*Scanner scanner =new Scanner(System.in);
        String roadType = scanner.nextLine();*/

        if(roadType.equalsIgnoreCase("Motorway")){
            currentCarSpeed += 30;
            System.out.println(currentCarSpeed);
        }else {
            currentCarSpeed -= 10;
            System.out.println(currentCarSpeed);
        }


    }

    public static void main(String[] args) {
        Transportation transportation = new Transportation();
        transportation
                .checkVehicleSpeed();
    }
}
