package ChapterSix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingChargesTest {
    ParkingCharges pc;

    @BeforeEach
    void beginTestsWith() {
        pc = new ParkingCharges();
    }

    @Test
    void calculateCharges() {
        pc.calculateCharges(8);
    }
}