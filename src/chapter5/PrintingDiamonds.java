/*
5.24 (Diamond Printing Program) Write an application that prints the following diamond
shape. You may use output statements that print a single asterisk (*), a single space
or a single newline character. Maximize your use of repetition (with nested for statements),
and minimize the number of output statements.
 */

package chapter5;

public class PrintingDiamonds {
    public void printDiamond() {
        int spaces = 9;
        int stars = 1;

        for(int i = 0; i < 5; i++){
            for(int s = spaces; s > 0; s--){
                System.out.print(" ");
            }
            for(int a = stars; a > 0; a--){
                System.out.print("* ");
            }
            System.out.println();
            spaces -= 2;
            stars += 2;
        }
    }

    public void otherHalf() {
            int space = 3;
            int star = 7;

            for(int i = 0; i < 4; i++){
                for(int s = space; s > 0; s--){
                    System.out.print(" ");
                }
                for (int a = star; a > 0; a--){
                    System.out.print("* ");
                }
                System.out.println();
                space += 2;
                star -= 2;
            }
    }
}
