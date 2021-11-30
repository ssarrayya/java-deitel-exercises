package chapter14;

import java.util.Scanner;

public class MorseCode {
    private static final String[] morseCharacters = {
            ".-", "-...", "-.-.", "-..", ".",
            "..-.", "--.", "....", "..", ".---",
            "-.-", ".-..", "--", "-.", "---", ".--.",
            "--.-", ".-.", "...", "-", "..-", "...-",
            ".--", "-..-", "-.--", "--..",
            ".----", "..---", "...--", "....-", ".....",
            "-....", "--...", "---..", "----.", "-----",
            " "
    };

    private static final char[] normalCharacters = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g',
            'h', 'i', 'j', 'k', 'l', 'm', 'n',
            'o', 'p', 'q', 'r', 's', 't', 'u',
            'v', 'w', 'x', 'y', 'z',
            '1', '2', '3', '4', '5',
            '6', '7', '8', '9', '0', ' '
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text here");
        String text = scanner.nextLine().toLowerCase();
//        System.out.println(toMorseCode(text));
        System.out.println(toEnglishAlphabet(text));
    }

    private static String toMorseCode(String text) {
        char[] characters = text.toLowerCase().toCharArray();
        StringBuilder sb = new StringBuilder();

        for(char c : characters){
            for (int i = 0; i < normalCharacters.length; i++) {
                if (c == normalCharacters[i]){
                    sb.append(morseCharacters[i]).append(" ");
                    break;
                }
            }
        }
        sb.deleteCharAt(sb.length() -1);
        return sb.toString();
    }

    private static String toEnglishAlphabet(String text) {
        String[] characters = text.split("\\s{1,2}");
        StringBuilder sb = new StringBuilder();

        for(String c : characters){
            for (int i = 0; i < morseCharacters.length; i++) {
                if (c.equals(morseCharacters[i])) {
                    sb.append(normalCharacters[i]);
                    break;
                }
            }
        }
        return sb.toString();
    }
}
