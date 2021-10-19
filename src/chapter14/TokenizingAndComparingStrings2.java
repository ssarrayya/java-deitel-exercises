package chapter14;

/*
14.14 (Tokenizing and Comparing Strings) Write an application that reads a line of text, tokenizes it using
space characters as delimiters and outputs only those words ending with the letters "ED".
 */

import java.util.Scanner;

public class TokenizingAndComparingStrings2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text here");
        String text = scanner.nextLine();
        String[] tokens = text.split(" ");
        for (String word : tokens) {
            if(word.endsWith("ED")) {
                System.out.println(word);
            }
        }
    }
}
