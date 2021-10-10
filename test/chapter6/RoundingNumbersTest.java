package chapter6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RoundingNumbersTest {
    RoundingNumbers rn;

    @BeforeEach
    void commenceTheTestWith() {
        rn = new RoundingNumbers();
    }

    @Test
    void roundNumbersWithMethods() {
        rn.roundToNearestInteger();
        rn.roundToTenths();
        rn.roundToHundredths();
        rn.roundToThousandths();
    }
}