//2.32
package chapter2;

import java.util.Scanner;

public class NegativePositiveZeroValues {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;

        System.out.println("Enter five numbers:");

        for (int i = 0; i < 5; i++) {
            int number = scanner.nextInt();

            if (number < 0) {
                negativeCount++;
            } else if (number > 0) {
                positiveCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Number of negative numbers: " + negativeCount);
        System.out.println("Number of positive numbers: " + positiveCount);
        System.out.println("Number of zeros: " + zeroCount);
    }

}
