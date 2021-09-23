/*
4.31 (Printing the Decimal Equivalent of a Binary Number) Write an application that inputs an
integer containing only 0s and 1s (i.e., a binary integer) and prints its decimal equivalent. [Hint: Use
the remainder and division operators to pick off the binary number’s digits one at a time, from right
to left. In the decimal number system, the rightmost digit has a positional value of 1 and the next
digit to the left a positional value of 10, then 100, then 1000, and so on. The decimal number 234
can be interpreted as 4 * 1 + 3 * 10 + 2 * 100. In the binary number system, the rightmost digit has
a positional value of 1, the next digit to the left a positional value of 2, then 4, then 8, and so on.
The decimal equivalent of binary 1101 is 1 * 1 + 0 * 2 + 1 * 4 + 1 * 8, or 1 + 0 + 4 + 8 or, 13.]
 */

package ChapterFour;

import java.util.Scanner;

public class DecimalEquivalentOfBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int binaryNumber = input.nextInt();

        int decimalNumber = 0;

        if(binaryNumber >= 10 && binaryNumber <= 99) {
            int firstDigit = binaryNumber % 10;
            int secondDigit = binaryNumber / 10;

            if(firstDigit == 1 || firstDigit == 0 && (secondDigit == 1 || secondDigit == 0)) {
                decimalNumber = firstDigit + secondDigit * 2;
            }
            System.out.println("The decimal equivalent of " + binaryNumber + "is " + decimalNumber);
        } else if(binaryNumber >= 100 && binaryNumber <= 999) {
            int firstDigit = binaryNumber % 10;
            int secondDigit = binaryNumber / 10 % 10;
            int thirdDigit = binaryNumber / 100;

            if(firstDigit == 1 || firstDigit == 0 && (secondDigit == 1 || secondDigit == 0) && (thirdDigit == 1 || thirdDigit == 0)) {
                decimalNumber = firstDigit + secondDigit * 2 + thirdDigit * 4;
            }
            System.out.println("The decimal equivalent of " + binaryNumber + " is " + decimalNumber);
        } else if(binaryNumber >= 1000 && binaryNumber <= 9999) {
            int firstDigit = binaryNumber % 10;
            int secondDigit = binaryNumber / 10 % 10;
            int thirdDigit = binaryNumber / 100 % 10;
            int fourthDigit = binaryNumber / 1000;

            if(firstDigit == 1 || firstDigit == 0 && (secondDigit == 1 || secondDigit == 0) && (thirdDigit == 1 || thirdDigit == 0) && (fourthDigit == 1 || fourthDigit == 0)) {
                decimalNumber = firstDigit + secondDigit * 2 + thirdDigit * 4 + fourthDigit * 8;
            }
            System.out.println("The decimal equivalent of " + binaryNumber + " is " + decimalNumber);
        } else if(binaryNumber >= 10000 && binaryNumber <= 99999) {
            int firstDigit = binaryNumber % 10;
            int secondDigit = binaryNumber / 10 % 10;
            int thirdDigit = binaryNumber / 100 % 10;
            int fourthDigit = binaryNumber / 1000 % 10;
            int fifthDigit = binaryNumber / 10000;

            if (firstDigit == 1 || firstDigit == 0 && (secondDigit == 1 || secondDigit == 0) && (thirdDigit == 1 || thirdDigit == 0) && (fourthDigit == 1 || fourthDigit == 0) && (fifthDigit == 1 || fifthDigit == 0)) {
                decimalNumber = firstDigit + secondDigit * 2 + thirdDigit * 4 + fourthDigit * 8 + fifthDigit * 16;
            }
            System.out.println("The decimal equivalent of " + binaryNumber + " is " + decimalNumber);
        } else {
            System.out.println("Number is not a binary number");
        }

    }
}
