/*
9.8 (Quadrilateral Inheritance Hierarchy) Write an inheritance hierarchy for classes Quadrilateral,
Trapezoid, Parallelogram, Rectangle and Square. Use Quadrilateral as the superclass of the hierarchy.
Create and use a Point class to represent the points in each shape. Make the hierarchy as deep (i.e., as many
levels) as possible. Specify the instance variables and methods for each class. The private instance variables
of Quadrilateral should be the x-y coordinate pairs for the four endpoints of the Quadrilateral.
Write a program that instantiates objects of your classes and outputs each object’s area (except Quadrilateral).
 */

package ChapterNine.QuadrilateralInheritanceHierarchy;

public class Quadrilateral {
    private Point firstPoint;
    private Point secondPoint;
    private Point thirdPoint;
    private Point fourthPoint;

    public Quadrilateral() {}

    public Quadrilateral(Point firstPoint, Point secondPoint, Point thirdPoint, Point fourthPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.thirdPoint = thirdPoint;
        this.fourthPoint = fourthPoint;
    }

    public Point getFirstPoint() {
        return firstPoint;
    }

    public void setFirstPoint(Point firstPoint) {
        this.firstPoint = firstPoint;
    }

    public Point getSecondPoint() {
        return secondPoint;
    }

    public void setSecondPoint(Point secondPoint) {
        this.secondPoint = secondPoint;
    }

    public Point getThirdPoint() {
        return thirdPoint;
    }

    public void setThirdPoint(Point thirdPoint) {
        this.thirdPoint = thirdPoint;
    }

    public Point getFourthPoint() {
        return fourthPoint;
    }

    public void setFourthPoint(Point fourthPoint) {
        this.fourthPoint = fourthPoint;
    }
}
