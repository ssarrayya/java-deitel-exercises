package codewars;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

class VowelCountTest {
    @Test
    void testCase1() {
        assertEquals("Nope!", 5, VowelCount.getCount("abracadabra"));
    }
}