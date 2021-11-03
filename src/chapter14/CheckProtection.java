package chapter14;

import java.util.Scanner;

public class CheckProtection {
    private static String protectedFormat = "*********";

    public static String toCheckProtectedFormat(String input) {
        StringBuilder sb = new StringBuilder();
        if(input.length() <  protectedFormat.length()) {
            int remainingChars = protectedFormat.length() - input.length();
            for(int i = 0; i < remainingChars; i++) {
                sb.append("*");
            }
            sb.append(input);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter paycheck:");
        String input = scanner.nextLine();

        if(input.matches("[0-9.,]+"))
            System.out.println(toCheckProtectedFormat(input));
    }
}
