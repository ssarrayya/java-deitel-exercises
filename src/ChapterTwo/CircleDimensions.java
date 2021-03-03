package ChapterTwo;

import java.util.Scanner;

public class CircleDimensions{ 
	public static void main(String[] args){
		
		int radius;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter radius of circle :");
		radius = input.nextInt();

		int diameter = 2 * radius;
		System.out.println("The diameter is " + diameter);

		double circumference = 2 * Math.PI * radius;
		System.out.println("The circumference is " + circumference);

		double area = Math.PI * radius * radius;
		System.out.println("The area is " + area);
	}


}