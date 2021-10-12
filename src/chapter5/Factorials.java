/*
5.13 (Factorials) Factorials are used frequently in probability problems. The factorial of a positive
integer n (written n! and pronounced “n factorial”) is equal to the product of the positive integers from
1 to n. Write an application that calculates the factorials of 1 through 20. Use type long. Display the
results in tabular format. What difficulty might prevent you from calculating the factorial of 100?
 */

package chapter5;

public class Factorials {
    public static void main(String[] args) {
        long factorial = 1;
        int number = 1;
        int counter = 0;

        while ((counter < number) && (number > 0) && (number <= 20)){

            factorial = factorial * counter;
            ++counter;
            System.out.println("The factorial of " + number + " is " + factorial);
        }

    }
}
