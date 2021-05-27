package ChapterSeven.whotCards;

import ChapterSeven.whotCards.exceptionss.StackOverflowException;
import ChapterSeven.whotCards.exceptionss.StackUnderflowException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotSame;

public class WhotCardDeckTest {
    private WhotCardDeck cardDeck;

    @BeforeEach
    void setUp() {
        cardDeck = new WhotCardDeck(6);
    }
    @Test
    void testThatCardDeckHasAFixedSize() {
        assertEquals(6, cardDeck.getSize());
    }

    @Test
    void pushOnce_confirmThatCardPushedLastIsAtTop() {
        WhotCard card = WhotCard.createCrossCardsWithValues(2);
        cardDeck.push(card);
        assertSame(card, cardDeck.peek());
    }

    @Test
    void pushTwice_popAndConfirmThatCardPushedLastIsAtTop() {
        WhotCard firstCard = WhotCard.createCrossCardsWithValues(2);
        WhotCard secondCard = WhotCard.createTriangleCardsWithValues(2);

        cardDeck.push(firstCard);
        cardDeck.push(secondCard);
        WhotCard poppedCard = cardDeck.pop();

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
        WhotCard card = WhotCard.createCrossCardsWithValues(2);
        for (int i = 0; i < 6; i++) {
            cardDeck.push(card);
        }
        assertTrue(cardDeck.isFull());
        assertThrows(StackOverflowException.class, ()->cardDeck.push(card));
    }

    @Test
    void testThatDeckCanBeShuffled() {
        //create cards
        WhotCard firstCard = WhotCard.createCrossCardsWithValues(2);
        WhotCard secondCard = WhotCard.createTriangleCardsWithValues(7);
        WhotCard thirdCard = WhotCard.createCircleCardsWithValues(7);
        WhotCard fourthCard = WhotCard.createStarCardsWithValues(3);
        WhotCard fifthCard = WhotCard.createSquareCardsWithValues(3);

        //declare an array of cards created
        WhotCard[] cards = {firstCard, secondCard, thirdCard, fourthCard, fifthCard};

        //push cards
        for (WhotCard i : cards) {
            cardDeck.push(i);
        }

        //assert that the last card is the last card before shuffling
        assertSame(fifthCard, cardDeck.peek());

        cardDeck.shuffleCardDeck();
        //assert that the last card is the last card after shuffling
        assertNotSame(fifthCard, cardDeck.peek());
    }
}
