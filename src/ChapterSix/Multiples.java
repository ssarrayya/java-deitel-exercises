package ChapterSix;

public class Multiples {
    public static boolean isMultiple(int firstNumber, int secondNumber) {
        return secondNumber % firstNumber == 0;
    }

    public static void main(String[] args) {
        System.out.println(isMultiple(2, 4));
        System.out.println(isMultiple(10, 400));
        System.out.println(isMultiple(7, 3));
    }
}
