package ChapterSeven.whotCards;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WhotPlayerTest {
    @Test
    void playerHasAnId() {
        WhotPlayer player = new WhotPlayer("Jaden");
        assertEquals("Jaden", player.getName());
    }

    @Test
    void playerHasCards() {
        WhotPlayer player = new WhotPlayer("Jaden");
        WhotCard card = WhotCard.createCrossCardsWithValues(2);
        player.addCard(card);
    }
}
