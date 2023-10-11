//2.35
package chapter2;

import java.util.Scanner;

public class CarPoolSavingsCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the information
        System.out.print("Enter total miles driven per day: ");
        double totalMilesPerDay = scanner.nextDouble();

        System.out.print("Enter cost per gallon of gasoline: ");
        double costPerGallon = scanner.nextDouble();

        System.out.print("Enter average miles per gallon: ");
        double milesPerGallon = scanner.nextDouble();

        System.out.print("Enter parking fees per day: ");
        double parkingFeesPerDay = scanner.nextDouble();

        System.out.print("Enter tolls per day: ");
        double tollsPerDay = scanner.nextDouble();

        // Calculate the cost per day of driving to work
        double costPerDay = (totalMilesPerDay / milesPerGallon) * costPerGallon
                + parkingFeesPerDay + tollsPerDay;

        // Display the cost per day
        System.out.printf("Your daily driving cost is: $%.2f%n", costPerDay);
    }
}
