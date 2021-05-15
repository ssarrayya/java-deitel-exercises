package ChapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class CrapGameModification {
    private static final SecureRandom randomNumbers = new SecureRandom();
    private enum Status {CONTINUE, WON, LOST}
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        int myPoint = 0;
        Status gameStatus;
        int sumOfDice = rollDice();
        int bankBalance = 1000;
        int wager = wagerPlacement(bankBalance);


        switch (sumOfDice) {
            case SEVEN, YO_LEVEN -> gameStatus = Status.WON;
            case SNAKE_EYES, TREY, BOX_CARS -> gameStatus = Status.LOST;
            default -> {
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("Point is %d%n", myPoint);
            }
        }

        while (gameStatus == Status.CONTINUE) {
            sumOfDice = rollDice(); // roll dice again
            // determine game status
            if (sumOfDice == myPoint) {
                gameStatus = Status.WON;
            } else if (sumOfDice == SEVEN) {
                gameStatus = Status.LOST;
            }
        }

        if (gameStatus == Status.WON) {
            System.out.println("Player wins");
            bankBalance += wager;
        } else {
            System.out.println("Player loses");
            bankBalance -= wager;
        }
        System.out.printf("%d%n", bankBalance);
        CrapGameModification.chatter();

        if (bankBalance == 0) {
            System.out.println("Sorry. You busted!");
        }
    }

    public static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);
        int sum = die1 + die2;

        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
        return sum;
    }

    public static int wagerPlacement(int bankBalance) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a wager");
        int wager = scanner.nextInt();

        if(!(wager <= bankBalance)) {
            System.out.println("Reenter wager");
            wager = scanner.nextInt();
        }
        return wager;
    }

    public static void chatter() {
        String[] chatter = {"Oh, you're going for broke, huh?", "Aw c'mon, take a chance!", "You're up big. Now's the time to cash in your chips!"};
        SecureRandom chatterString = new SecureRandom();

        int k = chatterString.nextInt(3);
        System.out.println(chatter[k]);
    }
}
