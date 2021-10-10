package extras;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeometricProgressionTest {
    GeometricProgression gp = new GeometricProgression();

    @Test
    void testForNextNumberInSequence() {
        int firstNumber = 2;
        int secondNumber = 4;
        int thirdNumber = 8;
        assertEquals(16, gp.GP(firstNumber, secondNumber, thirdNumber));
    }
}
