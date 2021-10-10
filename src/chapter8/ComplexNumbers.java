/*
8.11 (Complex Numbers) Create a class called Complex for performing arithmetic with complex
numbers. Complex numbers have the form
    realPart + imaginaryPart * i
    where i is sqrt(-1)

Write a program to test your class. Use floating-point variables to represent the private data of the
class. Provide a constructor that enables an object of this class to be initialized when it’s declared.
Provide a no-argument constructor with default values in case no initializers are provided. Provide
public methods that perform the following operations:
a) Add two Complex numbers: The real parts are added together and the imaginary parts are added together.
b) Subtract two Complex numbers: The real part of the right operand is subtracted from the real part of the
left operand, and the imaginary part of the right operand is subtracted from the imaginary part of the left operand.
c) Print Complex numbers in the form (realPart, imaginaryPart).
 */

package chapter8;

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
