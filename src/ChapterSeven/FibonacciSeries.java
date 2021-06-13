package ChapterSeven;

public class FibonacciSeries {
    public static void fibonacci(int term) {
        //int[] fibonacciArray = new int[term];
        double[] fibonacciArray = new double[term];

        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;
         for(int i = 2; i < fibonacciArray.length; i++) {
             fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
         }
        System.out.println(fibonacciArray[term - 1]);
    }

    public static void main(String[] args) {
        //fibonacci(89243);//365744471 is the highest positive fibonacci number that can be displayed on system if array is made up of integers, displays negative numbers after 89243rd term
        fibonacci(1477);//1.3069892237633987E308 is highest fibonacci number that can be displayed on system if array of type double is used, displays infinity after 1477th term
    }
}
