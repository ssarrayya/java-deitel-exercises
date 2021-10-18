package chapter14;

/*
14.7 (Pig Latin) Write an application that encodes English-language phrases into pig Latin. Pig Latin is a
form of coded language. There are many different ways to form pig Latin phrases. For simplicity, use the
following algorithm: To form a pig Latin phrase from an English-language phrase, tokenize the phrase into
words with String method split. To translate each English word into a pig Latin word, place the first letter
of the English word at the end of the word and add the letters “ay.” Thus, the word “jump” becomes “umpjay,”
the word “the” becomes “hetay,” and the word “computer” becomes “omputercay.” Blanks between words remain as
blanks. Assume the following: The English phrase consists of words separated by blanks, there are no
punctuation marks and all words have two or more letters. Method printLatinWord should display each word.
Each token is passed to method printLatinWord to print the pig Latin word. Enable the user to input the
sentence. Keep a running display of all the converted sentences in a text area.
*/

import java.util.Scanner;

public class PigLatin {
    /**
     * Splits a sentence into words
     * @param sentence word to split
     * @return array of words in sentence
     */
    public static String[] splitSentence(String sentence) {
        return sentence.split(" ");
    }

    public static StringBuilder printLatinWord(String word) {
        StringBuilder latinWord = new StringBuilder();
        latinWord.ensureCapacity(100);

        //1st method
//        char[] wordArray = word.toCharArray();
//        for(int i = 1; i < wordArray.length; i++) {
//            latinWord.append(wordArray[i]);
//        }
//        latinWord.append(wordArray[0]).append("ay");

        //2nd method
        latinWord.append(word.substring(1)).append(word.charAt(0)).append("ay");
        return latinWord;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence you want to translate:");
        String sentence = scanner.nextLine();
        scanner.close();
        String[] tokens = splitSentence(sentence);
        for(String word : tokens) {
            System.out.print(printLatinWord(word) + " ");
        }
    }
}
