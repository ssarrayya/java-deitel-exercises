/*
4.20 (Salary Calculator) Develop a Java application that determines the gross pay for each of
three employees. The company pays straight time for the first 40 hours worked by each employee
and time and a half for all hours worked in excess of 40. You’re given a list of the employees, their
number of hours worked last week and their hourly rates. Your program should input this information for each employee, then determine and display the employee’s gross pay. Use class Scanner to
input the data.
 */

package ChapterFour;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int employee = 1;
        int hourlyRate;
        int numberOfHoursWorked;
        double grossPay = 0;

        while(employee <= 3) {
            hourlyRate = input.nextInt();
            numberOfHoursWorked = input.nextInt();

            int numberOfExtraHoursWorked = numberOfHoursWorked - 40;
            grossPay = hourlyRate * 40 + (hourlyRate * 1.5 * numberOfExtraHoursWorked);

            employee++;
        }
        System.out.println("Employee's gross pay is " + grossPay);
    }
}
