package chapter6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SeparatingDigitsTest {
    SeparatingDigits sd;

    @BeforeEach
    void startAllTestWith() {
        sd = new SeparatingDigits();
    }

    @Test
    void testSeparatingDigits(){
        System.out.println(sd.displayDigits(87643));
    }
}