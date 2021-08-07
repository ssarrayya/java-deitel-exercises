package ChapterFour;

import java.util.Scanner;

public class CheckerboardPatternOfAsterisks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int lines = size;

        for(int i = 0; i < lines; i++) {
            if(i % 2 == 0) {
                for(int shape = 0; shape < size; shape++) {
                    System.out.print("* ");
                    System.out.print(" ");
                }
            } else if (i % 2 != 0) {
                for(int shape = 0; shape < size; shape++) {
                        System.out.print(" ");
                        System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
