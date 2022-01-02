package hackerranksolutions.thirtydaysofcode.day4;

/*
Class vs. Instance
Link to problem: https://www.hackerrank.com/challenges/30-class-vs-instance/problem?isFullScreen=true
 */

import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        int x = 0;

        for(int i = 0; i < T; i++) {
            x = input.nextInt();
            if(x >= -5 && x <= 30) {
                Person person = new Person(x);
                person.amIOld(x);
                x += 3;
                person.amIOld(x);
                System.out.println();
            }
        }
    }
}

class Person {
    private int age;

    public Person(int initialAge) {
        if(initialAge < 0) {
            initialAge = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
        age = initialAge;
    }

    public int yearPasses() {
        return age++;
    }

    public void amIOld(int age) {
        if(age < 13) {
            System.out.println("You are young.");
        } else if(age >= 13 && age < 18) {
            System.out.println("You are a teenager.");
        } else System.out.println("You are old.");
    }
}

