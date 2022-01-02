package hackerranksolutions.thirtydaysofcode.day11;

/*
2D Arrays
LInk to problem: https://www.hackerrank.com/challenges/30-2d-arrays/problem?isFullScreen=true
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Day11 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

        int[] sumArray = new int [16];
        int count = 0;
        int range = sumArray.length / 4;

        for(int i = 0; i < range; i++) {
            for(int j = 0; j < range; j++) {
                sumArray[count] = arr.get(i).get(j) + arr.get(i).get(j + 1)
                        + arr.get(i).get(j + 2) + arr.get(i + 1).get(j + 1)
                        + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1)
                        + arr.get(i + 2).get(j + 2);

                count++;
            }
        }

        Arrays.sort(sumArray);
        System.out.println(sumArray[sumArray.length - 1]);
    }
}
