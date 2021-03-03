package ChapterTwo;

import java.util.Scanner;

public class BmiCalculator{
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		double weightInKilograms;
		double heightInMeters;
		double bodyMassIndex; 

		System.out.println("Enter weight in kilograms: ");
		weightInKilograms = input.nextDouble();

		System.out.println("Enter height in meters: ");
		heightInMeters = input.nextDouble();
		
		bodyMassIndex = weightInKilograms / (heightInMeters * heightInMeters);
		System.out.println("Your BMI is " + bodyMassIndex);
		
		System.out.println("\n BMI Values \n Underweight: less than 18.5 \n Normal:     between 18.5 and 24.9 \n Overweight:  between 25 and 29.9 \n Obese:    30 or greater");
		

	}
}