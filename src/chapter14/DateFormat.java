package chapter14;

/*
14.19 (Printing Dates in Various Formats) Dates are printed in several common formats. Two of the more
common formats are
        04/25/1955 and April 25, 1955
Write an application that reads a date in the first format and prints it in the second format.
 */

import java.util.Scanner;

public class DateFormat {
    private static String[] months = {"January", "February", "March",
                        "April", "May", "June",
                        "July", "August", "September",
                        "October", "November", "December"};

    public static boolean validateDate(String date) {
        return date.matches("(\\d\\d)/(\\d\\d)/(\\d\\d|\\d\\d\\d\\d)");
    }

    public static void toWordFormat(String[] tokens) {
        int[] date = new int[3];

        for(int i = 0; i < tokens.length; i++) {
            date[i] = Integer.parseInt(tokens[i]);
        }

        System.out.println(months[date[0] - 1] + " " + date[1] + ", " + date[2]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a date in the format MM/DD/YYYY");

        String date = scanner.next();
        if(validateDate(date)) {
            String[] tokens = date.split("/");
            toWordFormat(tokens);
        } else {
            System.out.println("Date is not valid");
        }
    }
}
