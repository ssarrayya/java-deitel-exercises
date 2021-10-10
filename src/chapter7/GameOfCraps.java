/*
7.18 (Game of Craps) Write an application that runs 1,000,000 games of craps (Fig. 6.8) and
answers the following questions:
a) How many games are won on the first roll, second roll, …, twentieth roll and after the
twentieth roll?
b) How many games are lost on the first roll, second roll, …, twentieth roll and after the
twentieth roll?
c) What are the chances of winning at craps? [Note: You should discover that craps is one
of the fairest casino games. What do you suppose this means?]
d) What is the average length of a game of craps?
e) Do the chances of winning improve with the length of the game?
 */

package chapter7;

import java.security.SecureRandom;
import java.util.Scanner;

public class GameOfCraps {
    private static final SecureRandom randomNumbers = new SecureRandom();

    private enum Status {NEW, CONTINUE, WON, LOST}

    public static void main(String[] args) {
        int myPoint = 0;
        Status gameStatus = Status.NEW;
        int sumOfDice = rollDice();
        int bankBalance = 1000;
        int wager = wagerPlacement(bankBalance);

        if (gameStatus == Status.NEW) {
            if (sumOfDice == 7 || sumOfDice == 11) {
                gameStatus = Status.WON;
            } else if (sumOfDice == 2 || sumOfDice == 3 || sumOfDice == 12) {
                gameStatus = Status.LOST;
            }
            gameStatus = Status.CONTINUE;
        } else {
            myPoint = sumOfDice;
            System.out.printf("Point is %d%n", myPoint);
        }

        while (gameStatus == Status.CONTINUE) {
            sumOfDice = rollDice(); // roll dice again
            // determine game status
            if (sumOfDice == myPoint) {
                gameStatus = Status.WON;
            } else if (sumOfDice == 7) {
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
        chatter();

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

        if (!(wager <= bankBalance)) {
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
