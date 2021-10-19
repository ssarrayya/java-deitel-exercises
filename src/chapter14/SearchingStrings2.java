package chapter14;

/*
14.12 (Searching Strings) Write an application based on the application in Exercise 14.11 that inputs a line
of text and uses String method indexOf to determine the total number of occurrences of each letter of the
alphabet in the text. Uppercase and lowercase letters should be counted together. Store the totals for each
letter in an array, and print the values in tabular format after the totals have been determined.
 */

import java.util.Scanner;

public class SearchingStrings2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text");
        String sentence = scanner.nextLine().toLowerCase();
        System.out.printf("%s%15s%n", "Alphabets", "Occurrences");

        for (int j = 'a'; j <= (int) 'z'; j++) {
            int occurrences = 0;
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.indexOf((char) j, i) == -1) {
                    break;
                } else {
                    occurrences++;
                    i = sentence.indexOf((char) j, i);
                }
            }
            System.out.printf("%s%13d%n", (char) j, occurrences);
        }
    }
}
