package ChapterNine.QuadrilateralInheritanceHierarchy;

public class Parallelogram extends Quadrilateral{
    private int height;

    public Parallelogram(Point firstPoint, Point secondPoint, Point thirdPoint, Point fourthPoint, int height) {
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

    public double getArea(){
        return (getFourthPoint().getXCoordinate() - getThirdPoint().getXCoordinate() * height);
    }

    @Override
    public String toString() {
        return String.format("%s%.4f", "The area of a rectangle is", getArea());
    }
}
