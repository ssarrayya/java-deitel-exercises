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
