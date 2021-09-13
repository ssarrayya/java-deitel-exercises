package ChapterSeven;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class AirlineReservationSystemmTest {
    private AirlineReservationSystemm ars;
    boolean[] seats = new boolean[10];

    @BeforeEach
    void setUp(){
        ars = new AirlineReservationSystemm();
    }

    @Test
    void createArrayOfSeats() {
        assertArrayEquals(seats, AirlineReservationSystemm.planeSeats);
    }

    @Test
    void testThatSeatsInFirstClassSectionCanBeChosen() {
        assertTrue(AirlineReservationSystemm.firstClassChooser());
    }

    @Test
    void testThatSeatsInEconomySectionCanBeChosen() {
        assertTrue(AirlineReservationSystemm.economyChooser());
    }

    @Test
    void testThatMultipleSeatsInFirstClassCanBeChosen() {
        AirlineReservationSystemm.firstClassChooser();
        AirlineReservationSystemm.firstClassChooser();
        assertTrue(AirlineReservationSystemm.planeSeats[0]);
        assertTrue(AirlineReservationSystemm.planeSeats[1]);
    }

    @Test
    void testThatMultipleSeatsInEconomyCanBeChosen() {
        AirlineReservationSystemm.economyChooser();
        AirlineReservationSystemm.economyChooser();
        AirlineReservationSystemm.economyChooser();
        assertTrue(AirlineReservationSystemm.planeSeats[5]);
        assertTrue(AirlineReservationSystemm.planeSeats[6]);
        assertTrue(AirlineReservationSystemm.planeSeats[7]);
        assertFalse(AirlineReservationSystemm.planeSeats[9]);
    }

    @Test
    void testThatIfAllSeatsInFirstClassAreTakenEconomyCanBeChosen() {
        AirlineReservationSystemm.firstClassChooser();
        AirlineReservationSystemm.firstClassChooser();
        AirlineReservationSystemm.firstClassChooser();
        AirlineReservationSystemm.firstClassChooser();
        AirlineReservationSystemm.firstClassChooser();
        assertTrue(AirlineReservationSystemm.planeSeats[0]);
        assertTrue(AirlineReservationSystemm.planeSeats[1]);
        assertTrue(AirlineReservationSystemm.planeSeats[2]);
        assertTrue(AirlineReservationSystemm.planeSeats[3]);
        assertTrue(AirlineReservationSystemm.planeSeats[4]);

        if(AirlineReservationSystemm.firstClassChooser()) {
            AirlineReservationSystemm.alternatePlacementForFirstClass();
        }
    }
}
