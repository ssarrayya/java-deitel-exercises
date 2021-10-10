package chapter2;

import java.util.Scanner;

public class GuessNumber{

	public static void main(String [] args){

		Scanner input = new Scanner(System.in);

		int numberToGuess = 21;
		int number;
		
		System.out.print("Guess number: ");
		number = input.nextInt();
		

		if (number < numberToGuess) 
			System.out.printf("You are wrong, number is greater than", number);
		
		if (number == numberToGuess) 
			System.out.printf("You won!");

		if (number > numberToGuess) 
			System.out.printf("You are wrong, number is lesser than", number);

	}

}