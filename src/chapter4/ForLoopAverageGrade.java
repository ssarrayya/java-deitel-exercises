package chapter4;

import java.util.Scanner;

public class ForLoopAverageGrade {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int studentGrade;
        int totalGrade = 0;
        int numberOfGrades = 0;


        for( ; numberOfGrades < 10; numberOfGrades++){
            System.out.print("Enter student grade:  ");
            studentGrade = input.nextInt();
            totalGrade += studentGrade;

        }
        System.out.print("The total grade is " + totalGrade);

        double averageGrade = totalGrade / (numberOfGrades * 1.0);
        System.out.println("The average grade is " + averageGrade);

    }

}
