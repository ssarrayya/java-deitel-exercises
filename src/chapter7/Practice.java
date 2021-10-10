package chapter7;

public class Practice {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 10;

        double[] fractions = new double[ARRAY_SIZE];

        fractions[9] = 1.667;
        fractions[6] = 3.333;
        double sum = 0;

        for (int x = 0; x < fractions.length; x++) {
            sum += fractions[x];
        }
        System.out.printf("%s%2f", "Sum of elements of array is ", sum);
    }
}

