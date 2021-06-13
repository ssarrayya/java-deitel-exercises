package ChapterSeven;

import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void checkForPrimeNumbers(boolean[] values) {
        Arrays.fill(values, true);
        for (int j = 2; j < values.length; j++) {
            if (values[j]) {
                for (int k = j * 2; k < values.length; k += j)
                    values[k] = false;
            }
        }
    }

    public static void main(String[] args) {
        int numbers = 100;
        boolean[] primeNumbers = new boolean[numbers];
        checkForPrimeNumbers(primeNumbers);
        for (int i = 0; i < primeNumbers.length; i++) {
            if(primeNumbers[i])
                System.out.println("Prime numbers are: " + i);
        }
    }
}
