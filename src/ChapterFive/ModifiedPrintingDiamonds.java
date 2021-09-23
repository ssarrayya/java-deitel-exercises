/*5.25 (Modified Diamond Printing Program) Modify the application you wrote in Exercise 5.24
        to read an odd number in the range 1 to 19 to specify the number of rows in the diamond. Your
        program should then display a diamond of the appropriate size.
*/

package ChapterFive;

public class ModifiedPrintingDiamonds {
    public void printDiamond(int userInput) {
        if (userInput > 0 && userInput < 20 && userInput % 2 != 0) {
            int spaces = userInput;
            int stars = 1;
             int div = userInput / 2 + 1;

            for (int i = 1; i <= userInput; i++) {
                for (int s = spaces; s > 0; s--) {
                    System.out.print(" ");
                }
                for (int a = stars; a > 0; a--) {
                    System.out.print("* ");
                }
                System.out.println();
                if (i < div) {
                    spaces -= 2;
                    stars += 2;
                } else if (i >= div) {
                    spaces += 2;
                    stars -= 2;
                }
            }
        } else {
            System.out.println("Enter an odd number less than 20");
        }

    }
}
