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
