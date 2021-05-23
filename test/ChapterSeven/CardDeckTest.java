package ChapterSeven;

import ChapterSeven.exceptions.StackOverflowException;
import ChapterSeven.exceptions.StackUnderflowException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static ChapterSeven.Suits.*;
import static org.junit.jupiter.api.Assertions.*;

public class CardDeckTest {
    private CardDeck cardDeck;

    @BeforeEach
    void setUp() {
        cardDeck = new CardDeck(6);
    }
    @Test
    void testThatCardDeckHasAFixedSize() {
        assertEquals(6, cardDeck.getSize());
    }

    @Test
    void pushOnce_confirmThatCardPushedLastIsAtTop() {
        Card card = new Card(HEART, 8);
        cardDeck.push(card);
        assertSame(card, cardDeck.peek());
    }

    @Test
    void pushTwice_popAndConfirmThatCardPushedLastIsAtTop() {
        Card firstCard = new Card(DIAMOND, 7);
        Card secondCard = new Card(HEART, 3);

        cardDeck.push(firstCard);
        cardDeck.push(secondCard);
        Card poppedCard = cardDeck.pop();

        assertSame(secondCard, poppedCard);
        assertSame(firstCard, cardDeck.peek());
    }

    @Test
    void testThatIfDeckIsEmpty_popWillThrowStackUnderflowException() {
        assertTrue(cardDeck.isEmpty());
        assertThrows(StackUnderflowException.class, ()->cardDeck.pop());
    }

    @Test
    void testThatIfDeckIsEmpty_peekWillThrowStackUnderflowException() {
        assertTrue(cardDeck.isEmpty());
        assertThrows(StackUnderflowException.class, ()->cardDeck.peek());
    }

    @Test
    void testThatIfDeckIsFull_pushWillThrowStackOverflowException() {
        Card card = new Card(CLUB, 3);
        for (int i = 0; i < 6; i++) {
            cardDeck.push(card);
        }
        assertTrue(cardDeck.isFull());
        assertThrows(StackOverflowException.class, ()->cardDeck.push(card));
    }
}
