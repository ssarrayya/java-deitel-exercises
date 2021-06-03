package ChapterTwo;

import java.util.Scanner;

public class CircleDimensions{ 
	public static void main(String[] args){
		
		int radius;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter radius of circle :");
		radius = input.nextInt();

		System.out.printf("%s%d%n", "The diameter is ", 2 * radius);
		System.out.printf("%s%f%n", "The circumference is ", 2 * Math.PI * radius);
		System.out.printf("%s%f%n", "The area is ", Math.PI * radius * radius);
	}
}