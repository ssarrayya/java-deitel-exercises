package chapter11.beansbusiness;

import java.util.Scanner;

public class ClientCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                    Enter 1 for full pack
                    Enter 2 for half pack
                    """);
        int quantity = scanner.nextInt();
        if(quantity < 1 || quantity > 2) {
            throw new IllegalArgumentException("Beans amount should be either 1 or 2");
        }

        double fullPackEstimate = 300;
        double halfPackEstimate = 150;

        BuyBeans buyBeans = new BuyBeans(quantity, 0);

        if(quantity == 1) {
            buyBeans.setAmount(fullPackEstimate);
        } else buyBeans.setAmount(halfPackEstimate);

        Messenger michael = new Messenger(0);
        michael.setAmount(buyBeans.getAmount());
        michael.isMoneySufficient();
    }
}
