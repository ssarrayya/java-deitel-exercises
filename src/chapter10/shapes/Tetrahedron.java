package chapter10.shapes;

public class Tetrahedron extends ThreeDimensionalShapes{
    private double edge;

    public Tetrahedron(double edge) {
        this.edge = edge;
    }

    @Override
    double getArea() {
        return Math.sqrt(3) * Math.pow(edge, 2);
    }

    @Override
    double getVolume() {
        return Math.pow(edge, 3) / (6 * Math.sqrt(2));
    }

    @Override
    public String toString() {
        return String.format("%s%.2f%n%s%.2f", "Surface area of tetrahedron: ", getArea(), "Volume of tehrahedron: ", getVolume());
    }
}
