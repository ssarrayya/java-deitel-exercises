package chapter7.whotcards;

import chapter7.whotcards.exceptionss.StackOverflowException;
import chapter7.whotcards.exceptionss.StackUnderflowException;

import java.security.SecureRandom;

public class WhotCardDeck {
    private static WhotCard[] cards;
    private static int lastPushedLocation = -1;

    public WhotCardDeck(int numberOfCards) {
        cards = new WhotCard[numberOfCards];
    }

    public static int getSize() {
        return cards.length;
    }

    public static void push(WhotCard card) {
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

    public static boolean isFull() {
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

    public static WhotCardDeck cardDeckCanBeFilled() {
        WhotCardDeck cardDeck = new WhotCardDeck(54);
        for(WhotSuits whotSuits: WhotSuits.values()) {
            switch (whotSuits) {
                case STAR -> {
                    for(int counter = 1; counter <= 8; counter++) {
                        if(counter == 6) continue;
                        push(WhotCard.createStarCardsWithValues(counter));
                    }
                }
                case CIRCLE -> {
                    for(int counter = 1; counter <= 14; counter++) {
                        if(counter == 6 || counter == 9) continue;
                        push(WhotCard.createCircleCardsWithValues(counter));
                    }
                }
                case TRIANGLE -> {
                    for(int counter = 1; counter <= 14; counter++) {
                        if(counter == 6 || counter == 9) continue;
                        push(WhotCard.createTriangleCardsWithValues(counter));
                    }
                }
                case CROSS -> {
                    for(int counter = 1; counter <= 14; counter++) {
                        if(counter == 4 || counter == 6 || counter == 8 || counter == 9 || counter == 12) continue;
                        push(WhotCard.createCrossCardsWithValues(counter));
                    }
                }
                case SQUARE -> {
                    for(int counter = 1; counter <= 14; counter++) {
                        if(counter == 4 || counter == 6 || counter == 8 || counter == 9 || counter == 12) continue;
                        push(WhotCard.createSquareCardsWithValues(counter));
                    }
                }
                case WHOT -> {
                    for(int counter = 1; counter <= 5; counter++) {
                        push(WhotCard.createWhotCards(counter));
                    }
                }
            }
        }
        return cardDeck;
    }
}
