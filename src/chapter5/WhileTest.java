package chapter5;

public class WhileTest{
    public static void main(String[] args) {
        int counter = 1;

        while(counter<20){
           System.out.printf("%d ", counter);
           counter++;
        }

        System.out.println();
        System.out.println("The counter is " + counter);
    }
}
