package ChapterSeven.normalCards;

import ChapterSeven.normalCards.exceptions.InvalidCardValueException;

public class Card {
    private final Suits suit;
    private final int value;

    public Card(Suits suit, int value) {
        if (value < 1 || value > 13) {
            throw new InvalidCardValueException(value + "is not a valid value");
        }
        this.suit = suit;
        this.value = value;
    }

    public Suits getSuit() {
        return suit;
    }

    public String getValue() {
        return switch (this.value) {
            case 1 -> "Ace";
            case 11 -> "Jack";
            case 12 -> "Queen";
            case 13 -> "King";
            default -> "" + value;
        };
    }

    @Override
    public String toString() {
        return getValue() + " of " + suit.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(!this.getClass().equals(obj.getClass())) { return true; }
        Card cardToBeComparedWith = (Card) obj;
        return this.value == cardToBeComparedWith.value || this.suit == cardToBeComparedWith.suit;
    }
}
