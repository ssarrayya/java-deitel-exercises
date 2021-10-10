/*
7.14 (Variable-Length Argument List) Write an application that calculates the product of a series
of integers that are passed to method product using a variable-length argument list.
Test your method with several calls, each with a different number of arguments.
 */

package chapter7;

public class VariableLengthArgumentList {
    //Write an application that calculates the product of a series of integers that are passed to method product using a variable-length argument list. Test your method with several calls, each with a different number of arguments.
    public static int product(int... numbers) {
        int product = 1;
        for(int i: numbers) {
            product *= i;
        }
        return product;
    }

    public static void main(String[] args) {
        int firstNumber = 13;
        int secondNumber = 15;
        int thirdNumber = 19;
        int fourthNumber = 10;

        System.out.println(product(firstNumber, secondNumber));
        System.out.println(product(fourthNumber, firstNumber));
        System.out.println(product(thirdNumber, firstNumber, secondNumber));
    }
}
