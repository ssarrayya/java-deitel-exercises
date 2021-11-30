package chapter14;

import java.util.Scanner;

public class WordEquivalentOfCheckAmount {
    private static String[] hundredsArray = {
            "ONE", "TWO", "THREE",
            "FOUR", "FIVE", "SIX",
            "SEVEN", "EIGHT", "NINE"
    };

    private static String[] tensArray = {
            "TWENTY", "THIRTY", "FOURTY",
            "FIFTY", "SIXTY", "SEVENTY",
            "EIGHTY", "NINETY"
    };

    private static String[] unitsArray = {
            "ONE", "TWO", "THREE", "FOUR", "FIVE",
            "SIX", "SEVEN", "EIGHT", "NINE", "TEN",
            "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN",
            "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN",
            "NINETEEN"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an amount less than $1000");
        double checkAmount = scanner.nextDouble();

        if(checkAmount < 1000) {
            String amount = String.valueOf(checkAmount);
            System.out.println(amountToWords(amount));
        }
    }

    private static String amountToWords(String amount) {
        char[] numberAmount = amount.toCharArray();
        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < numberAmount.length; i++) {
            sb.append(hundredsArray[numberAmount[0] - 1]).append("hundred");
//        }
        return sb.toString();
    }
}
