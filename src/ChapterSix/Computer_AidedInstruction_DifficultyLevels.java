/*
As computer costs decline, it becomes feasible for every student, regardless of economic circumstance,
to have a computer and use it in school. This creates exciting possibilities for improving the
educational experience of all students worldwide, as suggested by the next five exercises. [Note:
Check out initiatives such as the One Laptop Per Child Project (www.laptop.org). Also, research
“green” laptops—what are some key “going green” characteristics of these devices? Look into the
Electronic Product Environmental Assessment Tool (www.epeat.net), which can help you assess
the “greenness” of desktops, notebooks and monitors to help you decide which products to purchase.]

 6.38 (Computer-Assisted Instruction: Difficulty Levels) Exercises 6.35–6.37 developed a
 computer-assisted instruction program to help teach an elementary school student multiplication.
 Modify the program to allow the user to enter a difficulty level. At a difficulty level of 1, the program
should use only single-digit numbers in the problems; at a difficulty level of 2, numbers as large as
two digits, and so on.
 */

package ChapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class Computer_AidedInstruction_DifficultyLevels {
    private static final SecureRandom digitGenerator = new SecureRandom();
    private static int studentAnswer;
    private static int correctAnswer;
    private static int firstDigit;
    private static int secondDigit;

    public static int firstDigit(int userInput) {
        if(userInput == 1) {
            return firstDigit = 1 + digitGenerator.nextInt(9);
        } else if (userInput == 2) {
            return firstDigit = 1 + digitGenerator.nextInt(99);
        } else return firstDigit = 1 + digitGenerator.nextInt(999);
    }

    public static int secondDigit(int userInput) {
        if(userInput == 1) {
            return secondDigit = 1 + digitGenerator.nextInt(9);
        } else if (userInput == 2) {
            return secondDigit = 1 + digitGenerator.nextInt(99);
        } else return secondDigit = 1 + digitGenerator.nextInt(999);
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
        Scanner in = new Scanner(System.in);
        System.out.println("""
                Enter
                1 for one-digit multiplication exercises
                2 for two-digit multiplication exercises
                3 for three-digit multiplication exercises
                """);
        int difficultyLevel = in.nextInt();
        int percentageAnswer = 0;

        if(difficultyLevel >= 1 && difficultyLevel <= 3) {
            for (int i = 1; i <= 10; i++) {
                firstDigit(difficultyLevel);
                secondDigit(difficultyLevel);
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

            if (percentageAnswer < 75) {
                System.out.println("Please ask your teacher for extra help.");
            } else {
                System.out.println("Congratulations, you are ready to go to the next level!");
            }
        }
    }


}
