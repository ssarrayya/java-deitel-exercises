/*
4.18 (Credit Limit Calculator) Develop a Java application that determines whether any of several
department-store customers has exceeded the credit limit on a charge account. For each customer,
the following facts are available:
a) account number
b) balance at the beginning of the month
c) total of all items charged by the customer this month
d) total of all credits applied to the customer’s account this month
e) allowed credit limit

The program should input all these facts as integers, calculate the new balance (= beginning balance
+ charges – credits), display the new balance and determine whether the new balance exceeds the
customer’s credit limit. For those customers whose credit limit is exceeded, the program should display the message "Credit limit exceeded".
 */

package ChapterFour;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int accountNumber;
        int balance;
        int totalCharges;
        int totalCredits;
        int creditLimit;

        System.out.println("Enter customer's account number: ");
        accountNumber = input.nextInt();

        System.out.println("Enter customer's beginning balance: ");
        balance = input.nextInt();

        System.out.println("Enter total of all items charged by customer this month: ");
        totalCharges = input.nextInt();

        System.out.println("Enter total of all credits applied to the customer’s account this month: ");
        totalCredits = input.nextInt();

        System.out.println("Enter credit limit applicable to customer: ");
        creditLimit = input.nextInt();

        while (creditLimit > balance) {
            balance += totalCredits - totalCharges;
            System.out.println("The customer's new balance is " + balance);
        }

        if(balance > creditLimit)
            System.out.println("Credit Limit Exceeded!");
    }
}
