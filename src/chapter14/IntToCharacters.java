package chapter14;

/*
14.15 (Converting int Values to Characters) Write an application that inputs an integer code for a character
and displays the corresponding character. Modify this application so that it generates all possible three-digit
codes in the range from 000 to 255 and attempts to print the corresponding characters.
 */

//import java.util.Scanner;

public class IntToCharacters {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number from 0 to 255");
//        int intValue = scanner.nextInt();
//
//        if (intValue >= 0 && intValue <= 255) System.out.println((char) intValue);

        for (int i = 0; i <= 255; i++) {
            System.out.println((char) i);
        }
    }
}
