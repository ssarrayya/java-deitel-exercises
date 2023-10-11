//2.28
package chapter2;

import java.util.Scanner;

public class DiameterCircumferenceAreaofCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        int radius = scanner.nextInt();

        // Calculate diameter, circumference, and area
        double diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        // Output the results
        System.out.printf("Diameter: %.2f%n", diameter);
        System.out.printf("Circumference: %.2f%n", circumference);
        System.out.printf("Area: %.2f%n", area);
    }

}
