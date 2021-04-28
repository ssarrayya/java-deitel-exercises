package ChapterFour;

import java.util.Scanner;

public class FactorialOfNegativeNumbers {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a negative number: ");
        int n = userInput.nextInt();
        int factorial = 1;

        if(n < 0){
            for(int i = 1; i >= n; ++i){
                factorial = factorial * i;
            }
            System.out.println("The factorial of " + n + " is " + factorial);
        }
    }
}
