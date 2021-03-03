package ChapterTwo;

import java.util.Scanner;

public class Combination{

	public static void main(String[] args){

		Scanner collector = new Scanner(System.in);
		
		int x;
		int y;
		int z;
		int sum;
		int avg;
		int product;

		System.out.print("Enter a number: ");
		x = collector.nextInt();

		System.out.print("Enter another number :");
		y = collector.nextInt();

		System.out.print("Enter a third number :");
		z = collector.nextInt();

		sum = x + y + z;
		System.out.printf("The sum is %d%n", sum);

		avg = (x + y + z)/ 3;
		System.out.printf("The average is %d%n", avg);

		product = x * y * z;
		System.out.printf("The product is %d%n", product);

		if(x > y)
			System.out.printf("x is larger %s%n", "y is smaller");
		
		if(y > x)
			System.out.printf("y is larger %s%n", "x is smaller");
	}















}