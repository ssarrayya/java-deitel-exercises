package ChapterFour;

import java.util.Scanner;

public class Decryptor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a four-digit number: ");
        int initialNumber = input.nextInt();
        
        if(initialNumber >= 1000 && initialNumber < 10000) {
            int firstDigit = initialNumber % 100 / 10;
            firstDigit += 3;

            int secondDigit = initialNumber % 10;
            secondDigit += 3;

            int thirdDigit = initialNumber / 1000;
            thirdDigit += 3;

            int fourthDigit = initialNumber % 1000 / 100;
            fourthDigit += 3;

            int decryptedInteger = (firstDigit * 1000 + secondDigit * 100 + thirdDigit * 10 + fourthDigit) % 10000;
            System.out.println("The decrypted number is " + decryptedInteger);
        }
    }
}
