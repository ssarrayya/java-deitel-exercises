/*
    2.35 (Car-Pool Savings Calculator) Research several car-pooling websites. Create an application
that calculates your daily driving cost, so that you can estimate how much money could be saved by
carpooling, which also has other advantages such as reducing carbon emissions and reducing traffic
congestion. The application should input the following information and display the user’s cost per
day of driving to work:
a) Total miles driven per day.
b) Cost per gallon of gasoline.
c) Average miles per gallon.
d) Parking fees per day.
e) Tolls per day.

 */

package ChapterTwo;

import java.util.Scanner;

public class CarpoolSavingsCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the total miles driven every day");
        int totalMilesDriven = input.nextInt();
        System.out.println("Enter cost of gasoline");
        double gasolineCostPerGallon = input.nextDouble();
        System.out.println("Enter the average miles driven per gallon");
        int averageMilesDrivenPerGallon = input.nextInt();
        System.out.println("Enter your parking fee per day");
        double parkingFee = input.nextDouble();
        System.out.println("Enter tolls fee per day");
        double tollsFee = input.nextDouble();

        int costOfDrivingToWorkPerDay = (int) (tollsFee + parkingFee + (averageMilesDrivenPerGallon / totalMilesDriven) * gasolineCostPerGallon);
        System.out.printf("%s%d", "The cost of driving to work every day is ", costOfDrivingToWorkPerDay);
    }
}
