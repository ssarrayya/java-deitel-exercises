package ChapterFour;

import java.util.Scanner;

public class Decryptor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a four-digit number: ");
        int initialNumber = input.nextInt();

        int decryptedFirstDigit = 0;
        int decryptedSecondDigit = 0;
        int decryptedThirdDigit = 0;
        int decryptedFourthDigit = 0;
        
        int encryptedFirstDigit = initialNumber % 100 / 10;
        int encryptedSecondDigit = initialNumber % 10;
        int encryptedThirdDigit = initialNumber / 1000;
        int encryptedFourthDigit = initialNumber % 1000 / 100;

        for(int possibleAnswer = 0; possibleAnswer <= 9; possibleAnswer++){
            if ((possibleAnswer + 7) % 10 == encryptedFirstDigit){ decryptedFirstDigit = possibleAnswer; }
            if ((possibleAnswer + 7) % 10 == encryptedSecondDigit){ decryptedSecondDigit = possibleAnswer; }
            if ((possibleAnswer + 7) % 10 == encryptedThirdDigit){ decryptedThirdDigit = possibleAnswer; }
            if ((possibleAnswer + 7) % 10 == encryptedFourthDigit){ decryptedFourthDigit = possibleAnswer; }
        }
            int decryptedInteger = (decryptedFirstDigit * 1000 + decryptedSecondDigit * 100 + decryptedThirdDigit * 10 + decryptedFourthDigit);
            System.out.println("The decrypted number is " + decryptedInteger);
    }
}
