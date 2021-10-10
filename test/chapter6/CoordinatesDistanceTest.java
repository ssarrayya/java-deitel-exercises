package chapter6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CoordinatesDistanceTest {
    CoordinatesDistance cd;

    @BeforeEach
    void startTestWith() {
        cd = new CoordinatesDistance();
    }

    @Test
    void distance() {
        cd.distance(2, 5, 6, 3);
    }
}