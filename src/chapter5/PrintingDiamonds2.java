/*
5.24 (Diamond Printing Program) Write an application that prints the following diamond
shape. You may use output statements that print a single asterisk (*), a single space
or a single newline character. Maximize your use of repetition (with nested for statements),
and minimize the number of output statements.
 */

package chapter5;

public class PrintingDiamonds2 {
    public void printDiamond() {
        int spaces = 9;
        int stars = 1;
        int lines = 9;
        int div = lines / 2 + 1;

        for(int i = 1; i <= lines; i++){
            for(int s = spaces; s > 0; s--){
                System.out.print(" ");
            }
            for(int a = stars; a > 0; a--){
                System.out.print("* ");
            }
            System.out.println();
            if(i < div){
                spaces -= 2;
                stars += 2;
            }
            else if(i >= div){
                spaces += 2;
                stars -= 2;
            }
        }

    }
}
