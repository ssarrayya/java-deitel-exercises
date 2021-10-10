package chapter6;

import java.util.Scanner;

public class Kata {

    public int testDriller(int userInput) {

        Scanner input = new Scanner(System.in);
        userInput = input.nextInt();

        if (userInput >= 1 && userInput <= 4) {
            return userInput * 1500;

        } else if (userInput >= 5 && userInput <= 9) {
            return userInput * 1400;

        } else if (userInput >= 10 && userInput <= 29) {
            return userInput * 1200;

        } else if (userInput >= 30 && userInput <= 49) {
           return userInput * 1100;

        } else
            if (userInput >= 50 && userInput <= 99) {
            return userInput * 1000;

        } else if (userInput >= 100 && userInput <= 199) {
            return userInput * 900;

        } else if (userInput >= 200) {
            return userInput * 800;
        } else
            return 0;



    }
}
