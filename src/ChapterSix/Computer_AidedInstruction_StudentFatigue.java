/*
As computer costs decline, it becomes feasible for every student, regardless of economic circumstance,
to have a computer and use it in school. This creates exciting possibilities for improving the
educational experience of all students worldwide, as suggested by the next five exercises. [Note:
Check out initiatives such as the One Laptop Per Child Project (www.laptop.org). Also, research
“green” laptops—what are some key “going green” characteristics of these devices? Look into the
Electronic Product Environmental Assessment Tool (www.epeat.net), which can help you assess
the “greenness” of desktops, notebooks and monitors to help you decide which products to purchase.]

 6.36 (Computer-Assisted Instruction: Reducing Student Fatigue) One problem in CAI environments is
student fatigue. This can be reduced by varying the computer’s responses to hold the student’s attention.
Modify the program of Exercise 6.35 so that various comments are displayed for each answer as follows:
Possible responses to a correct answer:
Very good!
Excellent!
Nice work!
Keep up the good work!
Possible responses to an incorrect answer:
No. Please try again.
Wrong. Try once more.
Don't give up!
No. Keep trying.
Use random-number generation to choose a number from 1 to 4 that will be used to select one of the four
appropriate responses to each correct or incorrect answer. Use a switch statement to issue the responses.
 */

package ChapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class Computer_AidedInstruction_StudentFatigue {
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
