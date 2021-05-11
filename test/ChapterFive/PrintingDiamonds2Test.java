package ChapterFive;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintingDiamonds2Test {
    PrintingDiamonds2 pds;

    @BeforeEach
    void startTestWith(){
        pds = new PrintingDiamonds2();
    }

    @Test
    void printDiamonds() {
        pds.printDiamond();
    }
}