package chapter14;

/*
14.3 (Comparing Strings) Write an application that uses String method compareTo to compare two strings input
by the user. Output whether the first string is less than, equal to or greater than the second.
 */

import org.junit.jupiter.api.Test;

public class ComparingStrings {
    @Test
    void compareStrings () {
        String firstWord = "sarah";
        String secondWord = "SARAH";

        if(firstWord.compareToIgnoreCase(secondWord) > 0)
            System.out.println(firstWord + " is greater than " + secondWord);
        if(firstWord.compareToIgnoreCase(secondWord) < 0)
            System.out.println(firstWord + " is less than " + secondWord);
        else
            System.out.println(firstWord + " is equal to " + secondWord);
    }
}
