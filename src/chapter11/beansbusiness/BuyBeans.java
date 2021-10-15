package chapter11.beansbusiness;

public class BuyBeans {
    private int quantity;
    private double amount;

    public BuyBeans() {}

    public BuyBeans(int quantity, double amount) {
        this.quantity = quantity;
        this.amount =  amount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
