package ChapterFourteen;

import org.junit.jupiter.api.Test;

import java.security.SecureRandom;

public class RandomSentences {
    @Test
    void obtainingRandomSentences() {
        SecureRandom rnd = new SecureRandom();
        String[] article = {"the", "a", "one", "some", "any"};
        String[] noun = {"boy", "girl", "down", "town", "car"};
        String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] preposition = {"to", "from", "over", "under", "on"};

        for(int count = 0; count <=20; count++){
            int index = rnd.nextInt(5);
            StringBuilder sb = new StringBuilder(article[index].substring(0, 1).toUpperCase() + article[index].substring(1).toLowerCase());

            int i = rnd.nextInt(5);
            sb.append(" ").append(noun[i]);

            int j = rnd.nextInt(5);
            sb.append(" ").append(verb[j]);

            int ind = rnd.nextInt(5);
            sb.append(" ").append(preposition[ind]);

            int k = rnd.nextInt(5);
            sb.append(" ").append(article[k]);

            int x = rnd.nextInt(5);
            sb.append(" ").append(noun[x]);

            System.out.println(sb + ".");
        }

    }


}
