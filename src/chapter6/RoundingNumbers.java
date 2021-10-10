/*
6.9 (Rounding Numbers) Math.floor can be used to round values to the nearest integer—e.g.,
y = Math.floor(x + 0.5);
will round the number x to the nearest integer and assign the result to y. Write an application that
reads double values and uses the preceding statement to round each of the numbers to the nearest
integer. For each number processed, display both the original number and the rounded number.
6.10 (Rounding Numbers) To round numbers to specific decimal places, use a statement like
y = Math.floor(x * 10 + 0.5) / 10;
which rounds x to the tenths position (i.e., the first position to the right of the decimal point), or
y = Math.floor(x * 100 + 0.5) / 100;
which rounds x to the hundredths position (i.e., the second position to the right of the decimal
point). Write an application that defines four methods for rounding a number x in various ways:
a) roundToInteger(number)
b) roundToTenths(number)
c) roundToHundredths(number)
d) roundToThousandths(number)
For each value read, your program should display the original value, the number rounded to the
nearest integer, the number rounded to the nearest tenth, the number rounded to the
nearest hundredth and the number rounded to the nearest thousandth.
 */

package chapter6;

public class RoundingNumbers {
    double userInput = 67.9876;

    public void roundToNearestInteger() {
        int output = (int) Math.floor(userInput + 0.5);
        System.out.println("Original number is " + userInput);
        System.out.println("rounded to the nearest integer is " + output);
    }

    public void roundToTenths() {
        int output = (int) Math.floor(userInput * 10 + 0.5) / 10;
        System.out.println("rounded to the nearest tenth is " + output);
    }

    public void roundToHundredths() {
        int output = (int) Math.floor(userInput * 100 + 0.5) /100;
        System.out.println("rounded to the nearest hundredth is " + output);
    }

    public void roundToThousandths() {
        int output = (int) Math.floor(userInput * 1000 + 0.5) /1000;
        System.out.println("rounded to the nearest thousandth is " + output);
    }
}
