package chapter7.whotcards.exceptionss;

public class CardGameException extends RuntimeException{
    public CardGameException(String message) {
        super(message);
    }
}
