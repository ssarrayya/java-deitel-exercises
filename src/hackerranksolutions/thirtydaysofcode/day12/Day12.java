package hackerranksolutions.thirtydaysofcode.day12;

import java.util.Scanner;

/*
Inheritance
Link to problem: https://www.hackerrank.com/challenges/30-inheritance/problem
 */
public class Day12 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        String firstName = input.next();
        String lastName = input.next();
        int idNumber = input.nextInt();
        input.nextLine();
        int num = input.nextInt();
        input.nextLine();
        int[] scores = new int[num];
        while(input.hasNext()) {
            for(int i = 0; i < num; i++) {
                scores[i] = input.nextInt();
            }
        }

        Student sarah = new Student(firstName, lastName, idNumber, scores);
        System.out.println("Name: " + lastName + ", " + firstName);
        System.out.println("ID: " + idNumber);
        System.out.println("Grade: " + sarah.calculate());
    }
}

class Student{
    private String firstName;
    private String lastName;
    private int idNumber;
    private int[] array;

    public Student(String firstName, String lastName, int idNumber, int[] array) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.array = array;
    }

    public char calculate() {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        int average = sum / array.length;

        if(average >= 90 && average <= 100) {
            return 'O';
        } else if (average >= 40 && average < 55) {
            return 'D';
        } else if (average >= 55 && average < 70) {
            return 'P';
        } else if (average >= 70 && average < 80) {
            return 'A';
        } else if (average >= 80 && average < 90) {
            return 'E';
        } else return 'T';
    }
}
