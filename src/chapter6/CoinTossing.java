/*
6.29 (Coin Tossing) Write an application that simulates coin tossing. Let the program toss a coin
each time the user chooses the “Toss Coin” menu option. Count the number of times each side of
the coin appears. Display the results. The program should call a separate method flip that takes no
arguments and returns a value from a Coin enum (HEADS and TAILS). [Note: If the program realistically
simulates coin tossing, each side of the coin should appear approximately half the time.]

 */

package chapter6;

import java.util.Random;
import java.util.Scanner;


public class CoinTossing {
    public enum CoinFace {HEAD, TAIL}

    public static CoinFace flip() {
        Random rd = new Random();
        return CoinFace.values()[rd.nextInt(CoinFace.values().length)];
    }

    public static void main(String[] args) {
        int head = 0;
        int tail = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Press any number to toss coin or -1 to end");
        int userInput = input.nextInt();

        while(userInput != -1) {
            flip();

            if (flip() == CoinFace.HEAD) {
                head++;
            } else {
                tail++;
            }
            System.out.println("Press any number to toss coin or -1 to end");
            userInput = input.nextInt();
        }

        System.out.printf("%s%d%s%n", "Head shows up ", head, " times");
        System.out.printf("%s%d%s%n", "Tail shows up ", tail, " times");
    }
}
