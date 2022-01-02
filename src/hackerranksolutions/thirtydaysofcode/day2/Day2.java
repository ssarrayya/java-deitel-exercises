package hackerranksolutions.thirtydaysofcode.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Operators
Link to problem: https://www.hackerrank.com/challenges/30-operators/problem?isFullScreen=true
 */
public class Day2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Result.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
}

class Result {
    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Write your code here
        System.out.println(Math.round(meal_cost + ((1.0 *tip_percent / 100) * meal_cost) + ((1.0 * tax_percent / 100) * meal_cost)));
    }
}
