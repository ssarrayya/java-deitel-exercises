//2.27
package chapter2;

public class CheckerboardPatternofAsterisks {

    public static void main(String[] args) {
        int size = 8; // Adjust the size of the checkerboard as needed

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
