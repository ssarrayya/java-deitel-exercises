package Extraa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirlineMoviesTest {
    AirlineMovies am;
    @BeforeEach
    void setUp() {
        am = new AirlineMovies();
    }

    @Test
    void testIfSumEqualToFlightLength() {
        assertTrue(am.isSumEqualToFlightLength());
        am.moviesThatEqualFlightLength();
    }
}