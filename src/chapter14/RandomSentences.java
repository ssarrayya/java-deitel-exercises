package chapter14;

/*
14.5 (Random Sentences) Write an application that uses random-number generation to create sentences. Use
four arrays of strings called article, noun, verb and preposition. Create a sentence by selecting a word at
random from each array in the following order: article, noun, verb, preposition, article and noun. As each
word is picked, concatenate it to the previous words in the sentence. The words should be separated by
spaces. When the final sentence is output, it should start with a capital letter and end with a period. The
application should generate and display 20 sentences. The article array should contain the articles "the",
"a", "one", "some" and "any"; the noun array should contain the nouns "boy", "girl", "dog", "town" and "car";
the verb array should contain the verbs "drove", "jumped", "ran", "walked" and "skipped"; the preposition
array should contain the prepositions "to", "from", "over", "under" and "on"
 */

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
