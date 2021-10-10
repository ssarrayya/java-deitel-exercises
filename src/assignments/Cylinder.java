package assignments;

import java.util.Scanner;

public class Cylinder{
	public static void main(String[] args){

		Scanner collector = new Scanner(System.in);
		double radius;
		double length;
		double area;
		double volume;

		System.out.println("Enter the radius: ");
		radius = collector.nextDouble();

		System.out.println("Enter the length: ");
		length = collector.nextDouble();
		
		area = (2 * Math.PI * radius * length) + (2 * Math.PI * Math.PI);
		System.out.println("The area of the cylinder is " + area);

		volume = Math.PI * radius * radius * length;
		System.out.println("The volume of the cylinder is " + volume);
	}



}