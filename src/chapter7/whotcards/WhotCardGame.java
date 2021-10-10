package chapter7.whotcards;

public class WhotCardGame {

    private final int numberOfPlayers;
    private final int numberOfDealtCards;

    public WhotCardGame(int numberOfPlayers, int cardToDeal) {
        this.numberOfPlayers = numberOfPlayers;
        numberOfDealtCards = cardToDeal;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public int getNumberOfDealtCards() {
        return numberOfDealtCards;
    }
}
