package chapter4;

public class KataTest {
    public static void main(String[] args) {

        Kata tuesdayKata = new Kata();

        System.out.println("The average is " + tuesdayKata.calculateAverage(26, 15, 7));

        System.out.println("The student grade is " +tuesdayKata.calculateGrade(56));

        System.out.println("The number is even is " + tuesdayKata.isEven(6));

        System.out.println("The number is prime is " + tuesdayKata.isPrimeNumber(257983783));
    }
}

