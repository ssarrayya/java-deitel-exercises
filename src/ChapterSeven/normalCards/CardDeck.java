package ChapterSeven.normalCards;

import ChapterSeven.normalCards.exceptions.StackOverflowException;
import ChapterSeven.normalCards.exceptions.StackUnderflowException;
import java.security.SecureRandom;

public class CardDeck {
    private final Card[] cards;
    private int lastPushedLocation = -1;

    public CardDeck(int numberOfCards) {
        cards = new Card[numberOfCards];
    }

    public int getSize() {
        return cards.length;
    }

    public void push(Card card) {
        if(isFull()) {
            throw new StackOverflowException("Card deck is full!");
        }
        lastPushedLocation++;
        cards[lastPushedLocation] = card;
    }

    public Card peek() {
        if(isEmpty()) {
            throw new StackUnderflowException("Card deck is empty!");
        }
        return cards[lastPushedLocation];
    }

    public Card pop() {
        if(isEmpty()) { throw new StackUnderflowException("Card deck is empty!"); }
        return cards[lastPushedLocation--];
    }

    public boolean isEmpty() {
        return lastPushedLocation == -1;
    }

    public boolean isFull() {
        return lastPushedLocation == getSize() - 1;
    }

    public void shuffleCardDeck() {
        SecureRandom shuffler = new SecureRandom();
        Card exchanger;

        for (int i = 0; i < cards.length; i++) {
            int randomIndex = shuffler.nextInt(cards.length);
            exchanger = cards[i];
            cards[i] = cards[randomIndex];
            cards[randomIndex] = exchanger;
        }
    }
}
