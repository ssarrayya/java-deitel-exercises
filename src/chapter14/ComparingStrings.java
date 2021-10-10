package chapter14;

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
