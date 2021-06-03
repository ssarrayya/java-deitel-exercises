package ChapterTwo;

import java.util.Scanner;

public class OddEven{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int userNumber;
		System.out.print("Enter an number: ");
		userNumber = input.nextInt();
		
		if((userNumber % 2) == 0)
			System.out.println("This is an even number");

		if((userNumber % 2) != 0)
			System.out.println("This is an odd number");
	}

}