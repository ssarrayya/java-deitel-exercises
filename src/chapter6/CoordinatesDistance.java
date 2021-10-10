/*
6.32 (Distance Between Points) Write method distance to calculate the distance between two
points (x1, y1) and (x2, y2). All numbers and return values should be of type double. Incorporate
this method into an application that enables the user to enter the coordinates of the points.
 */

package chapter6;

public class CoordinatesDistance {
    public static void distance(double x1, double y1, double x2, double y2) {
        double horizontalDistance = x2 - x1;
        if(horizontalDistance < 0) { horizontalDistance *= -1; }

        double verticalDistance = y2 - y1;
        if(verticalDistance < 0) { verticalDistance *= -1; }

        double distance = Math.sqrt(Math.pow(horizontalDistance, 2) + Math.pow(verticalDistance, 2));
        System.out.print("The distance between the two points is " + distance);
    }

}
