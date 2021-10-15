package chapter11.beansbusiness.exceptions;

public class MoneyException extends IllegalArgumentException{
    public MoneyException(String s) {
        super(s);
    }
}
