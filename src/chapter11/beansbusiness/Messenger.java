package chapter11.beansbusiness;

import chapter11.beansbusiness.exceptions.MoneyException;

import java.util.Scanner;

public class Messenger {
    private double amount;

    public Messenger(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void isMoneySufficient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much beans will fill this pack?");
        double fillPack = scanner.nextDouble();
        if(fillPack <= amount) {
            System.out.println("Your hot beans is here!");
        } else throw new MoneyException("Money was not enough!");
    }
}
