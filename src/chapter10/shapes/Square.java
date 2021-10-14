package chapter10.shapes;

public class Square extends TwoDimensionalShapes {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return String.format("%s%.2f", "The area of the square is ", getArea());
    }
}
