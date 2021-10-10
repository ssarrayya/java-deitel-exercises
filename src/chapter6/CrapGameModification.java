/*
6.33 (Craps Game Modification) Modify the craps program of Fig. 6.8 to allow wagering.
Initialize variable bankBalance to 1000 dollars. Prompt the player to enter a wager. Check that wager
is less than or equal to bankBalance, and if it’s not, have the user reenter wager until a valid wager
is entered. Then, run one game of craps. If the player wins, increase bankBalance by wager and
display the new bankBalance. If the player loses, decrease bankBalance by wager,
display the new bankBalance, check whether bankBalance has become zero and, if so,
display the message "Sorry. You busted!" As the game progresses, display various messages to
create some “chatter,” such as "Oh, you're going for broke, huh?" or "Aw c'mon, take a chance!" or
"You're up big. Now's the time to cash in your chips!". Implement the “chatter” as a separate method
that randomly chooses the string to display.
 */

package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class CrapGameModification {
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
