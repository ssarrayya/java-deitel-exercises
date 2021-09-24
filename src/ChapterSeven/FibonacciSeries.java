/*
7.29 (Fibonacci Series) The Fibonacci series
0, 1, 1, 2, 3, 5, 8, 13, 21, …
begins with the terms 0 and 1 and has the property that each succeeding term is the sum of the two
preceding terms.
a) Write a method fibonacci(n) that calculates the nth Fibonacci number. Incorporate
this method into an application that enables the user to enter the value of n.
b) Determine the largest Fibonacci number that can be displayed on your system.
c) Modify the application you wrote in part (a) to use double instead of int to calculate
and return Fibonacci numbers, and use this modified application to repeat part (b).
 */

package ChapterSeven;

public class FibonacciSeries {
    public static void fibonacci(int term) {
        //int[] fibonacciArray = new int[term];
        double[] fibonacciArray = new double[term];

        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;
         for(int i = 2; i < fibonacciArray.length; i++) {
             fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
         }
        System.out.println(fibonacciArray[term - 1]);
    }

    public static void main(String[] args) {
        //fibonacci(89243);//365744471 is the highest positive fibonacci number that can be displayed on system if array is made up of integers, displays negative numbers after 89243rd term
        fibonacci(1477);//1.3069892237633987E308 is highest fibonacci number that can be displayed on system if array of type double is used, displays infinity after 1477th term
    }
}
