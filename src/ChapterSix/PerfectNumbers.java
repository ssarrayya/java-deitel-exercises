/*
6.24 (Perfect Numbers) An integer number is said to be a perfect number if its factors, including
1 (but not the number itself), sum to the number. For example, 6 is a perfect number, because 6 =
1 + 2 + 3. Write a method isPerfect that determines whether parameter number is a perfect number.
Use this method in an application that displays all the perfect numbers between 1 and 1000. Display
the factors of each perfect number to confirm that the number is indeed perfect. Challenge the computing power of
your computer by testing numbers much larger than 1000. Display the results.
 */

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
