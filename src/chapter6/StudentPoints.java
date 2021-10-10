/*
6.28 Write a method qualityPoints that inputs a student’s average and returns 4 if it’s 90–100,
3 if 80–89, 2 if 70–79, 1 if 60–69 and 0 if lower than 60. Incorporate the method into an application
that reads a value from the user and displays the result.

 */

package chapter6;

import java.util.Scanner;

public class StudentPoints {
    public static void qualityPoints(int studentAverage) {
        if(studentAverage >= 90 && studentAverage <= 100) {
            System.out.printf("%d", 4); }
        else if(studentAverage >= 80 && studentAverage <= 89) {
            System.out.printf("%d", 3); }
        else if(studentAverage >= 70 && studentAverage <= 79) {
            System.out.printf("%d", 2); }
        else if(studentAverage >= 60 && studentAverage <= 69) {
            System.out.printf("%d", 1); }
        else if(studentAverage < 60) {
            System.out.printf("%d", 0); }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int studentAverage = input.nextInt();
        qualityPoints(studentAverage);
    }
}
