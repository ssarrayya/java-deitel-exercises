package hackerranksolutions.thirtydaysofcode.day16;

/*
Exceptions - String to Integer
Link to problem: https://www.hackerrank.com/challenges/30-exceptions-string-to-integer/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day16 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();

        bufferedReader.close();

        stringToInteger(S);
    }

    public static void stringToInteger(String aString) {
        try {
            System.out.print(Integer.parseInt(aString));
        } catch(NumberFormatException e) {
            System.out.print("Bad String");
        }
    }
}
