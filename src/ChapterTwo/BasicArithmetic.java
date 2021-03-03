package ChapterTwo;

import java.util.Scanner;

public class BasicArithmetic{

	public static void main(String[] args){

		Scanner collector = new Scanner(System.in);
		
		int a;
		int b;
		int sum;
		int product;
		int difference;
		int quotient;

		System.out.print("Enter a number: ");
		a = collector.nextInt();

		System.out.print("Enter another number: ");
		b = collector.nextInt();

		sum = a + b;
		System.out.printf("Sum is %d%n", sum);
		
		product = a * b;
		System.out.printf("Product is %d%n", product);

		difference = a - b;
		System.out.printf("Difference is %d%n", difference);

		quotient = a / b;
		System.out.printf("Quotient is %d%n", quotient);



	}








}