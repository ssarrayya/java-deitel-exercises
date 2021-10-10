/*
6.19 (Displaying a Square of Any Character) Modify the method created in Exercise 6.18 to
receive a second parameter of type char called fillCharacter. Form the square using the
char provided as an argument. Thus, if side is 5 and fillCharacter is #, the method should display
#####
#####
#####
#####
#####
Use the following statement (in which input is a Scanner object) to read a character from the user
at the keyboard:
char fill = input.next().charAt(0);
 */

package chapter6;

import java.util.Scanner;

public class SquareOfAnyCharacter {
    public static void printSquare(int length, char fillCharacter){
        for(int i = 1; i <= length; i++){
            for(int s = length; s > 0; s--){
                System.out.print(fillCharacter);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char fillCharacter = input.next().charAt(0);
        printSquare(4, fillCharacter);
    }
}
