/*
    4.16 What does the following program print?
 */

package ChapterFour;

public class Mystery {
    public static void main(String[] args) {
        int x = 1;
        int total = 0;
        while (x <= 10) {
            int y = x * x;
            System.out.println(y);
            total += y;
            ++x;
        }

        System.out.printf("Total is %d%n", total);
    }
}
