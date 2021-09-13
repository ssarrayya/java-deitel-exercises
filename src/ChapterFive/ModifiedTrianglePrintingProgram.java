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
