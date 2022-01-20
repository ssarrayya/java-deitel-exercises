package hackerranksolutions.thirtydaysofcode.day17;

/*
More Exceptions
Link to problem: hackerrank.com/challenges/30-more-exceptions/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
*/

import java.util.Scanner;

public class Day17 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();

        for(int i = 0; i < T; i++) {
            int n = input.nextInt();
            int p = input.nextInt();
            try {
                System.out.println(Calculator.power(n, p));
            } catch (IllegalArgumentException e) {
                System.out.println("n and p should be non-negative");
            }
        }
    }
}

class Calculator {
    public static int power(int n, int p) throws IllegalArgumentException{
        if(n < 0 || p < 0) throw new IllegalArgumentException();
        return (int) Math.pow(n, p);
    }
}
