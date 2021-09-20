package ChapterEight;

public class ComplexNumbers {
    private double realPart;
    private double imaginaryPart;

    public ComplexNumbers(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumbers(){
        this(1, 1);
    }

    public static ComplexNumbers addComplexNumbers(ComplexNumbers cp1, ComplexNumbers cp2) {
        return new ComplexNumbers(cp1.realPart + cp2.realPart, cp1.imaginaryPart + cp2.imaginaryPart);
    }

    public static ComplexNumbers subtractComplexNumbers(ComplexNumbers cp1, ComplexNumbers cp2) {
        return new ComplexNumbers(cp1.realPart - cp2.realPart, cp1.imaginaryPart - cp2.imaginaryPart);
    }

    @Override
    public String toString() {
        return String.format("%.2f, %.2fi", realPart, imaginaryPart);
    }
}
