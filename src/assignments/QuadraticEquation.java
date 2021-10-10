package assignments;

import java.util.Scanner;

public class QuadraticEquation{
	
	public static void main(String [] args){
	
		Scanner input = new Scanner(System.in);
		double x1;
		double x2;
		int a;
		int b;
		int c;
		int z;

		System.out.print("Enter coefficient of x * x: ");
		a = input.nextInt();

		System.out.print("Enter coefficient of x: ");
		b = input.nextInt();

		System.out.print("Enter coefficient of 1: ");
		c = input.nextInt();

		x1 = (- b + Math.sqrt(b * b - 4 * a * c))/ 2 *a;
		System.out.printf("The first root is: %.2f%n", x1);

		
		x2 = (- b - Math.sqrt(b * b - 4 * a * c))/ 2 * a;
		System.out.printf("The second root is: %.2f%n", x2);

		z = b * b - (4 * a * c);

		if(z > 0)
			System.out.println("The roots are real and distinct");

		if(z == 0)
			System.out.println("The roots are real and equal");

		if(z < 0)
			System.out.println("The roots are complex");

	}
}