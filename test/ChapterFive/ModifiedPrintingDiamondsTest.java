package ChapterFive;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifiedPrintingDiamondsTest {
    ModifiedPrintingDiamonds pd;

    @BeforeEach
    void startTestsWith() {
        pd = new ModifiedPrintingDiamonds();
    }

    @Test
    void testThatApplicationCanPrintDiamondsAccordingToSize(){
        pd.printDiamond(6);
    }
}