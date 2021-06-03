package ChapterTwo;

import java.util.Scanner;

public class SeparatingDigitsInAnInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a five-digit number");
        int userInput = input.nextInt();
        if(userInput >= 10000 && userInput <= 99999){
            int firstDigit = userInput / 10000;
            int secondDigit = userInput / 1000 % 10;
            int thirdDigit = userInput / 100 % 10;
            int fourthDigit = userInput / 10 % 10;
            int fifthDigit = userInput % 10;

            System.out.printf("%d   %d   %d   %d   %d", firstDigit, secondDigit, thirdDigit, fourthDigit, fifthDigit);
        } else {
            System.out.println("Incorrect number of digits entered!");
        }
    }
}
