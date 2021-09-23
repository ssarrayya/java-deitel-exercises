/*
    2.17 (Arithmetic, Smallest and Largest) Write an application that inputs three integers from the
user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
representation of the average. So, if the sum of the values is 7, the average should be 2, not
2.3333….]
 */

package ChapterTwo;

import java.util.Scanner;

public class ArithmeticSmallestAndLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input first number");
        int firstNumber = input.nextInt();
        System.out.println("input second number");
        int secondNumber = input.nextInt();
        System.out.println("input third number");
        int thirdNumber = input.nextInt();

        int sum;
        int average;
        int product;
        int largest;
        int smallest;

        sum = firstNumber + secondNumber + thirdNumber;

        average = sum / 3;

        product = firstNumber * secondNumber * thirdNumber;

        largest = firstNumber;
        if(secondNumber > firstNumber) largest = secondNumber;
        if(thirdNumber > largest) largest = thirdNumber;

        smallest = firstNumber;
        if(secondNumber < firstNumber) smallest = secondNumber;
        if(thirdNumber < smallest) smallest = thirdNumber;

        System.out.println("Sum of numbers is " + sum);
        System.out.println("Average of numbers is " + average);
        System.out.println("Product of numbers is " + product);
        System.out.println("largest number is " + largest);
        System.out.println("smallest number is " + smallest);
    }
}
