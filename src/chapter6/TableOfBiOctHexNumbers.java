/*
6.34 (Table of Binary, Octal and Hexadecimal Numbers) Write an application that displays a
table of the binary, octal and hexadecimal equivalents of the decimal numbers in the range 1
through 256. If you aren’t familiar with these number systems, read online Appendix J first.
 */

package chapter6;

public class TableOfBiOctHexNumbers {
    public static void decimalToBinary(int decimal) {
        int[] binaryArray = new int[10000];
        int binaryIndex = 0;

        while(decimal > 0) {
            binaryArray[binaryIndex] = decimal % 2;
            decimal = decimal / 2;
            binaryIndex++;
        }
        for (int j = binaryIndex - 1; j >= 0; j--) {
            System.out.print(binaryArray[j]);
        }

        System.out.println();
    }

    public static void decimalToOctal(int decimal) {
        int[] octalArray = new int[5000];
        int octalIndex = 0;

        while(decimal > 0) {
            octalArray[octalIndex] = decimal % 8;
            decimal = decimal / 8;
            octalIndex++;
        }
        for (int j = octalIndex - 1; j >= 0; j--) {
            System.out.print(octalArray[j]);
        }
        System.out.println();
    }

    public static StringBuilder decimalToHexadecimal(int decimal) {
        int[] hexArray = new int[2000];
        StringBuilder hex = new StringBuilder();
        int hexIndex = 0;

        char[] hdChars= {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (decimal > 0) {
            hexArray[hexIndex] = decimal % 16;
            hex.insert(0, hdChars[hexArray[hexIndex]]);
            decimal = decimal / 16;
        }
        return hex;
    }

    public static void main(String[] args) {

        System.out.printf("%s%7s%15s%7s", "Decimal", "Binary", "Octal", "Hexadecimal");
        for (int i = 0; i < 20; i++) {
            System.out.print(i + "           ");
            decimalToBinary(i);
//            System.out.print("               ");
            decimalToOctal(i);
            System.out.print("               " + decimalToHexadecimal(i));
        }

    }



}
