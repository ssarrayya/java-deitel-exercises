package ClassTests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class KataaTest {
    private final Kataa kataa = new Kataa();
    int[] originalArray = {2, 0, 1, 5};
    int[] secondArray = {2, 0, 1, 5};

    @Test
    void testThatArrayCanBeShuffled() {
        Kataa.shuffle(originalArray);
        assertFalse(Arrays.equals(originalArray, secondArray));
    }

    @Test
    void testThatArrayCanBeSortedInAscendingOrder() {
        Kataa.sortInAscendingOrder(originalArray);
        assertFalse(Arrays.equals(originalArray, secondArray));
    }

    @Test
    void testThatArrayCanBeSortedInDescendingOrder() {
        Kataa.sortInDescendingOrder(originalArray);
        assertFalse(Arrays.equals(originalArray, secondArray));
    }
}
