package ChapterSeven.whotCards;

import ChapterSeven.whotCards.exceptionss.StackOverflowException;
import ChapterSeven.whotCards.exceptionss.StackUnderflowException;

import java.security.SecureRandom;

public class WhotCardDeck {
    private final WhotCard[] cards;
    private int lastPushedLocation = -1;

    public WhotCardDeck(int numberOfCards) {
        cards = new WhotCard[numberOfCards];
    }

    public int getSize() {
        return cards.length;
    }

    public void push(WhotCard card) {
        if(isFull()) {
            throw new StackOverflowException("Card deck is full!");
        }
        lastPushedLocation++;
        cards[lastPushedLocation] = card;
    }

    public WhotCard peek() {
        if(isEmpty()) {
            throw new StackUnderflowException("Card deck is empty!");
        }
        return cards[lastPushedLocation];
    }

    public WhotCard pop() {
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
        WhotCard exchanger;

        for (int i = 0; i < cards.length; i++) {
            int randomIndex = shuffler.nextInt(cards.length);
            exchanger = cards[i];
            cards[i] = cards[randomIndex];
            cards[randomIndex] = exchanger;
        }
    }
}
