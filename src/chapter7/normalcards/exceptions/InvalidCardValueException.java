package chapter7.normalcards.exceptions;

public class InvalidCardValueException extends CardGameException{

    public InvalidCardValueException(String message) {
        super(message);
    }
}
