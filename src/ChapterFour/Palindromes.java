package ChapterFour;

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
