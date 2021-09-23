/*
5.22 (Modified Triangle Printing Program) Modify Exercise 5.15 to combine your code from
the four separate triangles of asterisks such that all four patterns print side by side.
[Hint: Make clever use of nested for loops.]
 */

package ChapterFive;

public class ModifiedTrianglePrintingProgram {
    public static void main(String[] args) {
        for(int rows = 1; rows <= 10; rows++) {
            for(int stars = 1; stars < rows; stars++) {
                System.out.print('*');
            }
            for(int spaces = 14; spaces > rows; spaces--) {
                System.out.print(' ');
            }
            for(int stars = 10; stars > rows; stars--) {
                System.out.print('*');
            }
            for(int spaces = 0; spaces < rows; spaces++) {
                System.out.print("  ");
            }
            for(int stars = 10; stars > rows; stars--) {
                System.out.print('*');
            }
            for(int spaces = 14; spaces > rows; spaces--) {
                System.out.print(' ');
            }
            for(int stars = 1; stars < rows; stars++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
