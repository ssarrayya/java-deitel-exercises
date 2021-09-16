package ChapterSix;

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
