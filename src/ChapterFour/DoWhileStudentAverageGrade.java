package ChapterFour;

import java.util.Scanner;

public class DoWhileStudentAverageGrade {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int studentGrade;
        int totalGrade = 0;
        int numberOfGrades = 0;

        do{
            System.out.print("Enter student grade:  ");
            studentGrade = input.nextInt();
            totalGrade += studentGrade;

            numberOfGrades++;
        }
        while(numberOfGrades < 10);

        System.out.print(totalGrade);

        double averageGrade = totalGrade / (numberOfGrades * 1.0);
        System.out.println(averageGrade);

    }


}
