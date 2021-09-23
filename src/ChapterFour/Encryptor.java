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

package ChapterFour;

import java.util.Scanner;

public class Encryptor {
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
