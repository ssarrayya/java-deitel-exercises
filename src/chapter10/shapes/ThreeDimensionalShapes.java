package chapter10.shapes;

public abstract class ThreeDimensionalShapes implements Shape{
    abstract double getArea();
    abstract double getVolume();

    @Override
    public String toString() {
        return "Area of the three dimensional shape is {}" + getArea() +
                "\n and Volume is {}" + getVolume();
    }
}
