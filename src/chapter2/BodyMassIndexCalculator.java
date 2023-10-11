//2.33
package chapter2;

import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height in meters: ");
        double height = scanner.nextDouble();

        double bmi = calculateBMI(weight, height);
        System.out.printf("Your Body Mass Index (BMI) is: %.2f%n", bmi);

        System.out.println("BMI Categories:");
        System.out.println("Underweight: BMI less than 18.5");
        System.out.println("Normal weight: BMI 18.5 - 24.9");
        System.out.println("Overweight: BMI 25 - 29.9");
        System.out.println("Obesity: BMI 30 or greater");
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
}
