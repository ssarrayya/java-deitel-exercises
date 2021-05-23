package ChapterSeven;

import ChapterSeven.exceptions.StackOverflowException;
import ChapterSeven.exceptions.StackUnderflowException;

public class CardDeck {
    private int size;
    private Card[] cards;
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
        if(isEmpty()) {
            throw new StackUnderflowException("Card deck is empty!");
        }
        return cards[lastPushedLocation--];
    }

    public boolean isEmpty() {
        if(lastPushedLocation == -1){
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if(lastPushedLocation == getSize() - 1) {
            return true;
        } else {
            return false;
        }
    }
}
