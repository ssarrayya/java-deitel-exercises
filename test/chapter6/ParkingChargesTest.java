package chapter6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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