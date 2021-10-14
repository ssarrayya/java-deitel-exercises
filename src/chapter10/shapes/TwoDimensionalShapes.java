package chapter10.shapes;

public abstract class TwoDimensionalShapes implements Shape{
    abstract double getArea();

    @Override
    public String toString() {
        return "Area of the two dimensional shape is {}" + getArea();
    }
}
