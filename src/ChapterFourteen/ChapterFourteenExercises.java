package ChapterFourteen;

import org.junit.jupiter.api.Test;


public class ChapterFourteenExercises {
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
