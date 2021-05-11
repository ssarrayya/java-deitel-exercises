package ChapterFive;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintingDiamondsTest {
    PrintingDiamonds pd;

    @BeforeEach
    void startTestWith(){
        pd = new PrintingDiamonds();
    }

    @Test
    void printDiamond() {
        pd.printDiamond();
        pd.otherHalf();
    }
}