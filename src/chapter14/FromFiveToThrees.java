package chapter14;

/*
14.17 (Creating Three-Letter Strings from a Five-Letter Word) Write an application that reads a
five-letter word from the user and produces every possible three-letter string that can be derived
from the letters of that word. For example, the three-letter words produced from the word “bathe”
include “ate,” “bat,” “bet,” “tab,” “hat,” “the” and “tea.”
*/

import java.security.SecureRandom;
import java.util.Scanner;

public class FromFiveToThrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a five-letter word");
        String fiveLetterWord = scanner.nextLine();
        char[] letters = fiveLetterWord.toCharArray();

        final int LENGTH_OF_GIVEN_WORD = 5;
        final int LENGTH_OF_NEW_WORD = 3;
        SecureRandom rdm = new SecureRandom();
        int i;

        if(letters.length == LENGTH_OF_GIVEN_WORD) {
            for (int k = 0; k <= Math.pow(LENGTH_OF_GIVEN_WORD, 4); k++) {
                StringBuilder newWord = new StringBuilder();
                for (int j = 0; j < LENGTH_OF_NEW_WORD; j++) {
                    i = rdm.nextInt(5);
                    newWord.append(letters[i]);
                }
                System.out.println(newWord + "\n");
            }
        } //todo look up how to connect to actual dictionary
    }
}
