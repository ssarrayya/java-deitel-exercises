package ChapterFive;

public class Factorials {
    public static void main(String[] args) {
        long factorial = 1;
        int number = 1;
        int counter = 0;

        while ((counter < number) && (number > 0) && (number <= 20)){

            factorial = factorial * counter;
            ++counter;
            System.out.println("The factorial of " + number + " is " + factorial);
        }

    }
}
