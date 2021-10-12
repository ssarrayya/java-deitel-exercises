/*
5.16 (Bar Chart Printing Program) One interesting application of computers is to display
graphs and bar charts. Write an application that reads five numbers between 1 and 30. For each
number that’s read, your program should display the same number of adjacent asterisks.
For example, if your program reads the number 7, it should display *******.
Display the bars of asterisks after you read all five numbers.
 */

package chapter5;

import java.util.Scanner;

public class BarChartPrintingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();
        int fourthNumber = input.nextInt();
        int fifthNumber = input.nextInt();

        if(firstNumber >= 1 && firstNumber <= 30) {
            for(int i = 0; i < firstNumber; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        if(secondNumber >= 1 && secondNumber <= 30) {
            for(int i = 0; i < secondNumber; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        if(thirdNumber >= 1 && thirdNumber <= 30) {
            for(int i = 0; i < thirdNumber; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        if(fourthNumber >= 1 && fourthNumber <= 30) {
            for(int i = 0; i < fourthNumber; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        if(fifthNumber >= 1 && fifthNumber <= 30) {
            for(int i = 0; i < fifthNumber; i++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
