package ChapterSeven.normalCards;

public class CardGame {
    private final int numberOfPlayers;
    private final int numberOfDealtCards;

    public CardGame(int numberOfPlayers, int cardToDeal) {
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
