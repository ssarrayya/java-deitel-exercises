package ChapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessTheNumberModification {
    public static void main(String[] args) {
        SecureRandom srd = new SecureRandom();
        int randomNumber = srd.nextInt(1000);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 1000");
        int userGuess = scanner.nextInt();

        int counter = 0;

        while(userGuess != randomNumber){
            if(userGuess >= randomNumber){
                System.out.println("Too high. Try again.");
            } else if (userGuess <= randomNumber){
                System.out.println("Too low. Try again.");
            }

            System.out.println("Guess a number between 1 and 1000");
            userGuess = scanner.nextInt();
            counter++;
        }

        if(userGuess == randomNumber) {
            System.out.println("Congratulations! You guessed the number");
        }

        if (counter < 10 && userGuess == randomNumber) {
            System.out.println("Either you know the secret or you got lucky!");
        } else if (counter == 10 && userGuess == randomNumber) {
            System.out.println("Aha! You know the secret!");
        } else if (counter > 10 && userGuess == randomNumber) {
            System.out.println("You should be able to do better! Why should it take no more than 10 guesses?");
        }


    }
}
