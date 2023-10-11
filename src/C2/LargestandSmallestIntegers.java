//2.24
package chapter2;

import java.util.Scanner;

public class LargestandSmallestIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int largest = Integer.MIN_VALUE; // Initialize with the smallest possible integer
        int smallest = Integer.MAX_VALUE; // Initialize with the largest possible integer

        System.out.println("Enter five integers:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            int currentNumber = scanner.nextInt();

            // Update largest if the current number is greater
            if (currentNumber > largest) {
                largest = currentNumber;
            }

            // Update smallest if the current number is smaller
            if (currentNumber < smallest) {
                smallest = currentNumber;
            }
        }

        System.out.println("Largest integer: " + largest);
        System.out.println("Smallest integer: " + smallest);
    }

}
