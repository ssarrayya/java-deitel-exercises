package hackerranksolutions.thirtydaysofcode.day9;

/*
Recursion
Link to problem: https://www.hackerrank.com/challenges/30-recursion/problem?isFullScreen=true
 */

import java.io.*;

public class Day9 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.factorial(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Result {
    public static int factorial(int n) {
        // Write your code here
        if(n == 0 || n == 1) {
            return 1;
        } else return n * factorial(n -1);
    }
}
