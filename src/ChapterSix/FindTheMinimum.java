package ChapterSix;

public class FindTheMinimum {
    public static float minimum3(float firstNumber, float secondNumber, float thirdNumber) {
        float firstOption = Math.min(firstNumber, secondNumber);
        float secondOption = Math.min(firstNumber, thirdNumber);
        float thirdOption = Math.min(secondNumber, thirdNumber);

        if(firstOption > thirdOption) {
            return thirdOption;
        } else if(firstOption > secondOption) {
            return secondOption;
        } else if(secondOption > thirdOption) {
            return thirdOption;
        } else return firstOption;
    }

    public static void main(String[] args) {
        System.out.printf("%s%.1f", "The smallest number is ", minimum3(0.7f, 0.3f, 0.5f));
    }
}
