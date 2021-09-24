/*
6.14 (Exponentiation) Write a method integerPower(base, exponent) that returns the value of
base exponent
For example, integerPower(3, 4) calculates 34 (or 3 * 3 * 3 * 3). Assume that exponent is a positive,
nonzero integer and that base is an integer. Use a for or while statement to control the calculation.
Do not use any Math class methods. Incorporate this method into an application that reads
integer values for base and exponent and performs the calculation with the integerPower method.
 */

package ChapterSix;

public class Exponentiation {
    public static void integerPower(int base, int exponent) {
        int result = base;

        for (int i = 1; i < exponent; i++) {
            result *= base;
        }

        System.out.printf("%d", result);
    }

    public static void main(String[] args) {
        integerPower(2, 3);
    }
}
