package chapter5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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