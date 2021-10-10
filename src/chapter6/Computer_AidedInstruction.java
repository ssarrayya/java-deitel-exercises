/*
As computer costs decline, it becomes feasible for every student, regardless of economic circumstance,
to have a computer and use it in school. This creates exciting possibilities for improving the
educational experience of all students worldwide, as suggested by the next five exercises. [Note:
Check out initiatives such as the One Laptop Per Child Project (www.laptop.org). Also, research
“green” laptops—what are some key “going green” characteristics of these devices? Look into the
Electronic Product Environmental Assessment Tool (www.epeat.net), which can help you assess
the “greenness” of desktops, notebooks and monitors to help you decide which products to purchase.]

6.35 (Computer-Assisted Instruction) The use of computers in education is referred to as
computer-assisted instruction (CAI). Write a program that will help an elementary school student learn
multiplication. Use a SecureRandom object to produce two positive one-digit integers. The program
should then prompt the user with a question, such as
How much is 6 times 7?
The student then inputs the answer. Next, the program checks the student’s answer. If it’s correct,
display the message "Very good!" and ask another multiplication question. If the answer is wrong,
display the message "No. Please try again." and let the student try the same question repeatedly
until the student finally gets it right. A separate method should be used to generate each new question.
This method should be called once when the application begins execution and each time the user answers
the question correctly.
 */

package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class Computer_AidedInstruction {
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

    public static void compareAnswer() {
        if (studentAnswer == correctAnswer) {
            System.out.println("Very good!");
        } else {
            System.out.println("No. Please try again.");
        }
    }

    public static void main(String[] args) {
        firstDigit();
        secondDigit();
        displayQuestion();
        collectStudentAnswer();
        basicMultiplication();
        compareAnswer();

        while(studentAnswer == correctAnswer) {
            firstDigit();
            secondDigit();
            displayQuestion();
            collectStudentAnswer();
            basicMultiplication();
            compareAnswer();
        }

        while (studentAnswer != correctAnswer){
            collectStudentAnswer();
            compareAnswer();
        }
    }
}

