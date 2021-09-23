package ChapterEight;

public class RationalNumbers {
    private int numerator;
    private int denominator;

    public RationalNumbers (int numerator, int denominator) {
        if(denominator % numerator == 0) {
            this.numerator = 1;
            this.denominator = denominator / numerator;
        } else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    public RationalNumbers () {
        this(1, 1);
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
}
