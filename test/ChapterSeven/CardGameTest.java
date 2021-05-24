package ChapterSeven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static ChapterSeven.Suits.*;
import static org.junit.jupiter.api.Assertions.*;

public class CardGameTest {
    private CardGame cardGame;
    private final CardDeck cardDeck = new CardDeck(5);

    @BeforeEach
    void setUp() {
        cardGame = new CardGame(2, 5);
    }

    @Test
    void cardGameCanBeCreated() {
        assertNotNull(cardGame);
    }

    @Test
    void cardGameHasANumberOfPlayers() {
        assertEquals(2, cardGame.getNumberOfPlayers());
    }

    @Test
    void cardGameHasAFixedNumberOfCardsToDeal() {
        assertEquals(5, cardGame.getNumberOfDealtCards());
    }

    @Test
    void testThatDeckCanBeShuffled() {
        //create cards
        Card firstCard = new Card(HEART, 2);
        Card secondCard = new Card(DIAMOND, 5);
        Card thirdCard = new Card(SPADE, 13);
        Card fourthCard = new Card(CLUB, 4);
        Card fifthCard = new Card(DIAMOND, 8);

        //declare an array of cards created
        Card[] cards = {firstCard, secondCard, thirdCard, fourthCard, fifthCard};

        //push cards
        for (Card i : cards){
            cardDeck.push(i);
        }
        assertEquals(5, cardGame.getNumberOfDealtCards());

        //assert that the last card is the last card before shuffling
        assertSame(fifthCard, cardDeck.peek());

        cardGame.shuffle(cardDeck);
        //assert that the last card is the last card after shuffling
        assertNotSame(fifthCard, cardDeck.peek());
    }
}
