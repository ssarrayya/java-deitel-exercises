/*
4.24 (Validating User Input) Modify the program in Fig. 4.12 to validate its inputs.
For any input, if the value entered is other than 1 or 2, keep looping until the user enters a correct value.
 */

package ChapterFour;

import java.util.Scanner;

public class ValidatingUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        while (studentCounter <= 10){
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            int result = input.nextInt();
            if (result == 1 || result == 2) {
                if(result == 1) {
                    passes = passes + 1;
                } else {
                    failures = failures + 1;
                }
            } else {
                System.out.print("Enter result (1 = pass, 2 = fail): ");
                result = input.nextInt();
            }
            studentCounter = studentCounter + 1;
        }

        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);
        if (passes > 8)
            System.out.println("Bonus to instructor!");
    }
}
