package Assignments;

import java.util.Scanner;

public class TemperatureConversion{
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		double celsius;
		double fahrenheit;

		System.out.println("Enter a degree in celsius: " );
		celsius = input.nextDouble();

		fahrenheit = (9/5) * celsius + 32;
		System.out.println(celsius + " Celsius is "+ fahrenheit +" Fahrenheit");
	}



}