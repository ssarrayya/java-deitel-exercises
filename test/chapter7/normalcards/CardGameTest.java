package chapter7.normalcards;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CardGameTest {
    private CardGame cardGame;

    @BeforeEach
    void setUp() {
        cardGame = new CardGame(2, 5);
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
