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
