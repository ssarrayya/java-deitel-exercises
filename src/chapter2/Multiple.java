/*
	2.26 (Multiples) Write an application that reads two integers, determines whether the first is a
		multiple of the second and prints the result. [Hint: Use the remainder operator.]
 */

package chapter2;


import java.util.Scanner;

public class Multiple{
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		int firstNumber;
		int secondNumber;	
		
		System.out.print("Enter a number: ");
		firstNumber = input.nextInt();

		System.out.print("Enter another number: ");
		secondNumber = input.nextInt();

		if(firstNumber % secondNumber == 0)
			System.out.print("secondNumber is a multiple of firstNumber");

		if(secondNumber % firstNumber == 0)
			System.out.print("firstNumber is a multiple of secondNumber");
	}


}