package chapter9.quadrilaterals;

public class Square extends Quadrilateral{
    public Square() {}

    public Square(Point firstPoint, Point secondPoint, Point thirdPoint, Point fourthPoint) {
        super(firstPoint, secondPoint, thirdPoint, fourthPoint);
    }

    public double getArea() {
        return Math.pow((getSecondPoint().getXCoordinate()) - (getFirstPoint().getXCoordinate()), 2);
    }

    @Override
    public String toString() {
        return String.format("%s%.4f", "The area of a square is", getArea());
    }
}
