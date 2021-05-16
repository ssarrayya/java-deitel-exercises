package ChapterSix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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