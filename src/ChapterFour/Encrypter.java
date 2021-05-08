package ChapterFour;

import java.util.Scanner;

public class Encrypter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a four-digit number: ");

        int initialNumber = input.nextInt();

        if(initialNumber >= 1000 && initialNumber < 10000){
            int firstDigit = initialNumber / 1000;
            firstDigit += 7;
            firstDigit %= 10;

            int secondDigit = initialNumber % 1000 / 100;
            secondDigit += 7;
            secondDigit %= 10;

            int thirdDigit = initialNumber % 100 / 10;
            thirdDigit += 7;
            thirdDigit %= 10;

            int fourthDigit = initialNumber % 10;
            fourthDigit += 7;
            fourthDigit %= 10;

            int encryptedInteger = thirdDigit * 1000 + fourthDigit * 100 + firstDigit * 10 + secondDigit;
            System.out.println("The encrypted number is " + encryptedInteger);
        }


    }
}
