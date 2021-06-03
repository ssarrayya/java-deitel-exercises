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
