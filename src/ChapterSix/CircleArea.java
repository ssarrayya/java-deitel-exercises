/*
6.20 (Circle Area) Write an application that prompts the user for the radius of a circle and uses
a method called circleArea to calculate the area of the circle.
 */

package ChapterSix;

public class CircleArea {
    public static double circleArea(int radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        System.out.println(circleArea(5));
    }
}
