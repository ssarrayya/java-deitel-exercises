package hackerranksolutions.thirtydaysofcode.day18;

/*
Queues and Stacks
Link to problem: https://www.hackerrank.com/challenges/30-queues-stacks/problem?isFullScreen=true
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Day18 {
    private static Stack<Character> stack = new Stack<>();
    private static Queue<Character> queue = new LinkedList<>();

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        char[] c = s.toCharArray();

        pushCharacter(c);
        enqueueCharacter(c);

        int notSame = 0;

        for(int i = 0; i < c.length; i++) {
            if(popCharacter() != dequeueCharacter()) {
                notSame++;
            }
        }

        if(notSame > 0) {
            System.out.println("The word, " + s + ", is not a palindrome.");
        } else System.out.println("The word, " + s + ", is a palindrome.");

    }

    public static void pushCharacter(char[] c) {
        for(char character : c) {
            stack.push(character);
        }
    }

    public static void enqueueCharacter(char[] c) {
        for(char character : c) {
            queue.add(character);
        }
    }

    public static char popCharacter() {
        return stack.pop();
    }

    public static char dequeueCharacter() {
        return queue.remove();
    }
}
