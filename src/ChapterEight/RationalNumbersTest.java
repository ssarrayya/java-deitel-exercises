package ChapterEight;


public class RationalNumbersTest {
    public static void main(String[] args) {
        RationalNumbers rn1 = new RationalNumbers(1, 2);
        RationalNumbers rn2 = new RationalNumbers(1, 3);

        System.out.println(RationalNumbers.addition(rn1, rn2));
        System.out.println(RationalNumbers.subtraction(rn1, rn2));
        System.out.println(RationalNumbers.multiplication(rn1, rn2));
        System.out.println(RationalNumbers.division(rn1, rn2));

    }
}
