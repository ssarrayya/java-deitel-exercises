package hackerranksolutions.thirtydaysofcode.day1;

import java.util.Scanner;

/*
Data types
Link to problem: https://www.hackerrank.com/challenges/30-data-types/problem?isFullScreen=true
 */
public class Day1 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int i = 4;
        double d = 4.0;
        String s = "HackerRank";
        int a = scan.nextInt();
        double b = scan.nextDouble();
        scan.nextLine();
        String c = scan.nextLine();
        scan.close();

        System.out.println(i + a);
        System.out.printf("%.1f%n", (d + b));
        System.out.println(s + " " +c);
    }
}
