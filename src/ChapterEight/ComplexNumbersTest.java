package ChapterEight;

public class ComplexNumbersTest {
    public static void main(String[] args) {
        ComplexNumbers cp1 = new ComplexNumbers(3, 0.897);
        ComplexNumbers cp2 = new ComplexNumbers(7, -0.383);

        System.out.println(ComplexNumbers.addComplexNumbers(cp1, cp2));
        System.out.println(ComplexNumbers.subtractComplexNumbers(cp1, cp2));
    }
}

