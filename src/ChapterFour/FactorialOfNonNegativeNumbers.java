/*
4.37 (Factorial) The factorial of a non-negative integer n is written as n!
(pronounced “n factorial”) and is defined as follows

n! = n · (n – 1) · (n – 2) · … · 1 (for values of n greater than or equal to 1)
and
n! = 1 (for n = 0)
For example, 5! = 5 · 4 · 3 · 2 · 1, which is 120.

a) Write an application that reads a non-negative integer and computes and prints its factorial.
 */

package ChapterFour;

import java.util.Scanner;

public class FactorialOfNonNegativeNumbers {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a non-negative number: ");
        int n = userInput.nextInt();
        int factorial = 1;

        if(n > 0){
            for(int i = 1; i <= n; i++){
                factorial *= i;
            }
            System.out.println("The factorial of " + n + " is " + factorial);
        }
    }
}
