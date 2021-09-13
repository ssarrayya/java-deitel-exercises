package ChapterSix;

public class RoundingNumbers {
    double userInput = 67.9876;

    public void roundToNearestInteger() {
        int output = (int) Math.floor(userInput + 0.5);
        System.out.println("Original number is " + userInput);
        System.out.println("rounded to the nearest integer is " + output);
    }

    public void roundToTenths() {
        int output = (int) Math.floor(userInput * 10 + 0.5) / 10;
        System.out.println("rounded to the nearest tenth is " + output);
    }

    public void roundToHundredths() {
        int output = (int) Math.floor(userInput * 100 + 0.5) /100;
        System.out.println("rounded to the nearest hundredth is " + output);
    }

    public void roundToThousandths() {
        int output = (int) Math.floor(userInput * 1000 + 0.5) /1000;
        System.out.println("rounded to the nearest thousandth is " + output);
    }
}
