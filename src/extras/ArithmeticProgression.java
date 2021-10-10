package extras;

public class ArithmeticProgression {
    int nextTerm;

    public int AP(int firstNumber, int secondNumber, int thirdNumber) {
        int difference = secondNumber - firstNumber;
        if(secondNumber - firstNumber == thirdNumber - secondNumber) {
            nextTerm = firstNumber + (4 - 1) * difference;
            System.out.println(nextTerm);
        }
        return nextTerm;
    }
}
