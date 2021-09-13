package ChapterFour;

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
