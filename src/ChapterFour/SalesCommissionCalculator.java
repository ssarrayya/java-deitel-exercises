/*
4.19 (Sales Commission Calculator) A large company pays its salespeople on a commission basis.
The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5000, or a
total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
these items are as follows:
Item Value
1 239.99
2 129.75
3 99.95
4 350.89
Develop a Java application that inputs one salesperson’s items sold for last week and calculates and
displays that salesperson’s earnings. There’s no limit to the number of items that can be sold.
 */

package ChapterFour;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int normalPay = 200;
        int grossSales = 0;
        double totalEarning;
        int itemsSold = 1;

        System.out.println("Enter cost of items sold by salesperson: ");
        double itemCost = input.nextDouble();
        while(itemCost > 0) {
            System.out.println("Enter cost of items sold by salesperson: ");
            itemCost = input.nextDouble();
            grossSales += itemCost;
            itemsSold++;
        }
            totalEarning = normalPay + (0.09 * grossSales);
            System.out.println("Salesperson's total earning is " + totalEarning);
    }
}
