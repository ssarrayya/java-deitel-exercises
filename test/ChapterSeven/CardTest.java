package ChapterSeven;

import ChapterSeven.exceptions.InvalidCardValueException;
import org.junit.jupiter.api.Test;
import static ChapterSeven.Suits.*;
import static org.junit.jupiter.api.Assertions.*;

public class CardTest {
    @Test
    void createDiamondCards() {
        Card card = new Card(DIAMOND, 2);
        assertSame(DIAMOND, card.getSuit());
    }

    @Test
    void createSpadeCards() {
        Card card = new Card(SPADE, 9);
        assertSame(SPADE, card.getSuit());
    }

    @Test
    void createClubCards() {
        Card card = new Card(CLUB, 3);
        assertSame(CLUB, card.getSuit());
    }

    @Test
    void createHeartCards() {
        Card card = new Card(HEART, 6);
        assertSame(HEART, card.getSuit());
    }

    @Test
    void createAceCardValues() {
        Card card = new Card(HEART, 1);
        assertEquals("Ace", card.getValue());
    }

    @Test
    void createJackCardValues() {
        Card card = new Card(HEART, 11);
        assertEquals("Jack", card.getValue());
    }

    @Test
    void createQueenCardValues() {
        Card card = new Card(HEART, 12);
        assertEquals("Queen", card.getValue());
    }

    @Test
    void createKingCardValues() {
        Card card = new Card(HEART, 13);
        assertEquals("King", card.getValue());
    }

    @Test
    void barInvalidCardValuesFromBeingCreated() {
        assertThrows(InvalidCardValueException.class, ()-> new Card(HEART, 16));
    }
}
