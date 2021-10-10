package chapter7.whotcards;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class WhotCardGameTest {
    private WhotCardGame cardGame;

    @BeforeEach
    void setUp() {
        cardGame = new WhotCardGame(2, 5);
    }

    @Test
    void cardGameCanBeCreated() {
        assertNotNull(cardGame);
    }

    @Test
    void cardGameHasANumberOfPlayers() {
        assertEquals(2, cardGame.getNumberOfPlayers());
    }

    @Test
    void cardGameHasAFixedNumberOfCardsToDeal() {
        assertEquals(5, cardGame.getNumberOfDealtCards());
    }
}
