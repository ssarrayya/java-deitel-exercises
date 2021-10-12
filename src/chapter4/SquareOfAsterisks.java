/*
4.29 (Square of Asterisks) Write an application that prompts the user to enter the size of the side
of a square, then displays a hollow square of that size made of asterisks. Your program should work
for squares of all side lengths between 1 and 20.
 */

package chapter4;

import java.util.Scanner;

public class SquareOfAsterisks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int side = input.nextInt();
        int lines = side;

        int spaces = side - 2;

        if(side >= 1 && side <= 20) {
            for(int i = 0; i < lines; i++) {
                if(i == 0 || i == lines - 1) {
                    for (int stars = 0; stars < side; stars++) {
                        System.out.print("*");
                    }
                } else {
                    System.out.print("*");
                    for (int s = 0; s < spaces; s++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
