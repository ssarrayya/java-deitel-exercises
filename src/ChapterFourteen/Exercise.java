package ChapterFourteen;

import org.junit.jupiter.api.Test;

public class Exercise {
    @Test
    void checkOccurrencesOfCharacter(){
        String k ="dogflyingbirdrunningflyfishstomping";

        int counter = 0;

        for(int index = 0; index < k.length(); index++) {
            if (k.charAt(index) == 'g'){
                counter++;
            }
        }

        System.out.println(counter);
    }

    @Test
    void checkOccurrencesOfSubstring(){
        String superString ="dogflyingbirdflyrunningflyfishstomping";
        String subString = "fly";

        int count = 0;

        for(int index = 0; index < superString.length(); index++) {
            if (superString.regionMatches(index, subString, 0, subString.length())){
                count++;
            }
        }

        System.out.println(count);
    }
}
