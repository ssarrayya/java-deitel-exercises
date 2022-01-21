package hackerranksolutions.thirtydaysofcode.day19;

import java.util.ArrayList;
import java.util.Scanner;

public class Day19 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("I implemented: AdvancedArithmetic");
        Calculator calc = new Calculator();
        System.out.println(calc.divisorSum(n));
    }
}

interface AdvancedArithmetic {
    int divisorSum(int number);
}

class Calculator implements AdvancedArithmetic {
    @Override
    public int divisorSum(int number) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                if (number / i == i) {
                    list.add(i);
                } else {
                    list.add(i);
                    list.add(number / i);
                }
            }
        }

        int sum = 0;

        for(int num : list) {
            sum += num;
        }

        return sum;
    }
}
