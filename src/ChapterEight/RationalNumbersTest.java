package ChapterEight;


public class RationalNumbersTest {
    public static void main(String[] args) {
        RationalNumbers rn1 = new RationalNumbers(1, 2);
        RationalNumbers rn2 = new RationalNumbers(1, 3);

        System.out.printf("%s + %s = %s%n", rn1, rn2, RationalNumbers.addition(rn1, rn2));
        System.out.printf("%s - %s = %s%n", rn1, rn2,RationalNumbers.subtraction(rn1, rn2));
        System.out.printf("%s * %s = %s%n", rn1, rn2,RationalNumbers.multiplication(rn1, rn2));
        System.out.printf("%s / %s = %s%n", rn1, rn2,RationalNumbers.division(rn1, rn2));
        System.out.println();

        System.out.printf("%s + %s = %s%n", rn1, rn2, RationalNumbers.addition(rn1, rn2).toFloatFormat(4));
    }
}
