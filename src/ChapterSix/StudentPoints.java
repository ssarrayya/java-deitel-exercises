package ChapterSix;

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
