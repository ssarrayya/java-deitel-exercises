package ChapterEight;

import java.math.BigDecimal;
import java.math.RoundingMode;

import ChapterSix.GreatestCommonDivisor;

public class RationalNumbers {
    private final int numerator;
    private final int denominator;

    public RationalNumbers (int numerator, int denominator) {
        int gcd = GreatestCommonDivisor.gcd(numerator, denominator);

        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    public RationalNumbers () {
        this(1, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public static RationalNumbers addition (RationalNumbers rn1, RationalNumbers rn2) {
        return new RationalNumbers((rn2.denominator * rn1.numerator) + (rn1.denominator * rn2.numerator), rn1.denominator * rn2.denominator);
    }

    public static RationalNumbers subtraction (RationalNumbers rn1, RationalNumbers rn2) {
        return new RationalNumbers((rn2.denominator * rn1.numerator) - (rn1.denominator * rn2.numerator), rn1.denominator * rn2.denominator);
    }

    public static RationalNumbers multiplication (RationalNumbers rn1, RationalNumbers rn2) {
        return new RationalNumbers(rn1.numerator * rn2.numerator, rn1.denominator * rn2.denominator);
    }

    public static RationalNumbers division (RationalNumbers rn1, RationalNumbers rn2) {
        return new RationalNumbers(rn1.numerator * rn2.denominator, rn1.denominator * rn2.numerator);
    }

    @Override
    public String toString() {
        return String.format("%d / %d", numerator, denominator);
    }

    public String toFloatFormat(int scale, RationalNumbers rn) {
        float a = (float) rn.getNumerator() / rn.getDenominator();
        String floatAnswer = String.valueOf(a);
        BigDecimal bd = new BigDecimal(floatAnswer);
        return String.valueOf(bd.setScale(scale, RoundingMode.HALF_DOWN));
    }
}
