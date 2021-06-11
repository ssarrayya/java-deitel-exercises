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
