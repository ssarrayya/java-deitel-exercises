/*
4.38 (Enforcing Privacy with Cryptography) The explosive growth of Internet communications
and data storage on Internet-connected computers has greatly increased privacy concerns. The field
of cryptography is concerned with coding data to make it difficult (and hopefully—with the most
advanced schemes—impossible) for unauthorized users to read. In this exercise you’ll investigate a
simple scheme for encrypting and decrypting data. A company that wants to send data over the Internet
has asked you to write a program that will encrypt it so that it may be transmitted more securely.
All the data is transmitted as four-digit integers. Your application should read a four-digit
integer entered by the user and encrypt it as follows: Replace each digit with the result of adding 7
to the digit and getting the remainder after dividing the new value by 10. Then swap the first digit
with the third, and swap the second digit with the fourth. Then print the encrypted integer. Write
a separate application that inputs an encrypted four-digit integer and decrypts it (by reversing the
encryption scheme) to form the original number. [Optional reading project: Research “public key
cryptography” in general and the PGP (Pretty Good Privacy) specific public key scheme. You may
also want to investigate the RSA scheme, which is widely used in industrial-strength applications.]
 */

package chapter4;

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
