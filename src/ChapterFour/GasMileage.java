/*
4.17 (Gas Mileage) Drivers are concerned with the mileage their automobiles get. One driver has
kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
a Java application that will input the miles driven and gallons used (both as integers) for each trip.
The program should calculate and display the miles per gallon obtained for each trip and print the
combined miles per gallon obtained for all trips up to this point. All averaging calculations should
produce floating-point results. Use class Scanner and sentinel-controlled repetition to obtain the
data from the user.
 */

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
