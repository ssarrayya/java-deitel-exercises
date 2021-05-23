package ChapterSeven;

import ChapterSeven.exceptions.InvalidCardValueException;

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
}
