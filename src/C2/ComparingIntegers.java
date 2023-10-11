//2.16
package chapter2;

import java.util.Scanner;

public class ComparingIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first integer
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second integer
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.printf("%d is larger%n", num1);
        } else if (num2 > num1) {
            System.out.printf("%d is larger%n", num2);
        } else {
            System.out.println("These numbers are equal");
        }
    }

}
