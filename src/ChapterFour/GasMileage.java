package ChapterFour;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the miles driven for this trip: ");
        int milesDriven = input.nextInt();

        System.out.println("Enter the gallons used for this trip: ");
        int gallonsUsed = input.nextInt();

        int milesPerGallon = milesDriven / gallonsUsed;
        int totalMilesPerGallon = 0;
        int tripCounter = 0;

        while (milesDriven > 0 && gallonsUsed > 0) {
            totalMilesPerGallon +=  milesPerGallon;
            tripCounter++;

            System.out.println("Enter the miles driven for this trip: ");
            milesDriven = input.nextInt();

            System.out.println("Enter the gallons used for this trip: ");
            gallonsUsed = input.nextInt();
        }
        System.out.println("The miles per gallon used for a trip is "  + milesPerGallon);
        System.out.println("The total miles per gallon used for the " + tripCounter + " trips is " + totalMilesPerGallon);
    }
}
