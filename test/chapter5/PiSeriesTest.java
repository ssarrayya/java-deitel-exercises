package chapter5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PiSeriesTest {
    PiSeries calculate;

    @BeforeEach
    void startTestsWith(){
        calculate = new PiSeries();
    }

    @Test
    void calculatePiSeries(){
        calculate.calculatePiSeries();
    }
}
