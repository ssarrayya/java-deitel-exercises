package ChapterSix;

public class GreatestCommonDivisor {
    public static int gcd(int firstNumber, int secondNumber) {
        if(firstNumber >= 0 && secondNumber >= 0) {
            if (firstNumber == 0) {
                return secondNumber;
            } else if (secondNumber == 0) {
                return firstNumber;
            } else {
                return gcd(secondNumber, firstNumber % secondNumber);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(gcd(270, 192));
    }
}
