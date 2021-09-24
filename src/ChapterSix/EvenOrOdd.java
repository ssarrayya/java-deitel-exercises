/*
6.17 (Even or Odd) Write a method isEven that uses the remainder operator (%) to determine
whether an integer is even. The method should take an integer argument and return true if the
integer is even and false otherwise. Incorporate this method into an application that inputs a
sequence of integers (one at a time) and determines whether each is even or odd.
 */

package ChapterSix;

public class EvenOrOdd {
    public static boolean isEven(int number) {
        boolean isEven;
        isEven = number % 2 == 0;
        return isEven;
    }

    public static void main(String[] args) {
        System.out.println(isEven(4));
        System.out.println(isEven(12627));
        System.out.println(isEven(701));
    }
}
