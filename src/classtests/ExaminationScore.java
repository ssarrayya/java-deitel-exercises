package classtests;

import java.util.Scanner;

public class ExaminationScore{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		double examScore;

		System.out.print("Enter a score: ");
		examScore = input.nextDouble();
		
		if(examScore >= 40)
			System.out.println("Student has passed");

		if(examScore < 40)
			System.out.println("Student failed");
		
		

	}

}