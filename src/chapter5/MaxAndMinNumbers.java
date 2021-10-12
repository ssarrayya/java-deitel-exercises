package chapter5;

import java.util.Scanner;

public class MaxAndMinNumbers {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        int firstRandomNumber;
        int randomNumber = 0;

        System.out.println("Enter a number: ");
        firstRandomNumber = userInput.nextInt();

        while(randomNumber <= 5){
            System.out.println("Enter a number: ");
            randomNumber = userInput.nextInt();

            if(firstRandomNumber > randomNumber ){
                System.out.println(firstRandomNumber + " is the greatest");
            }
            else{
                System.out.println(randomNumber + " is the greatest");
            }

            randomNumber++;
        }
    }
}
