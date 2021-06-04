package ChapterFour;

import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int number;
        int largest = 0;
        int secondLargest = 0;

        while(counter <= 10) {
            System.out.println("Enter a number: ");
            number = input.nextInt();

            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else {
                secondLargest = number;
            }
            counter++;
        }
        System.out.println("The second largest number is " + secondLargest);
        System.out.println("The largest number is " + largest);
    }
}
