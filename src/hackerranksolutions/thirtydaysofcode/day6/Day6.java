package hackerranksolutions.thirtydaysofcode.day6;

/*
Let's review
Link to problem: https://www.hackerrank.com/challenges/30-review-loop/problem?isFullScreen=true
 */

import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        String s = null;

        if(T >= 1 && T <= 10) {
            for( ; T >=0; T--) {
                s = input.nextLine();
                if(s.length() >= 2 &&  s.length() <= 10000) {
                    evenSpaceOdd(s);
                }
            }
        }
    }

    public static void evenSpaceOdd(String s) {
        char[] sArray = s.toCharArray();
        String newString = "";
        for(int i = 0; i < sArray.length; i += 2) {
            newString += sArray[i];
        }
        newString += " ";
        for(int i = 1; i < sArray.length; i += 2) {
            newString += sArray[i];
        }

        System.out.println(newString);
    }
}
