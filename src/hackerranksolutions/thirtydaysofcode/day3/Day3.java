package hackerranksolutions.thirtydaysofcode.day3;

/*
Intro to conditional statements
LInk to problem: hackerrank.com/challenges/30-conditional-statements/problem?isFullScreen=true
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

//         If  is odd, print Weird
// If  is even and in the inclusive range of  to , print Not Weird
// If  is even and in the inclusive range of  to , print Weird
// If  is even and greater than , print Not Weird

        if(N >= 1 && N <= 100) {
            if(N % 2 != 0) {
                System.out.println("Weird");
            }
            else if(N % 2 == 0 && N >= 2 && N <= 5) {
                System.out.println("Not Weird");
            }
            else if(N % 2 == 0 && N >= 6 && N <= 20) {
                System.out.println("Weird");
            }
            else if(N % 2 == 0 && N > 20) {
                System.out.println("Not Weird");
            }
        }
    }
}
