/*
7.12 (Duplicate Elimination) Use a one-dimensional array to solve the following problem:
Write an application that inputs five numbers, each between 10 and 100, inclusive. As each number
is read, display it only if it’s not a duplicate of a number already read. Provide for the “worst case,”
in which all five numbers are different. Use the smallest possible array to solve this problem. Display
the complete set of unique values input after the user enters each new value.
 */

package chapter7;

import java.util.Scanner;

public class DuplicateElimination {
    public static void displayArray(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[5];
        int firstInteger;
        int secondInteger;
        int thirdInteger;
        int fourthInteger;
        int fifthInteger;


        Scanner input = new Scanner(System.in);

        System.out.println("enter a number between 10 and 100 inclusive");
        firstInteger = input.nextInt();
        if(firstInteger >= 10 && firstInteger <= 100){
            array[0] = firstInteger;
        }
        DuplicateElimination.displayArray(array);

        System.out.println("enter a number between 10 and 100 inclusive");
        secondInteger = input.nextInt();

        if(secondInteger >= 10 && secondInteger <= 100 && secondInteger != firstInteger){
            array[1] = secondInteger;
            DuplicateElimination.displayArray(array);
        }

        thirdInteger = input.nextInt();
        if(thirdInteger >= 10 && thirdInteger <= 100 && thirdInteger != firstInteger && thirdInteger != secondInteger ){
            array[2] = thirdInteger;
            DuplicateElimination.displayArray(array);
        }

        fourthInteger = input.nextInt();
        if(fourthInteger >= 10 && fourthInteger <= 100 && fourthInteger != firstInteger && fourthInteger != secondInteger && fourthInteger != thirdInteger){
            array[3] = fourthInteger;
            DuplicateElimination.displayArray(array);
        }

        fifthInteger = input.nextInt();
        if(fifthInteger >= 10 && fifthInteger <= 100 && fifthInteger != firstInteger && fifthInteger != secondInteger && fifthInteger != thirdInteger && fifthInteger != fourthInteger){
            array[4] = fifthInteger;
        }
        DuplicateElimination.displayArray(array);
    }
}
