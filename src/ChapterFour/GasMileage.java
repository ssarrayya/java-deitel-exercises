package ChapterFour;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vehicleOwnerInput;
        int tripCounter = 0;
        int milesPerGallon = 0;
        int totalMilesPerGallon = milesPerGallon;
        
        do {
            System.out.println("Enter the miles driven for this trip: ");
            int milesDriven = input.nextInt();

            System.out.println("Enter the gallons used for this trip: ");
            int gallonsUsed = input.nextInt();

            milesPerGallon = milesDriven / gallonsUsed;
            System.out.println("The miles per gallon used for a trip is " + milesPerGallon);
            totalMilesPerGallon += milesPerGallon;
            
            tripCounter++;

            System.out.println("Enter 1 to input miles driven and gallons used or press any key to cancel");
            vehicleOwnerInput = input.nextInt();
        } while(vehicleOwnerInput == 1);
        System.out.println("The total miles per gallon used for the " + tripCounter + " trips is " + totalMilesPerGallon);
    }

}
