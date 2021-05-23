package ChapterSeven;

public class CardGame {
    private int numberOfPlayers;
    private int numberOfDealtCards;

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
