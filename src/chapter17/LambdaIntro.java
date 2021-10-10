package chapter17;

import java.util.stream.IntStream;

public class LambdaIntro {
    public static void main(String[] args) {
        System.out.printf("Sum of even numbers from 2 through 20 is: %d%n",
                IntStream.rangeClosed(1, 10)
                         .map((int x) -> x * 2)
                         .sum());
    }
}
