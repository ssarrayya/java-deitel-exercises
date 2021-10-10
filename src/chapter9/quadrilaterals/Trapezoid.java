package chapter9.quadrilaterals;

public class Trapezoid extends Quadrilateral{
    private int height;

    public Trapezoid(Point firstPoint, Point secondPoint, Point thirdPoint, Point fourthPoint, int height) {
        super(firstPoint, secondPoint, thirdPoint, fourthPoint);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if(height < 0.0) {
            throw new IllegalArgumentException("Enter a height greater than 0!");
        }
        this.height = height;
    }

    public double getArea() {
        return (0.5 * ((getSecondPoint().getXCoordinate()) - (getFirstPoint().getXCoordinate())) + (getFourthPoint().getXCoordinate() - getThirdPoint().getXCoordinate())) * height;
    }

    @Override
    public String toString() {
        return String.format("%s%.4f", "The area of a trapezoid is", getArea());
    }
}
