/*
6.26 (Reversing Digits) Write a method that takes an integer value and returns the number with
its digits reversed. For example, given the number 7631, the method should return 1367.
Incorporate the method into an application that reads a value from the user and displays the result
 */

package chapter6;

public class ReversingDigits {
    public static void reversedDigit(int number) {
        int firstStep = number / 10;
        int secondStep = number / 100;
        int thirdStep = number / 1000;
        int fourthStep = number / 10000;
        int fifthStep = number / 100000;

        if(number < 10) {
            System.out.printf("%d%n",
                    number);
        } else if(firstStep < 10) {
            System.out.printf("%d%n",
                    ((number % 10) * 10) + firstStep);
        } else if(secondStep < 10) {
            System.out.printf("%d%n",
                    ((number % 10) * 100) + (((number / 10) % 10) * 10) + secondStep);
        } else if(thirdStep < 10) {
            System.out.printf("%d%n", ((number % 10) * 1000) + (((number / 10) % 10) * 100) + (((number / 100) % 10) * 10) + thirdStep);
        } else if(fourthStep < 10) {
            System.out.printf("%d%n", ((number % 10) * 10000) + (((number % 100) / 10) * 1000) + (((number % 1000) / 100) * 100) + (((number / 1000) % 10) * 10) + fourthStep);
        } else if(fifthStep < 10) {
            System.out.printf("%d%n", ((number % 10) * 100000) + (((number % 100) / 10) * 10000) + (((number % 1000) / 100) * 1000) + (((number % 10000) / 1000) * 100) + (((number / 10000) % 10) * 10) + fifthStep);
        } else System.out.println("Enter a number between 1 and 100000");
    }

    public static void main(String[] args) {
        reversedDigit(2); // expect 2
        reversedDigit(34); // expect 43
        reversedDigit(456); // expect 654
        reversedDigit(5678); // expect 8765
        reversedDigit(67890); // expect 9876
        reversedDigit(789012); // expect 210987
    }
}
