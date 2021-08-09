package ChapterFive;

public class TrianglePrintingProgram {
    public static void firstTriangle() {
        for(int line = 1; line <= 10; line++) {
            for(int stars = 1; stars <= line; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void secondTriangle() {
        for(int line = 1; line <= 10; line++) {
            for(int stars = 10; stars >= line; stars--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void thirdTriangle() {
        for(int line = 1; line <= 10; line++) {
            for(int spaces = 1; spaces < line; spaces++) {
                System.out.print(" ");
            }
            for(int stars = 10; stars >= line; stars--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void fourthTriangle() {
        for(int line = 1; line <= 10; line++) {
            for(int spaces = 9; spaces >= line; spaces--) {
                System.out.print(" ");
            }
            for(int stars = 1; stars <= line; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        firstTriangle();
        secondTriangle();
        thirdTriangle();
        fourthTriangle();
    }
}
