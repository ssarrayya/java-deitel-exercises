package chapter14;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class StringPalindrome {
    @Test
    void checkIsPalindrome() {
        assertTrue(isPalindrome("radar"));
        assertTrue(isPalindrome("madam"));
        assertFalse(isPalindrome("Sarah"));
        assertFalse(isPalindrome("atlas"));
    }

    public static boolean isPalindrome (String userInput) {

        StringBuilder pal = new StringBuilder();

        for (int count = userInput.length() - 1; count >= 0; count--) {
            pal.append(userInput.charAt(count));
        }

        return pal.toString().equalsIgnoreCase(userInput);
    }
}
