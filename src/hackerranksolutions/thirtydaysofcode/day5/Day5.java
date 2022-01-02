package hackerranksolutions.thirtydaysofcode.day5;

/*
Loops
Link to problem: https://www.hackerrank.com/challenges/30-loops/problem?isFullScreen=true
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        multiples(n);
    }

    public static void multiples(int n) {
        for(int i = 1; i <= 10; i++) {
            System.out.printf("%d%s%d%s%d%n", n, " x ", i, " = ", n * i);
        }
    }
}
