package ChapterSeven.whotCards;

import static ChapterSeven.whotCards.WhotSuits.*;

public class WhotCard {
    private final WhotSuits whotSuit;
    private final int value;

    private WhotCard(WhotSuits whotSuit, int value) {
        this.whotSuit = whotSuit;
        this.value = value;
    }

    public WhotSuits getSuit() {
        return whotSuit;
    }

    public static WhotCard createTriangleCardsWithValues(int value) {
        return new WhotCard(TRIANGLE, value);
    }

    public static WhotCard createCrossCardsWithValues(int value) {
        return new WhotCard(CROSS, value);
    }

    public static WhotCard createSquareCardsWithValues(int value) {
        return new WhotCard(SQUARE, value);
    }

    public static WhotCard createStarCardsWithValues(int value) {
        return new WhotCard(STAR, value);
    }

    public static WhotCard createCircleCardsWithValues(int value) {
        return new WhotCard(CIRCLE, value);
    }

    public static WhotCard createWhotCards(int value) {
        return new WhotCard(WHOT, value);
    }

    @Override
    public String toString() {
        return value + " of " + whotSuit.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(!this.getClass().equals(obj.getClass())) { return true; }
        WhotCard cardToBeComparedWith = (WhotCard) obj;
        return this.value == cardToBeComparedWith.value || this.whotSuit == cardToBeComparedWith.whotSuit;
    }
}
