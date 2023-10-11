//2.15
package chapter2;

import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first integer
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second integer
        System.out.print("Enter the second integer:");
        int num2 = scanner.nextInt();

        // Calculate and display the sum
        int sum = num1 + num2;
        System.out.printf("Sum: %d%n", sum);

        // Calculate and display the product
        int product = num1 * num2;
        System.out.printf("Product: %d%n", product);

        // Calculate and display the difference
        int difference = num1 - num2;
        System.out.printf("Difference:%d%n", difference);

        // Check for division by zero
        if (num2 != 0) {
            // Calculate and display the quotient (division)
            double quotient = (double) num1 / num2;
            System.out.printf("Quotient: %.2f%n", quotient);
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }

}
