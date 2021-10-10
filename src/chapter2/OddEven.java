/*25 (Odd or Even) Write an application that reads an integer and determines
		and prints whether it’s odd or even. [Hint: Use the remainder operator.
		An even number is a multiple of 2. Any multiple of 2 leaves a remainder of 0 when divided by 2.]*/

package chapter2;

import java.util.Scanner;

public class OddEven{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int userNumber;
		System.out.print("Enter an number: ");
		userNumber = input.nextInt();
		
		if((userNumber % 2) == 0)
			System.out.println("This is an even number");

		if((userNumber % 2) != 0)
			System.out.println("This is an odd number");
	}

}