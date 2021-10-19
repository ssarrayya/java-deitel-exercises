package chapter14;

/*
14.9 (Displaying a Sentence with Its Words Reversed) Write an application that inputs a line of text, tokenizes
the line with String method split and outputs the tokens in reverse order. Use space characters as delimiters.
 */

import java.util.Scanner;

public class ReverseSentence {
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Collects a sentence from user
     * @return the sentence
     */
    public static String collectSentence() {
        System.out.println("Enter a sentence");
        return scanner.nextLine();
    }

    public static String reverseSentence(String[] sentence) {
        StringBuilder sb = new StringBuilder();

        for (int i = sentence.length - 1; i >= 0; i--) {
            sb.append(sentence[i]).append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String sentence = collectSentence();
        scanner.close();

        String[] sentenceArray = PigLatin.splitSentence(sentence);

        System.out.print(reverseSentence(sentenceArray));
    }
}
