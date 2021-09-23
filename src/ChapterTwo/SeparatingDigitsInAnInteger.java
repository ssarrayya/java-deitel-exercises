/*
    2.30 (Separating the Digits in an Integer) Write an application that inputs one number consisting of five digits from the user, separates the number into its individual digits and prints the digits
separated from one another by three spaces each. For example, if the user types in the number 42339,
the program should print

        4  2  3  3  9

     Assume that the user enters the correct number of digits. What happens when you enter a
number with more than five digits? What happens when you enter a number with fewer than five
digits? [Hint: It’s possible to do this exercise with the techniques you learned in this chapter. You’ll
need to use both division and remainder operations to “pick off” each digit.]
 */
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
