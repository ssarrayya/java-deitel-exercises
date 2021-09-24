/*
8.16 (Huge Integer Class) Create a class HugeInteger which uses a 40-element array of digits to store
integers as large as 40 digits each. Provide methods parse, toString, add and subtract. Method parse
should receive a String, extract each digit using method charAt and place the integer equivalent of
each digit into the integer array. For comparing HugeInteger objects, provide the following methods:
isEqualTo, isNotEqualTo, isGreaterThan, isLessThan, isGreaterThanOrEqualTo and isLessThanOrEqualTo.
Each of these is a predicate method that returns true if the relationship holds between the two
HugeInteger objects and returns false if the relationship does not hold. Provide a predicate method
isZero. If you feel ambitious, also provide methods multiply, divide and remainder. [Note: Primitive boolean
values can be output as the word “true” or the word “false” with format specifier %b.]
 */

package ChapterEight;

public class HugeInteger {
    private static int[] hugeInt = new int[40];

    public static void parse(String a) {
        for (int i = 0; i < a.length(); i++) {
            hugeInt[i] = a.charAt(i);
        }
    }

    @Override
    public String toString() {
        return String.format("%s", "Sarah is a fine girl");
    }
}
