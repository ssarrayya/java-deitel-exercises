package ClassTests;

import java.util.Scanner;

public class Palindrome{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		int userInput;
		int firstNumber;
		int secondNumber;
		int thirdNumber;
		int result;

		System.out.print("Enter first digit of three-digit number: ");
		firstNumber = input.nextInt();

		System.out.print("Enter second digit of three-digit number: ");
		secondNumber = input.nextInt();

		System.out.print("Enter third digit of three-digit number: ");
		thirdNumber = input.nextInt();
	
		if (firstNumber == thirdNumber)
			System.out.println("This is a palindrome");

		if (firstNumber != thirdNumber)
			System.out.println("This is not a palindrome");
	}

}
