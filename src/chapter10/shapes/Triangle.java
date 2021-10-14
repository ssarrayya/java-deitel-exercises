package chapter10.shapes;

public class Triangle extends TwoDimensionalShapes{
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public String toString() {
        return String.format("%s%.2f", "The area of the triangle is ", getArea());
    }
}
