package ChapterSeven.normalCards;

import ChapterSeven.normalCards.Card;
import ChapterSeven.normalCards.Player;
import org.junit.jupiter.api.Test;

import static ChapterSeven.normalCards.Suits.DIAMOND;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
    @Test
    void playerHasAnId() {
        Player player = new Player("Jaden");
        assertEquals("Jaden", player.getName());
    }

    @Test
    void playerHasCards() {
        Player player = new Player("Jaden");
        Card card = new Card(DIAMOND, 7);
        player.addCard(card);
    }
}
