/*
5.15 (Triangle Printing Program) Write an application that displays the following patterns separately,
one below the other. Use for loops to generate the patterns.
All asterisks (*) should be printed by a single statement of the form System.out.print('*');
which causes the asterisks to print side by side. A statement of the form System.out.println();
can be used to move to the next line. A statement of the form System.out.print(' '); can be used to
display a space for the last two patterns. There should be no other output statements in the program.
[Hint: The last two patterns require that each line begin with an appropriate number of blank spaces.]

(a)     (b)      (c)        (d)
*   **********  **********  *
**   *********  *********  **
***   ********  ********  ***
****   *******  *******  ****
*****   ******  ******  *****
******   *****  *****  ******
*******   ****  ****  *******
********   ***  ***  ********
*********   **  **  *********
**********   *  *  **********

 */

package ChapterFive;

public class TrianglePrintingProgram {
    public static void firstTriangle() {
        for(int line = 1; line <= 10; line++) {
            for(int stars = 1; stars <= line; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void secondTriangle() {
        for(int line = 1; line <= 10; line++) {
            for(int stars = 10; stars >= line; stars--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void thirdTriangle() {
        for(int line = 1; line <= 10; line++) {
            for(int spaces = 1; spaces < line; spaces++) {
                System.out.print(" ");
            }
            for(int stars = 10; stars >= line; stars--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void fourthTriangle() {
        for(int line = 1; line <= 10; line++) {
            for(int spaces = 9; spaces >= line; spaces--) {
                System.out.print(" ");
            }
            for(int stars = 1; stars <= line; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        firstTriangle();
        secondTriangle();
        thirdTriangle();
        fourthTriangle();
    }
}
