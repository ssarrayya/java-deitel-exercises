package chapter14;

/*
14.10 (Displaying Strings in Uppercase and Lowercase) Write an application that inputs a line of
text and outputs the text twice—once in all uppercase letters and once in all lowercase letters.
 */

public class StringCases {
    public static void main(String[] args) {
        String text = ReverseSentence.collectSentence();
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
    }
}
