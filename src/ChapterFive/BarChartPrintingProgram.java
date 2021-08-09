package ChapterFive;

import java.util.Scanner;

public class BarChartPrintingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();
        int fourthNumber = input.nextInt();
        int fifthNumber = input.nextInt();

        if(firstNumber >= 1 && firstNumber <= 30) {
            for(int i = 0; i < firstNumber; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        if(secondNumber >= 1 && secondNumber <= 30) {
            for(int i = 0; i < secondNumber; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        if(thirdNumber >= 1 && thirdNumber <= 30) {
            for(int i = 0; i < thirdNumber; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        if(fourthNumber >= 1 && fourthNumber <= 30) {
            for(int i = 0; i < fourthNumber; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        if(fifthNumber >= 1 && fifthNumber <= 30) {
            for(int i = 0; i < fifthNumber; i++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
