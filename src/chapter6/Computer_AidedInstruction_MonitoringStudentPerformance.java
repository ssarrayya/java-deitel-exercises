/*
As computer costs decline, it becomes feasible for every student, regardless of economic circumstance,
to have a computer and use it in school. This creates exciting possibilities for improving the
educational experience of all students worldwide, as suggested by the next five exercises. [Note:
Check out initiatives such as the One Laptop Per Child Project (www.laptop.org). Also, research
“green” laptops—what are some key “going green” characteristics of these devices? Look into the
Electronic Product Environmental Assessment Tool (www.epeat.net), which can help you assess
the “greenness” of desktops, notebooks and monitors to help you decide which products to purchase.]

 6.37 (Computer-Assisted Instruction: Monitoring Student Performance) More sophisticated
computer-assisted instruction systems monitor the student’s performance over a period of time. The
decision to begin a new topic is often based on the student’s success with previous topics. Modify
the program of Exercise 6.36 to count the number of correct and incorrect responses typed by the
student. After the student types 10 answers, your program should calculate the percentage that are
correct. If the percentage is lower than 75%, display "Please ask your teacher for extra help.",
then reset the program so another student can try it. If the percentage is 75% or higher, display
"Congratulations, you are ready to go to the next level!", then reset the program so another
student can try it.
 */

package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class Computer_AidedInstruction_MonitoringStudentPerformance {
    private static final SecureRandom digitGenerator = new SecureRandom();
    private static int studentAnswer;
    private static int correctAnswer;
    private static int firstDigit;
    private static int secondDigit;

    public static int firstDigit() {
        return firstDigit = 1 + digitGenerator.nextInt(9);
    }

    public static int secondDigit() {
        return secondDigit = 1 + digitGenerator.nextInt(9);
    }

    public static void displayQuestion() {
        System.out.println("How much is " + firstDigit + " times " + secondDigit + "?");
    }

    public static int basicMultiplication() {
        return correctAnswer = firstDigit * secondDigit;
    }

    public static int collectStudentAnswer() {
        Scanner input = new Scanner(System.in);
        return studentAnswer = input.nextInt();
    }

    public static void positiveComments() {
        int positiveComments = 1 + digitGenerator.nextInt(4);
        switch (positiveComments) {
            case 1 -> System.out.println("Very good!");
            case 2 -> System.out.println("Excellent!");
            case 3 -> System.out.println("Nice work!");
            case 4 -> System.out.println("Keep up the good work!");
        }
    }

    public static void negativeComments() {
        int negativeComments = 1 + digitGenerator.nextInt(4);
        switch (negativeComments) {
            case 1 -> System.out.println("No. Please try again.");
            case 2 -> System.out.println("Wrong. Try once more.");
            case 3 -> System.out.println("Don't give up!");
            case 4 -> System.out.println("No. Keep trying.");
        }
    }

    public static void compareAnswer() {
        if (studentAnswer == correctAnswer) {
            positiveComments();
        } else {
            negativeComments();
        }
    }

    public static void main(String[] args) {
        int percentageAnswer = 0;

        for (int i = 1; i <= 10; i++) {
            firstDigit();
            secondDigit();
            displayQuestion();
            collectStudentAnswer();
            basicMultiplication();
            compareAnswer();
            percentageAnswer += 10;
        }

        while (studentAnswer != correctAnswer) {
            collectStudentAnswer();
            compareAnswer();
            percentageAnswer -= 10;
        }
        System.out.println(percentageAnswer);

        if(percentageAnswer < 75) {
            System.out.println("Please ask your teacher for extra help.");
        } else {
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
    }
}
