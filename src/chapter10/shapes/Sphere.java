package chapter10.shapes;

public class Sphere extends ThreeDimensionalShapes{
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    double getVolume() {
        return 4 * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return String.format("%s%.2f%n%s%.2f", "Surface area of sphere: ", getArea(), "Volume of sphere: ", getVolume());
    }
}
