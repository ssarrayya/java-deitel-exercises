package ChapterSeven;

import java.util.Random;

public class DiceRolling {
    static int[] dieSummationCounter = new int[13];
    public static int diceRolling() {
        Random rnd = new Random();

        int firstRoll = 1 + rnd.nextInt(6);
        int secondRoll = 1 + rnd.nextInt(6);

        //System.out.printf("%s%d%s%d%s%d%n", "Die Summation is ", firstRoll, " + ", secondRoll, " equal to ", sum);
        return firstRoll + secondRoll;
    }

    public static void multipleRoller() {
        for(int i = 0; i < 36000000; i++){
            dieSummationCounter[diceRolling()]++;
        }
    }

    public static void main(String[] args) {
        multipleRoller();
        System.out.println("Sum of rolls      Occurrence");

        for(int counter = 2; counter < dieSummationCounter.length; counter++){
            System.out.printf("%02d                  %d%n", counter, dieSummationCounter[counter]);
        }
    }
}
