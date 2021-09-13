package ChapterSeven.whotCards;

import ChapterSeven.whotCards.exceptionss.StackOverflowException;
import ChapterSeven.whotCards.exceptionss.StackUnderflowException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WhotCardDeckTest {
    private static WhotCardDeck cardDeck;

    @Test
    void testThatCardDeckCanBeFilled() {
        WhotCardDeck.cardDeckCanBeFilled();
        assertTrue(WhotCardDeck.isFull());
    }

    @Test
    void testThatCardDeckHasAFixedSize() {
        cardDeck = new WhotCardDeck(6);
        assertEquals(6, WhotCardDeck.getSize());
    }

    @Test
    void pushOnce_confirmThatCardPushedLastIsAtTop() {
        cardDeck = new WhotCardDeck(6);
        WhotCard card = WhotCard.createCrossCardsWithValues(2);
        WhotCardDeck.push(card);
        assertSame(card, cardDeck.peek());
    }

    @Test
    void pushTwice_popAndConfirmThatCardPushedLastIsAtTop() {
        cardDeck = new WhotCardDeck(2);
        WhotCard firstCard = WhotCard.createCrossCardsWithValues(2);
        WhotCard secondCard = WhotCard.createTriangleCardsWithValues(2);

        WhotCardDeck.push(firstCard);
        WhotCardDeck.push(secondCard);
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
        cardDeck = new WhotCardDeck(6);
        WhotCard card = WhotCard.createCrossCardsWithValues(2);
        for (int i = 0; i < 6; i++) {
            WhotCardDeck.push(card);
        }
        assertTrue(WhotCardDeck.isFull());
        assertThrows(StackOverflowException.class, ()-> WhotCardDeck.push(card));
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
            WhotCardDeck.push(i);
        }

        //assert that the last card is the last card before shuffling
        assertSame(fifthCard, cardDeck.peek());

        cardDeck.shuffleCardDeck();
        //assert that the last card is the last card after shuffling
        assertNotSame(fifthCard, cardDeck.peek());
    }
}
