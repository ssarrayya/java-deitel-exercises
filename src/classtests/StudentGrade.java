package classtests;

import java.util.Scanner;

public class StudentGrade{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		int grade;
		
		System.out.print("Enter student grade: ");
		grade = input.nextInt();

		if(grade >= 90)
			System.out.println("A");

		else if(grade < 90){
			if(grade >= 80)
				System.out.println("B");
		}
		
		else if(grade < 80){
			if(grade >= 70)
				System.out.println("C");
		}

		else if(grade < 70)
			System.out.println("F");
	}

}