//2.29
package chapter2;

public class IntegerValueofCharacter {

    public static void main(String[] args) {
        // Uppercase letters
        displayIntegerValue('A');
        displayIntegerValue('B');
        displayIntegerValue('C');

        // Lowercase letters
        displayIntegerValue('a');
        displayIntegerValue('b');
        displayIntegerValue('c');

        // Digits
        displayIntegerValue('0');
        displayIntegerValue('1');
        displayIntegerValue('2');

        // Special symbols
        displayIntegerValue('$');
        displayIntegerValue('*');
        displayIntegerValue('+');
        displayIntegerValue('/');

        // Blank character
        displayIntegerValue(' ');

    }

    public static void displayIntegerValue(char character) {
        System.out.printf("The character %c has the value %d%n", character, ((int) character));
    }

}
