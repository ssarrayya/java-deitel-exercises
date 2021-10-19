package chapter14;

/*
14.11 (Searching Strings) Write an application that inputs a line of text and a search character and
uses String method indexOf to determine the number of occurrences of the character in the text
 */

import java.util.Scanner;

public class SearchingStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text");
        String sentence = scanner.nextLine();
        System.out.println("Enter a character to search for");
        String character = scanner.next();

        if(character.matches("\\w?|\\s?|\\d?")) {
            int occurrences = 0;
            for (int i = 0; i < sentence.length(); i++) {
                if(sentence.indexOf(character, i) == -1){
                    break;
                } else {
                    occurrences++;
                    i = sentence.indexOf(character, i);
                }
            }
            System.out.println("Number of occurrences of " + character + ": " + occurrences);
        }
    }
}
