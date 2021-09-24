/*
6.18 (Displaying a Square of Asterisks) Write a method squareOfAsterisks that displays a solid
square (the same number of rows and columns) of asterisks whose side is specified in integer
parameter side. For example, if side is 4, the method should display
****
****
****
****
Incorporate this method into an application that reads an integer value for side from the user and
outputs the asterisks with the squareOfAsterisks method.
 */

package ChapterSix;

public class SquareOfAsterisks {
    public static void printSquare(int length){

        for(int i = 1; i <= length; i++){
            for(int s = length; s > 0; s--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printSquare(4);
    }
}
