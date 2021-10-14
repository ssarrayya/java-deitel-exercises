package chapter10.shapes;

public class Circle extends TwoDimensionalShapes{
    private double diameter;

    public Circle(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public double getArea() {
        return (Math.PI * diameter * diameter) / 4;
    }

    @Override
    public String toString() {
        return String.format("%s%.2f", "The area of the circle is ", getArea());
    }
}
