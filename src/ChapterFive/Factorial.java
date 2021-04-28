package ChapterFive;

public class Factorial {
    public static void main(String[] args) {
        for(int number = 1; number < 21; number++) {
            long factorial = 1;
            for(int i = 1; i <= number; ++i) {
                factorial = factorial * i;
            }
            System.out.println(factorial +  " ");
        }
    }
}
