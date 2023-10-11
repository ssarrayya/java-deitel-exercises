//2.18
package chapter2;

public class DisplayingShapeswithAsterisks {

    public static void main(String[] args) {
        displayBox();
        System.out.println();
        displayOval();
        System.out.println();
        displayArrow();
        System.out.println();
        displayDiamond();
    }

    // Display a box made of asterisks
    public static void displayBox() {
        System.out.println("**********");
        for (int i = 0; i < 3; i++) {
            System.out.println("*        *");
        }
        System.out.println("**********");
    }

    // Display an oval made of asterisks
    public static void displayOval() {
        System.out.println("   *****   ");
        System.out.println(" *       * ");
        System.out.println("*         *");
        System.out.println(" *       * ");
        System.out.println("   *****   ");
    }

    // Display an arrow made of asterisks
    public static void displayArrow() {
        System.out.println("    *");
        System.out.println("   ***");
        System.out.println("  *****");
        System.out.println("    *");
        System.out.println("    *");
    }

    // Display a diamond made of asterisks
    public static void displayDiamond() {
        int size = 5; // Adjust the size as needed
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = size - 1; i >= 1; i--) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
