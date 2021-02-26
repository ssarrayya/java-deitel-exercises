package ChapterFive;

import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberToGuess = 20;
        int userNumber;

        System.out.println("Enter a number: ");
        userNumber = input.nextInt();

        while(userNumber != numberToGuess){
            System.out.println("Guess again: ");
            userNumber = input.nextInt();

            if(userNumber < numberToGuess)
                System.out.printf("You are wrong, number is greater than %d%n", userNumber);
            else
                System.out.printf("You are wrong, number is less than %d%n", userNumber);
        }

        if(userNumber == numberToGuess){
            System.out.println("You are correct!");
        }

    }
}
