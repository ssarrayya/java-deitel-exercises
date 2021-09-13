package Extraa;

public class GeometricProgression {
    int nextTerm;
    public int GP(int firstNumber, int secondNumber, int thirdNumber) {
        int commonRatio = secondNumber / firstNumber;

        if(secondNumber / firstNumber == thirdNumber / secondNumber) {
            nextTerm = (int) (firstNumber * Math.pow(commonRatio, 4 - 1));
        }
        System.out.println(nextTerm);
        return nextTerm;
    }
}
