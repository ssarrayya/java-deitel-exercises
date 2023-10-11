//2.34
package chapter2;

import java.util.Scanner;

public class WorldPopulationGrowthCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the current world population from the user
        System.out.print("Enter the current world population: ");
        long currentPopulation = scanner.nextLong();

        // Get the annual world population growth rate from the user (as a decimal)
        System.out.print("Enter the annual world population growth rate (as a decimal): ");
        double growthRate = scanner.nextDouble();

        // Calculate the estimated world population for the next five years
        for (int year = 1; year <= 5; year++) {
            currentPopulation += (long) (currentPopulation * growthRate);
            System.out.printf("Estimated population after %d year(s): %,d%n", year, currentPopulation);
        }
    }
}
