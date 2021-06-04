package ChapterTwo;

import java.util.Scanner;

public class CarPoolSavingsCalculator {
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
