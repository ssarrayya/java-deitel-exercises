package chapter7.whotcards;

import java.util.ArrayList;
import java.util.List;

public class WhotPlayer {
    private String name;
    private List<WhotCard> cards = new ArrayList<>();

    public WhotPlayer(String playerName) {
        name = playerName;
    }

    public String getName() {
        return name;
    }

    public void addCard(WhotCard card) {
        cards.add(card);
    }

    public int getNumberOfCards() {
        return cards.size();
    }
}
