package chapter9.quadrilaterals;

public class Rectangle extends Quadrilateral{
    public Rectangle(Point firstPoint, Point secondPoint, Point thirdPoint, Point fourthPoint) {
        super(firstPoint, secondPoint, thirdPoint, fourthPoint);
    }

    public double getArea(){
        return (getSecondPoint().getXCoordinate() - getFirstPoint().getXCoordinate()) * (getThirdPoint().getXCoordinate() - getSecondPoint().getXCoordinate());
    }

    @Override
    public String toString() {
        return String.format("%s%.4f", "The area of a rectangle is", getArea());
    }
}
