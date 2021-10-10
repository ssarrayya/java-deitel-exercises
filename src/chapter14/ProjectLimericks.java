package chapter14;

import org.junit.jupiter.api.Test;

import java.security.SecureRandom;

public class ProjectLimericks {
    @Test
    void obtainingRandomLimerick(){
        String[] threeRhymer = {"There was a young lady of station\n", "I love man was her sole exclamation\n", "Isle of Man is the true explanation"};
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
