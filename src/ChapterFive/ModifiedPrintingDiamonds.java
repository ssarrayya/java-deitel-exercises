package ChapterFive;

public class ModifiedPrintingDiamonds {
    public void printDiamond(int userInput) {
        if (userInput > 0 && userInput < 20 && userInput % 2 != 0) {
            int spaces = userInput;
            int stars = 1;
            int lines = userInput;
            int div = lines / 2 + 1;

            for (int i = 1; i <= lines; i++) {
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
