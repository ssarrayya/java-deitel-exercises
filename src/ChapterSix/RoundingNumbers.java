package ChapterSix;

public class RoundingNumbers {
    public void roundToNearestInteger(double userInput) {
        int output = (int) Math.floor(userInput + 0.5);
        System.out.println(output);
    }

    public void roundToTenths(double userInput) {
        int output = (int) Math.floor(userInput * 10 + 0.5) / 10;
        System.out.println(output);
    }

    public void roundToHundredths(double userInput) {
        int output = (int) Math.floor(userInput * 100 + 0.5) /100;
        System.out.println(output);
    }

    public void roundToThousandths(double userInput) {
        int output = (int) Math.floor(userInput * 1000 + 0.5) /1000;
        System.out.println(output);
    }
}
