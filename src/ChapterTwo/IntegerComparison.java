package ChapterTwo;

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