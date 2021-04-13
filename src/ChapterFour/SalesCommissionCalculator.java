package ChapterFour;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int normalPay = 200;
        int grossSales;
        double totalEarning;

        System.out.println("Enter salesperson's gross sales: ");
        grossSales = input.nextInt();

        if(grossSales > 0) {
            totalEarning = normalPay + (0.09 * grossSales);
            System.out.println("Salesperson's total earning is " + totalEarning);
        }


    }
}
