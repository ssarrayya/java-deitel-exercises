//2.17
package chapter2;

import java.util.Scanner;

public class ArithmeticSmallestandLargest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three integers
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();

        // Calculate sum
        int sum = num1 + num2 + num3;

        // Calculate average (integer representation)
        int average = sum / 3;

        // Calculate product
        int product = num1 * num2 * num3;

        // Find the smallest number
        int smallest = Math.min(Math.min(num1, num2), num3);

        // Find the largest number
        int largest = Math.max(Math.max(num1, num2), num3);

        // Display the results
        System.out.printf("Sum: %d%n", sum);
        System.out.printf("Average (integer representation): %d%n", average);
        System.out.printf("Product: %d%n", product);
        System.out.printf("Smallest: %d%n", smallest);
        System.out.printf("Largest: %d%n", largest);
    }

}
