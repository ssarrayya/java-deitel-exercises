/*
7.20 (Total Sales) Use a two-dimensional array to solve the following problem: A company has
four salespeople (1 to 4) who sell five different products (1 to 5). Once a day, each salesperson passes
in a slip for each type of product sold. Each slip contains the following:
a) The salesperson number
b) The product number
c) The total dollar value of that product sold that day
Thus, each salesperson passes in between 0 and 5 sales slips per day. Assume that the information
from all the slips for last month is available. Write an application that will read all this information for
last month’s sales and summarize the total sales by salesperson and by product. All totals should be
stored in the two-dimensional array sales. After processing all the information for last month, display the
results in tabular format, with each column representing a salesperson and each row representing a particular product.
Cross-total each row to get the total sales of each product for last month.
Cross-total each column to get the total sales by salesperson for last month. Your output should
include these cross-totals to the right of the totaled rows and to the bottom of the totaled columns.
 */

package ChapterSeven;

import java.util.Scanner;

public class TotalSales {
    public static void main(String[] args) {
        /* Use a two-dimensional array to solve the following problem: A company has
four salespeople (1 to 4) who sell five different products (1 to 5). Once a day, each salesperson passes
in a slip for each type of product sold. Each slip contains the following:
a) The salesperson number
b) The product number
c) The total dollar value of that product sold that day
Thus, each salesperson passes in between 0 and 5 sales slips per day. Assume that the information
from all the slips for last month is available. Write an application that will read all this information for
last month’s sales and summarize the total sales by salesperson and by product. All totals should be
stored in the two-dimensional array sales. After processing all the information for last month, display the results in tabular format, with each column representing a salesperson and each row representing a particular product. Cross-total each row to get the total sales of each product for last month.
Cross-total each column to get the total sales by salesperson for last month. Your output should
include these cross-totals to the right of the totaled rows and to the bottom of the totaled columns. */

        int[][] sales = new int[4][5];

        Scanner input = new Scanner(System.in);
        int salespersonNumber;
        int productNumber;
        int productValue = 0;

        for(salespersonNumber = input.nextInt(); salespersonNumber < sales.length; salespersonNumber++) {
            for (productNumber = input.nextInt(); productNumber < sales[salespersonNumber].length; productNumber++){
                sales[salespersonNumber][productNumber] += productValue;
            }
        }


    }
}
