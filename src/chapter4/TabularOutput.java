/*
4.22 (Tabular Output) Write a Java application that uses looping to print the following table of
values:

N   10*N    100*N   1000*N
1   10      100     1000
2   20      200     2000
3   30      300     3000
4   40      400     4000
5   50      500     5000
 */

package chapter4;

public class TabularOutput {
    public static void main(String[] args) {
        System.out.println("N    10 * N     100 * N      1000 * N");
        int value = 1;
        while(value <= 5){
            System.out.printf("%d      %d        %d          %d%n", value, 10 * value, 100 * value, 1000 * value);
            value++;
        }
    }

}
