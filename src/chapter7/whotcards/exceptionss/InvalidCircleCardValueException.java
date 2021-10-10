package chapter7.whotcards.exceptionss;

public class InvalidCircleCardValueException extends CardGameException{
    public InvalidCircleCardValueException(String message) {
        super(message);
    }
}
