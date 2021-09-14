package ChapterSix;

public class PerfectNumbers {
    public static boolean isPerfect(int number) {
        int sumOfFactors = 0;
        boolean isPerfect = false;
        for (int i = 1; i < number; i++) {
            if(number % i == 0) {
                sumOfFactors += i;
            }
        }
        if(sumOfFactors == number) {
            isPerfect = true;
        }
        return isPerfect;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if(isPerfect(i)) {
                System.out.printf("%d%s%b%n", i, " is a perfect number is ", isPerfect(i));
                System.out.printf("%s%d%s%n", "Factors of ", i, " are:");

                for (int j = 1; j < i; j++) {
                    if (i % j == 0) {
                        System.out.printf("%d%n", j);
                    }
                }
                System.out.println();
            }
        }
    }
}
