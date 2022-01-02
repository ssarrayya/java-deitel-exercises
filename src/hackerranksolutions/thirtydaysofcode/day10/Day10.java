package hackerranksolutions.thirtydaysofcode.day10;

/*
Binary Numbers
Link to problem: https://www.hackerrank.com/challenges/30-binary-numbers/problem?isFullScreen=true
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        String binaryString = toBinary(n);
        char[] characters = binaryString.toCharArray();
        int onesCounter = 1;

        for(int i = 0; i < characters.length; i++) {
            for(int j = i + 1; j < characters.length; j++) {
                if(characters[i] == '1' && characters[j] == '1') {
                    onesCounter++;
                }

            }
        }

        System.out.println(onesCounter);
    }

    public static String toBinary(int num) {
        String binary = "";
        while(num > 0) {
            binary += num % 2;
            num /= 2;
        }

        StringBuilder reverseBinary = new StringBuilder(binary).reverse();
        return reverseBinary.toString();
    }
}
