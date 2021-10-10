/*
6.30 (Guess the Number) Write an application that plays “guess the number” as follows: Your
program chooses the number to be guessed by selecting a random integer in the range 1 to 1000.
The application displays the prompt Guess a number between 1 and 1000. The player inputs a first
guess. If the player's guess is incorrect, your program should display Too high. Try again. or Too
low. Try again. to help the player “zero in” on the correct answer. The program should prompt the
user for the next guess. When the user enters the correct answer, display Congratulations. You
guessed the number!, and allow the user to choose whether to play again.
[Note: The guessing technique employed in this problem is similar to a binary search,
which is discussed in Chapter 19, Searching, Sorting and Big O.]
 */

package chapter6;

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
