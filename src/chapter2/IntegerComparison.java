/*
2.16 (Comparing Integers) Write an application that asks the user to enter two integers, obtains
them from the user and displays the larger number followed by the words "is larger". If the numbers are equal,
 print the message "These numbers are equal". Use the techniques shown in Fig. 2.15.
 */

package chapter2;

import java.util.Scanner;

public class IntegerComparison{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int x;
		int y;

		System.out.print("Enter a number: ");
		x = input.nextInt();
	
		System.out.print("Enter another number: ");
		y = input.nextInt();
		
		if(x > y)
			System.out.print("x is larger");

		if(y > x)
			System.out.print("y is larger");

		if(x == y)
			System.out.print("These numbers are equal");
	}






}