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
