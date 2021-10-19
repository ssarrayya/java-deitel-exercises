package chapter14;

/*
14.9 (Displaying a Sentence with Its Words Reversed) Write an application that inputs a line of text, tokenizes
the line with String method split and outputs the tokens in reverse order. Use space characters as delimiters.
 */

import java.util.Scanner;

public class ReverseSentence {
    public static String collectSentence() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence");

        return scanner.nextLine();
    }

    public static String reverseString(String word) {
        char[] charArray = word.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = charArray.length - 1; i >= 0; i--) {
            sb.append(charArray[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String sentence = collectSentence();

        String[] sentenceArray = PigLatin.splitSentence(sentence);

        for (String word : sentenceArray) {
            System.out.print(reverseString(word) + " ");
        }
    }
}
