package ChapterSix;

public class PrimeNumbers {
    public static boolean isPrime(int number) {
        if(number < 2) {
            return false;
        }
        if(number % 2 == 0 && number != 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        System.out.println(isPrime(2));
        for (int i = 2; i < 1000; i++) {
            if(isPrime(i)) {
                System.out.printf("%d%s%b%n", i, " is a prime number is ", isPrime(i));
            }
        }
    }
}
