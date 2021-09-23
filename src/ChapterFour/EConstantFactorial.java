/*
4.37 (Factorial) The factorial of a non-negative integer n is written as n!
(pronounced “n factorial”) and is defined as follows

n! = n · (n – 1) · (n – 2) · … · 1 (for values of n greater than or equal to 1)
and
n! = 1 (for n = 0)
For example, 5! = 5 · 4 · 3 · 2 · 1, which is 120.

b) Write an application that estimates the value of the mathematical constant e by using
the following formula. Allow the user to enter the number of terms to calculate.

    e = 1 + 1/1! + 1/2! + 1/3!...

c) Write an application that computes the value of e^(x)nby using the following formula. Allow the user to enter the number of terms to calculate.
    e^(x) = 1 + x/1! + x^2/2! + x^3/3!...
 */

package ChapterFour;

public class EConstantFactorial {
    public static int factorial(int n) {
        int i = 1;
        int solution = 1;
        while (i <= n) {
            solution = solution * i;
            i++;
        }
        return solution;
    }

    public static double getEConstant(int userConstraint) {
        double e = 1;
        for(int i = 1; i <= userConstraint; i++)
            e += 1.0 / factorial(i);
        return e;
    }

    public static double getEConstantToAPower(int userConstraint, int power) {
        double e = 1;
        for(int i = 1; i <= userConstraint; i++)
            e += Math.pow(power, i) / factorial(i);
        return e;
    }
}

