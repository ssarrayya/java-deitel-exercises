/*
6.15 (Hypotenuse Calculations) Define a method hypotenuse that calculates the hypotenuse of
a right triangle when the lengths of the other two sides are given. The method should take
two arguments of type double and return the hypotenuse as a double. Incorporate this method into an
application that reads values for side1 and side2 and performs the calculation with the hypotenuse
method. Use Math methods pow and sqrt to determine the length of the hypotenuse for each of the
triangles in Fig. 6.15. [Note: Class Math also provides method hypot to perform this calculation.]

Triangle Side 1     Side 2
1        3.0        4.0
2        5.0        12.0
3        8.0        15.0
Fig 6.15
 */

package chapter6;

public class Hypotenuse {
    public static double calculatingHypotenuse(double adjacent, double opposite) {
        double hypotenuse;
        hypotenuse = Math.sqrt((Math.pow(adjacent, 2) + Math.pow(opposite, 2)));
        return hypotenuse;
    }

    public static void main(String[] args) {
        System.out.println(calculatingHypotenuse(3.0, 4.0));
        System.out.println(calculatingHypotenuse(5.0, 12.0));
        System.out.println(calculatingHypotenuse(8.0, 15.0));
    }
}
