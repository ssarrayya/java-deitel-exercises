package Extraa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticProgressionTest {
    ArithmeticProgression ap = new ArithmeticProgression();

    @Test
    void testForNextNumberInSequence() {
        int firstNumber = 2;
        int secondNumber = 4;
        int thirdNumber = 6;
        assertEquals(8, ap.AP(firstNumber, secondNumber, thirdNumber));
    }
}
