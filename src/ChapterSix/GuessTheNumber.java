package ChapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        SecureRandom srd = new SecureRandom();
        int randomNumber = 1 + srd.nextInt(1000);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 1000");
        int userGuess = scanner.nextInt();

        while(userGuess != randomNumber){
            if(userGuess >= randomNumber){
                System.out.println("Too high. Try again.");
            } else if (userGuess <= randomNumber){
                System.out.println("Too low. Try again.");
            }

            System.out.println("Guess a number between 1 and 1000");
            userGuess = scanner.nextInt();
        }

        if(userGuess == randomNumber) {
            System.out.println("Congratulations! You guessed the number");
        }
    }
}
