//2.30
package chapter2;

import java.util.Scanner;

public class SeparatingDigitsinInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();

        // Check if the number is five digits
        if (number < 10000 || number > 99999) {
            System.out.println("Please enter a five-digit number.");
            return;
        }

        // Extract and print each digit separated by three spaces
        int divisor = 10000;

        System.out.print(number / divisor + "   ");
        number %= divisor;
        divisor /= 10;

        for (int i = 0; i < 4; i++) {
            System.out.print(number / divisor + "   ");
            number %= divisor;
            divisor /= 10;
        }

        System.out.println();
    }

}
