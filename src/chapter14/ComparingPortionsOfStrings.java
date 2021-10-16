package chapter14;

/*
14.4 (Comparing Portions of Strings) Write an application that uses String method regionMatches to compare
two strings input by the user. The application should input the number of characters to be compared and the
starting index of the comparison. The application should state whether the strings are equal. Ignore the
case of the characters when performing the comparison.
 */

import org.junit.jupiter.api.Test;

public class ComparingPortionsOfStrings {
    @Test
    void comparePortionsOfStrings () {
        String firstWord = "sarah";
        String secondWord = "SARAH";

        if(firstWord.regionMatches(true, 0, secondWord, 0, 4))
            System.out.println("The strings are equal with the case ignored");
        else
            System.out.println("The strings are not equal");
    }
}
