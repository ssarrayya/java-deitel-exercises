package classtests;

import java.security.SecureRandom;

public class Kataa {
    public static void shuffle(int[] originalArray) {
        SecureRandom shuffler = new SecureRandom();
        int exchanger = 0;

        for (int i = 0; i < originalArray.length; i++) {
            int index = shuffler.nextInt(originalArray.length);
            exchanger = originalArray[i];
            originalArray[i] = originalArray[index];
            originalArray[index] = exchanger;
        }
    }

    public static void sortInAscendingOrder(int[] originalArray) {
        for (int i = 0; i < originalArray.length; i++) {
            for (int j = i + 1; j < originalArray.length; j++) {
                int smallerNumber = 0;
                if(originalArray[j] < originalArray[i]){
                    smallerNumber = originalArray[i];
                    originalArray[i] = originalArray[j];
                    originalArray[j] = smallerNumber;
                }
            }
        }
    }

    public static void sortInDescendingOrder(int[] originalArray) {
        for (int i = 0; i < originalArray.length; i++) {
            for (int j = i + 1; j < originalArray.length; j++) {
                int largerNumber = 0;
                if(originalArray[j] > originalArray[i]){
                    largerNumber = originalArray[i];
                    originalArray[i] = originalArray[j];
                    originalArray[j] = largerNumber ;
                }
            }
        }
    }
}
