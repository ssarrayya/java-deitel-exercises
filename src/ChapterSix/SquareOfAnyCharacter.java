package ChapterSix;

import java.util.Scanner;

public class SquareOfAnyCharacter {
    public static void printSquare(int length, char fillCharacter){
        for(int i = 1; i <= length; i++){
            for(int s = length; s > 0; s--){
                System.out.print(fillCharacter);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char fillCharacter = input.next().charAt(0);
        printSquare(4, fillCharacter);
    }
}
