package chapter10.shapes;

public class Cube extends ThreeDimensionalShapes{
    private double edge;

    public Cube(double edge) {
        this.edge = edge;
    }

    @Override
    public double getArea() {
        return 6 * Math.pow(edge, 2);
    }

    @Override
    double getVolume() {
        return Math.pow(edge, 3);
    }

    @Override
    public String toString() {
        return String.format("%s%.2f%n%s%.2f", "Surface area of cube: ", getArea(), "Volume of cube: ", getVolume());
    }
}
