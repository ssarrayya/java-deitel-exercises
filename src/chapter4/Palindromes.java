/*
.30 (Palindromes) A palindrome is a sequence of characters that reads the same backward as forward. For example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554
and 11611. Write an application that reads in a five-digit integer and determines whether it’s a palindrome. If the number is not five digits long, display an error message and allow the user to enter
a new value.

 */

package chapter4;

import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fiveDigit = input.nextInt();

        if(fiveDigit >= 10000 && fiveDigit <= 99999) {
            if(fiveDigit % 10 == fiveDigit / 10000) {
                System.out.printf("%d%s%n", fiveDigit, " is a palindrome");
            } else if((fiveDigit / 1000) % 10 == (fiveDigit / 10) % 10) {
                System.out.printf("%d%s%n", fiveDigit, " is a palindrome");
            } else {
                System.out.printf("%d%s%n", fiveDigit, " is not a palindrome");
            }
        } else {
            System.out.println("Enter a five-digit value!");
        }
    }
}
