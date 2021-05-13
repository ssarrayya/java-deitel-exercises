package ChapterFour;

public class Decrypting {
    public void decoder(int userInput){
        int decryptedFirstDigit = 0;
        int decryptedSecondDigit = 0;
        int decryptedThirdDigit = 0;
        int decryptedFourthDigit = 0;

        int encryptedFirstDigit = userInput % 100 / 10;
        int encryptedSecondDigit = userInput % 10;
        int encryptedThirdDigit = userInput / 1000;
        int encryptedFourthDigit = userInput % 1000 / 100;

        for(int possibleAnswer = 0; possibleAnswer <= 9; possibleAnswer++){
            if ((possibleAnswer + 7) % 10 == encryptedFirstDigit){ decryptedFirstDigit = possibleAnswer; }
            if ((possibleAnswer + 7) % 10 == encryptedSecondDigit){ decryptedSecondDigit = possibleAnswer; }
            if ((possibleAnswer + 7) % 10 == encryptedThirdDigit){ decryptedThirdDigit = possibleAnswer; }
            if ((possibleAnswer + 7) % 10 == encryptedFourthDigit){ decryptedFourthDigit = possibleAnswer; }
        }
        int decryptedInteger = (decryptedFirstDigit * 1000 + decryptedSecondDigit * 100 + decryptedThirdDigit * 10 + decryptedFourthDigit);
        System.out.println(decryptedInteger);
    }
}
