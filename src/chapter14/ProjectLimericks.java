package chapter14;

/*
14.6 (Project: Limericks) A limerick is a humorous five-line verse in which the first and second lines rhyme
with the fifth, and the third line rhymes with the fourth. Using techniques similar to those developed in
Exercise 14.5, write a Java application that produces random limericks. Polishing this application to produce
good limericks is a challenging problem, but the result will be worth the effort
 */

import org.junit.jupiter.api.Test;

import java.security.SecureRandom;

public class ProjectLimericks {
    @Test
    void obtainingRandomLimerick(){
        String[] threeRhymer = {"There was a young lady of station\n", "I love man was her sole exclamation\n", "Isle of Man is the true explanation\n"};
        String[] twoRhymer = {"But when men cried, \"You flatter\"\n", "She replied, \"Oh! no matter!\n"};

        SecureRandom rdm = new SecureRandom();
        int i = rdm.nextInt(3);
        StringBuilder sbr = new StringBuilder(threeRhymer[i]);

        int j = rdm.nextInt(3);
        sbr.append(threeRhymer[j]);

        int k = rdm.nextInt(2);
        sbr.append(twoRhymer[k]);

        int index = rdm.nextInt(2);
        sbr.append(twoRhymer[index]);

        int ind = rdm.nextInt(3);
        sbr.append(threeRhymer[ind]);

        System.out.println(sbr + ".");

    }
}
