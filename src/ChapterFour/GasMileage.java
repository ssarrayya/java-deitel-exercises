package ChapterFour;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalMilesPerGallon = 0;
        int tripCounter = 0;

        System.out.println("Enter the miles driven for this trip: ");
        double milesDriven = input.nextDouble();

        System.out.println("Enter the gallons used for this trip: ");
        double gallonsUsed = input.nextDouble();

        double milesPerGallon = milesDriven / gallonsUsed;

        while (milesDriven > 0 && gallonsUsed > 0) {
            totalMilesPerGallon = totalMilesPerGallon + milesPerGallon;
            tripCounter = tripCounter + 1;

            System.out.println("Enter the miles driven for this trip: ");
            milesDriven = input.nextInt();

            System.out.println("Enter the gallons used for this trip: ");
            gallonsUsed = input.nextDouble();

        }

        if(tripCounter != 0) {
            double averageMilesPerGallon = totalMilesPerGallon / tripCounter;
            System.out.println("The total miles per gallon used for the " + tripCounter + " trips is " + totalMilesPerGallon);
            System.out.println("The average miles per gallon used for a trip is "  + averageMilesPerGallon);
        }
    }
}
