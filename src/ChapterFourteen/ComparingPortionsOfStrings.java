package ChapterFourteen;

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
