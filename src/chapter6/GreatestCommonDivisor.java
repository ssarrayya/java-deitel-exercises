/*
6.27 (Greatest Common Divisor) The greatest common divisor (GCD) of two integers is the largest
integer that evenly divides each of the two numbers. Write a method gcd that returns the greatest
common divisor of two integers. [Hint: You might want to use Euclid’s algorithm. You can find
information about it at en.wikipedia.org/wiki/Euclidean_algorithm.] Incorporate the method
into an application that reads two values from the user and displays the result.
 */

package chapter6;

public class GreatestCommonDivisor {
    public static int gcd(int firstNumber, int secondNumber) {
        if(firstNumber >= 0 && secondNumber >= 0) {
            if (firstNumber == 0) {
                return secondNumber;
            } else if (secondNumber == 0) {
                return firstNumber;
            } else {
                return gcd(secondNumber, firstNumber % secondNumber);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(gcd(270, 192));
    }
}
