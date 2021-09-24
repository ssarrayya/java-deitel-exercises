/*
7.17 (Dice Rolling) Write an application to simulate the rolling of two dice. The application
should use an object of class Random once to roll the first die and again to roll the second die. The
sum of the two values should then be calculated. Each die can show an integer value from 1 to 6, so
the sum of the values will vary from 2 to 12, with 7 being the most frequent sum, and 2 and 12 the
least frequent. Figure 7.28 shows the 36 possible combinations of the two dice. Your application
should roll the dice 36,000,000 times. Use a one-dimensional array to tally the number of times
each possible sum appears. Display the results in tabular format.

        1  2  3  4  5  6
     1  2  3  4  5  6  7
     2  3  4  5  6  7  8
     3  4  5  6  7  8  9
     4  5  6  7  8  9  10
     5  6  7  8  9  10 11
     6  7  8  9  10 11 12

     Fig 7.28

 */


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
