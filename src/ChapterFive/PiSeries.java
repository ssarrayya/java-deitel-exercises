/*
5.20 (Calculating the Value of π) Calculate the value of π from the infinite series
Print a table that shows the value of π approximated by computing the first 200,000 terms of this
series. How many terms do you have to use before you first get a value that begins with 3.14159?
 */

package ChapterFive;

public class PiSeries {
    public void calculatePiSeries() {
        double pi = 4;
        System.out.printf("Term       Value%n");
        int power = 1;
        for ( ; power <= 200_000; power++){
            pi = pi + Math.pow(-1, power) * 4 / (1 + (power * 2));
            System.out.printf("%d       %f%n", power, pi);
        }
        System.out.println();
    }
}
