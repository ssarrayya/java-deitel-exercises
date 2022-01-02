package hackerranksolutions.thirtydaysofcode.day14;

/*
Scope
Link to problem: https://www.hackerrank.com/challenges/30-scope/problem?isFullScreen=true
 */

import java.util.Scanner;

public class Day14 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] elements = new int[size];
        while(input.hasNext()) {
            for(int i = 0; i < size; i++) {
                elements[i] = input.nextInt();
            }
        }
        Difference diff = new Difference(elements);
        diff.computeDifference();
    }
}

class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] array) {
        this.elements = array;
    }

    public void computeDifference() {
        maximumDifference = Math.abs(elements[0] - elements[1]);
        for(int i = 0; i < elements.length; i++) {
            for(int j = i + 1; j < elements.length; j++) {
                if (maximumDifference < Math.abs(elements[i] - elements[j])){
                    maximumDifference = Math.abs(elements[i] - elements[j]);
                }
            }
        }
        System.out.println(maximumDifference);
    }
}
