package chapter14;

/*
14.13 (Tokenizing and Comparing Strings) Write an application that reads a line of text, tokenizes the
line using space characters as delimiters and outputs only those words beginning with the letter "b".
*/

import java.util.Scanner;

public class TokenizingAndComparingStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text here");
        String text = scanner.nextLine();
        String[] tokens = text.split(" ");
        for (String word : tokens) {
            if(word.startsWith("b")) {
                System.out.println(word);
            }
        }
    }
}
