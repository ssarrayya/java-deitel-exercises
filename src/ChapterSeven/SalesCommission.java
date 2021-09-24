/*
7.10 (Sales Commissions) Use a one-dimensional array to solve the following problem:
A company pays its salespeople on a commission basis. The salespeople receive $200 per week plus 9% of
their gross sales for that week. For example, a salesperson who grosses $5,000 in sales
in a week receives $200 plus 9% of $5,000, or a total of $650. Write an application (using an array of counters)
that determines how many of the salespeople earned salaries in each of the following ranges (assume
that each salesperson’s salary is truncated to an integer amount):
a) $200–299
b) $300–399
c) $400–499
d) $500–599
e) $600–699
f) $700–799
g) $800–899
h) $900–999
i) $1,000 and over
Summarize the results in tabular format.
 */

package ChapterSeven;

import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        int[] salaryCounter = new int[9];
        Scanner input = new Scanner(System.in);
        int salesInput;

        do{
            System.out.println("Enter salesperson gross sale:");
            int grossSales = input.nextInt();
            int totalSalary = (int) (200 + 0.09 * grossSales);

            int caseVariable = totalSalary / 100;
            if (caseVariable > 10)
                caseVariable = 10;

            switch(caseVariable) {
                case 2 -> salaryCounter[0]++;
                case 3 -> salaryCounter[1]++;
                case 4 -> salaryCounter[2]++;
                case 5 -> salaryCounter[3]++;
                case 6 -> salaryCounter[4]++;
                case 7 -> salaryCounter[5]++;
                case 8 -> salaryCounter[6]++;
                case 9 -> salaryCounter[7]++;
                case 10 -> salaryCounter[8]++;
            }

            System.out.println("Enter 1 to input gross sale, press any other key to exit");
            salesInput = input.nextInt();
        } while (salesInput == 1);

        System.out.println("salary range" + "       number of people who earned in salary range" );
        System.out.printf("%s%d%n", "$200-299        ", salaryCounter[0]);
        System.out.printf("%s%d%n", "$300-399        ", salaryCounter[1]);
        System.out.printf("%s%d%n", "$400-499        ", salaryCounter[2]);
        System.out.printf("%s%d%n", "$500-599        ", salaryCounter[3]);
        System.out.printf("%s%d%n", "$600-699        ", salaryCounter[4]);
        System.out.printf("%s%d%n", "$700-799        ", salaryCounter[5]);
        System.out.printf("%s%d%n", "$800-899        ", salaryCounter[6]);
        System.out.printf("%s%d%n", "$900-999        ", salaryCounter[7]);
        System.out.printf("%s%d%n", "$1000- over     ", salaryCounter[8]);
    }
}
