package classtests;

import java.util.Scanner;

public class BitFlipper{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int number;

		System.out.print("Enter a number between 0 and 1: ");
		number = input.nextInt();

		if(number == 0)
			System.out.println(1);

		if(number == 1)
			System.out.println(0);
	}

}