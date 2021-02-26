package ChapterFour;

import java.util.Scanner;

public class LoopAverage {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int studentGrade;
        int totalGrade = 0;
        int numberOfGrades = 0;


        while(numberOfGrades < 3){
            System.out.print("Enter student grade:  ");
            studentGrade = input.nextInt();
            totalGrade += studentGrade;

            numberOfGrades++;

        }
        //System.out.print(totalGrade);

        double averageGrade = totalGrade / (numberOfGrades * 1.0);
        System.out.println(averageGrade);

    }

}
