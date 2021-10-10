package chapter5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ModifiedPrintingDiamondsTest {
    ModifiedPrintingDiamonds pd;

    @BeforeEach
    void startTestsWith() {
        pd = new ModifiedPrintingDiamonds();
    }

    @Test
    void testThatApplicationCanPrintDiamondsAccordingToSize(){
        pd.printDiamond(18);
    }
}