package chapter14;

/*
14.18 (Text Analysis) The availability of computers with string-manipulation capabilities has resulted in
some rather interesting approaches to analyzing the writings of great authors. Much attention has been
focused on whether William Shakespeare ever lived. Some scholars believe there’s substantial evidence
indicating that Christopher Marlowe actually penned the masterpieces attributed to Shakespeare. Researchers
have used computers to find similarities in the writings of these two authors. This exercise examines three
methods for analyzing texts with a computer.
    a) Write an application that reads a line of text from the keyboard and prints a table indicating the
    number of occurrences of each letter of the alphabet in the text. For example, the phrase
            To be, or not to be: that is the question:
    contains one “a,” two “b’s,” no “c’s,” and so on.
    b) Write an application that reads a line of text and prints a table indicating the number of one-letter
    words, two-letter words, three-letter words, and so on, appearing in the text. For example, Fig. 14.25
    shows the counts for the phrase
            Whether 'tis nobler in the mind to suffer
    c) Write an application that reads a line of text and prints a table indicating the number of occurrences
    of each different word in the text. The application should include the words in the table in the same
    order in which they appear in the text. For example, the lines
            To be, or not to be: that is the question:
            Whether 'tis nobler in the mind to suffer
    contain the word “to” three times, the word “be” two times, the word “or” once, etc.
 */

import java.util.Scanner;

public class TextAnalysis {
    private static Scanner scanner = new Scanner(System.in);

    public static void alphabetOccurrence() {
        System.out.println("Enter a text:");
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

    public static void wordsGroupedByCharacterLength() {
        System.out.println("Enter a text:");
        String text = scanner.nextLine();
        System.out.printf("%s%15s%n", "Word length", "Occurrences");

        char[] characters;
        int oneLetterCounter = 0;
        int twoLetterCounter = 0;
        int threeLetterCounter = 0;
        int fourLetterCounter = 0;
        int fiveLetterCounter = 0;
        int sixLetterCounter = 0;
        int sevenLetterCounter = 0;
        int eightLetterCounter = 0;

        String[] tokens = text.split(" ");
        for(String word : tokens) {
            characters = word.toCharArray();
            if(characters.length == 1) oneLetterCounter++;
            else if(characters.length == 2) twoLetterCounter++;
            else if(characters.length == 3) threeLetterCounter++;
            else if(characters.length == 4) fourLetterCounter++;
            else if(characters.length == 5) fiveLetterCounter++;
            else if(characters.length == 6) sixLetterCounter++;
            else if(characters.length == 7) sevenLetterCounter++;
            else eightLetterCounter++;
        }
        System.out.printf("%d%14d%n", 1, oneLetterCounter);
        System.out.printf("%d%14d%n", 2, twoLetterCounter);
        System.out.printf("%d%14d%n", 3, threeLetterCounter);
        System.out.printf("%d%14d%n", 4, fourLetterCounter);
        System.out.printf("%d%14d%n", 5, fiveLetterCounter);
        System.out.printf("%d%14d%n", 6, sixLetterCounter);
        System.out.printf("%d%14d%n", 7, sevenLetterCounter);
        System.out.printf("%d%14d%n", 8, eightLetterCounter);
    }

    public static void sameWordOccurrence() {
        System.out.println("Enter a text:");
        String text = scanner.nextLine();
        System.out.printf("%s%15s%n", "Words", "Occurrences");
        String[] tokens = text.split(" ");

        for (int i = 0; i < tokens.length; i++) {
            int counter = 0;
            for (int j = i + 1; j < tokens.length; j++) {
                if (tokens[i].equals(tokens[j])) {
                    counter++;
                }
            }
        }
    }

    public static void main(String[] args) {
        alphabetOccurrence();
        System.out.println();
        wordsGroupedByCharacterLength();
        System.out.println();
        sameWordOccurrence();
        scanner.close();
    }
}
