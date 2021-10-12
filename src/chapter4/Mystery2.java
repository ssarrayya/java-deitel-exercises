/*
4.25 What does the following program print?
 */

package chapter4;

public class Mystery2 {
    public static void main(String[] args) {
        int count = 1;
        while (count <= 10) {
            System.out.println(count % 2 == 1 ? "****" : "++++++++");
            ++count;
        }
    }
}
