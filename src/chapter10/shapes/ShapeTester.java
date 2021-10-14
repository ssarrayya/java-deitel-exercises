package chapter10.shapes;

public class ShapeTester {
    public static void main(String[] args) {
        Circle circle = new Circle(4.0);
        Triangle triangle = new Triangle(3, 6.4);
        Square square = new Square(3.7);
        Sphere sphere = new Sphere(5.9);
        Tetrahedron tetrahedron = new Tetrahedron(8.2);
        Cube cube = new Cube(9.1);

        Shape[] shape = new Shape[6];
        shape[0] = circle;
        shape[1] = triangle;
        shape[2] = square;
        shape[3] = sphere;
        shape[4] = tetrahedron;
        shape[5] = cube;

        for (Shape shapes: shape) {
            System.out.println(shapes);
            System.out.println();
        }
    }
}
