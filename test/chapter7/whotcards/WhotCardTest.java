package chapter7.whotcards;

import org.junit.jupiter.api.Test;

import static chapter7.whotcards.WhotSuits.*;
import static org.junit.jupiter.api.Assertions.*;

public class WhotCardTest {
    private WhotCard card;

    @Test
    void createCircleCardsWithValues() {
        card = WhotCard.createCircleCardsWithValues(1);
        assertSame(CIRCLE, card.getSuit());
    }

    @Test
    void createTriangleCardsWithValues() {
        card = WhotCard.createTriangleCardsWithValues(3);
        assertSame(TRIANGLE, card.getSuit());
    }

    @Test
    void createCrossesCardsWithValues() {
        card = WhotCard.createCrossCardsWithValues(1);
        assertSame(CROSS, card.getSuit());
    }

    @Test
    void createSquaresCardsWithValues() {
        card = WhotCard.createSquareCardsWithValues(1);
        assertSame(SQUARE, card.getSuit());
    }

    @Test
    void createStarsCardsWithValues() {
        card = WhotCard.createStarCardsWithValues(1);
        assertSame(STAR, card.getSuit());
    }

    @Test
    void createWhotCards() {
        card = WhotCard.createWhotCards(0);
        assertSame(WHOT, card.getSuit());
    }

//    @Test
//    void barInvalidCircleCardValuesFromBeingCreated() {
//        assertThrows(InvalidCircleCardValueException.class, ()-> WhotCard.createCircleCardsWithValues(6));
//    }

    @Test
    void testThatCardsWithSameCardValuesAreTheSameWhenCompared() {
        WhotCard firstCard = WhotCard.createCircleCardsWithValues(1);
        WhotCard secondCard = WhotCard.createStarCardsWithValues(1);
        assertEquals(firstCard, secondCard);
    }

    @Test
    void testThatCardsWithSameFaceAreTheSameWhenCompared() {
        WhotCard firstCard = WhotCard.createCircleCardsWithValues(1);
        WhotCard secondCard = WhotCard.createCircleCardsWithValues(5);
        assertEquals(firstCard, secondCard);
    }
}
