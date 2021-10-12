package chapter4;

public class EConstantFactorialTest {
    public static void main(String[] args) {
        System.out.printf("%s%f%n", "The value of e is ", EConstantFactorial.getEConstant(3));
        System.out.printf("%s%f", "The value of e^(2) is ", EConstantFactorial.getEConstantToAPower(3, 2));
    }
}
