package chapter8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DateTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void dateFormatTest() {
        Date date = new Date(10, 14,2002);
        Date date1 = new Date("March", 3, 1992);
        Date date2 = new Date(147, 2000);


    }
}