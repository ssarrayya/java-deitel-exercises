package chapter7.normalcards.exceptions;

public class StackUnderflowException extends CardGameException{
    public StackUnderflowException(String message) {
        super(message);
    }
}
