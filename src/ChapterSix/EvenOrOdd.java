package ChapterSix;

public class EvenOrOdd {
    public static boolean isEven(int number) {
        boolean isEven;
        isEven = number % 2 == 0;
        return isEven;
    }

    public static void main(String[] args) {
        System.out.println(isEven(4));
        System.out.println(isEven(12627));
        System.out.println(isEven(701));
    }
}
