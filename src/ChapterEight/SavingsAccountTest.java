package ChapterEight;

public class SavingsAccountTest {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        SavingsAccount.modifyInterestRate(4);

        for (int i = 0; i < 12; i++) {
            System.out.printf("%s%2f%n", "New month balance after interest for saver 1 is ", saver1.calculateMonthlyInterest());
            System.out.printf("%s%2f%n", "New month balance after interest for saver 2 is ", saver2.calculateMonthlyInterest());
            System.out.println();
        }

        SavingsAccount.modifyInterestRate(5);

        System.out.printf("%s%2f%n", "New month balance after new 5% interest for saver 1 is ", saver1.calculateMonthlyInterest());
        System.out.printf("%s%2f%n", "New month balance after new 5% interest for saver 2 is ", saver2.calculateMonthlyInterest());

    }



}
